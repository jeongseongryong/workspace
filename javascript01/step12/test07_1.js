/* 여러 URL 처리
=>조건문을 사용하여 URL을 구분한다.

*/
const http = require('http')
const url = require('url')
// name=%ED%99%8D%EA%B8%B8%EB%8F%99 문자열 분석
const qs = require('querystring')

const server = http.createServer(function(request, response) {
  var urlInfo =url.parse(request.url, true)
  
response.writeHead(200, {
  'Content-Type' : 'text/plain;charset=UTF-8'
})

  if(urlInfo.pathname == '/get.do') {
    response.write('get 요청 처리'+'\n')
    response.write('name=' + urlInfo.query.name + '\n')
    response.write('age=' + urlInfo.query.age + '\n')
    response.write('tel=' + urlInfo.query.tel + '\n')
    response.end();
} else if(urlInfo.pathname == '/post.do') {

var buf = ''

request.on('data', (data) => {
  buf += data
})

request.on('end', () => {

var params = qs.parse(buf)
    response.write('post 요청 처리'+'\n')
    response.write('name=' + params.name + '\n')
    response.write('age=' + params.age + '\n')
    response.write('tel=' + params.tel + '\n')
    response.end();
  })
} else {
  response.write('해당 Url을 지원하지않습니다.')
  response.end()
}
  })

server.listen(8888)

console.log("서버 실행 중...")
