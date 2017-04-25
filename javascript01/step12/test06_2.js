/* Get 요청과 Post 요청의 데이터 다루기
=> post 요청 데이터는 요청 헤더이후에 전달된다.

*/
const http = require('http')
const url = require('url')
// name=%ED%99%8D%EA%B8%B8%EB%8F%99 문자열 분석
const qs = require('querystring')

const server = http.createServer(function(request, response) {
  var urlInfo =url.parse(request.url, true)
  if(urlInfo.pathname != '/post.do') {
    response.end()
    return
  }
  response.writeHead(200, {
    'Content-Type' : 'text/plain;charset=UTF-8'
  })

// 1) POST 요청으로 들어온 데이터를 저장할 변수 준비
var buf = ''
// 2) POST 요청 데이터를 읽을 떄 마다 'data' 이벤트가 발생하는데,
// 이 이벤트를 처리해야 한다.
//즉 데이터를 읽을 떄 마다, 그 읽은 데이터를 buf변수에 저장시킨다.
request.on('data', (data) => {
  buf += data
})
// POST 요청 데이터가 읽기를 마쳤으면 'end'

request.on('end', () => {

var params = qs.parse(buf)

    response.write('name=' + params.name + '\n')
    response.write('age=' + params.age + '\n')
    response.write('tel=' + params.tel + '\n')
    response.end();
  })

})
server.listen(8888)

console.log("서버 실행 중...")
