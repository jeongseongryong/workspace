const http = require('http')
const url  = require('url')
const datasource = require('./datasource')
const studentService = require('./student-service')
const connection = datasource.getConnection()
const studentDao = require('./student-dao')
studentDao.setConnection(connection)
studentService.setStudentDao(studentDao)

const fs = require('fs')
const path = require('path')
const handlebars = require ('handlebars')

var template = null

var templatepath = path.join(__dirname, 'test05_5.html')
fs.readFile(templatepath, 'utf8', (err, scr) => {
  if(err) throw error

  template = handlebars.compile(scr)
})

const server = http.createServer(function(request, response) {
  if (request.url == '/favicon.ico') {
    response.end();
    return;
  }

  var urlInfo = url.parse(request.url, true)

  if (urlInfo.pathname != '/student/list.do') {
    response.writeHead(404, {
      'Content-Type' : 'text/plain;charset=UTF-8'
    })
    response.end('잘못된 URL 입니다.')
    return
  }

  var pageNo = parseInt(urlInfo.query.pageNo),
      pageSize = parseInt(urlInfo.query.pageSize)

  response.writeHead(200, {
    'Content-Type' : 'text/html;charset=UTF-8'
  })

studentService.list(pageNo,pageSize, function(results) {
  var data = {
    'students' : results
  }
    response.end(template(data));

  }, function(error) {
    response.write('<html><body>')
    response.write('<p>DB 오류</p>')
    response.write('</body></html>')
    response.end();
    throw error;
})

}) //createServer
server.listen(8888)

console.log("서버 실행 중...")
