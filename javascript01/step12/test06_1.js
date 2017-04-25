/* Get 요청과 Post 요청의 데이터 다루기
=> Get 요청 데이터는 url에서 값을 꺼내면된다.
1)test06_1.js를 실행하여 웹서버를 가동시킨다.
2)웹 블라우저에서 test06_1.html 파일을 로딩한다.
3)입력폼에 값을 입력한후 전송 버튼을 클릭한다.
4)test06_1.html의 응답 결과를 확인한다.
*/

const http = require('http')
const url = require('url')

const server = http.createServer(function(request, response) {
  var urlInfo =url.parse(request.url, true)
  if(urlInfo.pathname != '/get.do') {
    response.end()
    return
  }
  response.writeHead(200, {
    'Content-Type' : 'text/plain;charset=UTF-8'
  })

  response.write('name=' + urlInfo.query.name + '\n')
  response.write('age=' + urlInfo.query.age + '\n')
  response.write('tel=' + urlInfo.query.tel + '\n')
  response.end();
})

server.listen(8888)

console.log("서버 실행 중...")
