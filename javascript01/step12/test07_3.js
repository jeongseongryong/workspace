/* 기존 코드에 새 서비스 추가 II


*/
const http = require('http')
const url = require('url')
const qs = require('querystring')

function get(request, response) {
  response.write('get 요청 처리'+'\n')
  response.write('name=' + request.query.name + '\n')
  response.write('age=' + request.query.age + '\n')
  response.write('tel=' + request.query.tel + '\n')
  response.end();
}

function post(request, response) {
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
}

function hello(request, response) {
  response.write('안녕하세욘!')
  response.end()
}
function notFound(request, response) {
  response.write('해당 Url을 지원하지않습니다.')
  response.end()
}
const server = http.createServer(function(request, response) {
  var urlInfo =url.parse(request.url, true)
  if(request.method == "GET"){
  request.query = urlInfo.query
}

response.writeHead(200, {
  'Content-Type' : 'text/plain;charset=UTF-8'
})

  if(urlInfo.pathname == '/get.do') {
    get(request, response)
} else if(urlInfo.pathname == '/post.do') {
    post(request, response)
} else if
  (urlInfo.pathname == '/hello.do') {
    hello(request, response)
} else {
  notFound(request, response)
}
  })

server.listen(8888)

console.log("서버 실행 중...")
