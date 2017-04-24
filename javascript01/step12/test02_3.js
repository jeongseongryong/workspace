/* 클라이언트로 출력하기 - 응답 데이터의 콘텐츠 타입을 지정하기
=> 서버가 클라이언트에게 보내는 데이터가 어떤 형식인지
  HTTP 응딥 헤더를 통해 알려준다.
=> Constent-Type : text/plainl;chatset=UTF-8
*/

const http = require('http')


const server = http.createServer(function(request, response) {
  console.log('클라이언트 요청이 들어왔네!')


  response.writeHead(200, { // 응답헤더 지정
    'Content-Type' : 'text/html;charset=UTF-8'
  })

  response.write(
  '<html>\
  <head>\
    <title>테스트</title>\
  </head>\
  </body>\
    <h1>안녕하세요!</h1>\
  <body>\
  </html>')

  response.end();
})

server.listen(8888)

console.log("서버 실행 중...")
/*
서버에서 결과를 보내면 클라이언트 출력한다.
그러나,서버에서 보낸 데이터가 어떤 데이터인지 알지 못하기 때문에
한글을 출력할 때 꺠진다.
*/
