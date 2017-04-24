/* HTTP 서버 만들기
*/
// 1) HTTP 모듈 로딩
const http = require('http')

// 2)http server 객체생성
//  파라미터는 클라이언트 요청을 들어왔을때 호출될 함수이다.
//  즉 클라이언트에서 요청이 들어오면 파라미터로 넘긴함수를 호출
const server = http.createServer(function(request, response) {
  console.log('클라이언트 요청이 들어왔네!')
})

// 3) 서버 실행
server.listen(8888)

console.log("서버 실행 중...")
