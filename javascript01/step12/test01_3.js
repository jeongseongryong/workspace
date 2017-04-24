/* HTTP 서버 만들기 - single 스레드 방식
=>  한번 에 한 클라이언트 요청만 처리.
  즉한 클라이언트의 요청 처리가 끝낭만 다음클라이언트 요청을 처리한다.
=> 수 많은 사용자의 동시 요청을 처리하는 용도가 아님
    특정 한개의 서비스를 순차적으로 빠르게 처리할 필요가 있을떄 사용 
*/

const http = require('http')


const server = http.createServer(function(request, response) {
  console.log('클라이언트 요청이 들어왔네!')
setTimeout(function() {

  response.end();
},5000)


})

server.listen(8888)

console.log("서버 실행 중...")
