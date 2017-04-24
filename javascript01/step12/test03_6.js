/* 요청 정보 다루기 -
계산기 서비스를 구현
요청 예)http://localhost:8888/calculator?a=100&b=200&op=-
출력 결과 예)
100 - 200 = -100
=> op에 들거갈 연산자: +, - ,* , / , %
*/

const http = require('http')

const url = require('url')


const server = http.createServer(function(request, response) {
  if(request.url == '/favicon.ico') {
    response.end();
    return;
  }

  console.log('클라이언트 요청이 들어왔네!')

  response.writeHead(200, { // 응답헤더 지정
    'Content-Type' : 'text/plain;charset=UTF-8'
  })

//  url 분석기 실행
var urlInfo = url.parse(request.url, true)
  /*var a = urlInfo.query.a
  var b = urlInfo.query.b
  console.log(a-b)
  console.log(a+b) %2B
  console.log(a*b)
  console.log(a/b)
  console.log(a%b)
*/

// URL에서 '?' 앞에 나오는 경로 http://localhost:8888은 제외
  if(urlInfo.pathname != '/claculator') {
    response.end('잘못된 URL 입니다.')
    return;
  }

var a =parseInt(urlInfo.query.a)
var a =parseInt(urlInfo.query.b)
var op=urlInfo.query.op
// url 은 항상 ASCII 코드값으로 표현해야 한다.
// 다른데이터는 URL 인코딩, 즉 아스키문자화 표현한다
// 그래서 + 문자는 %2B 라는 URL 인코딩하여 전달해야 한다.
//  % --> %25
// var result = 0
  /*switch (op) {
    case '+': result = a + b; break
    case '-': result = a - b; break
    case '*': result = a * b; break
    case '/': result = a / b; break
    case '%': result = a % b; break
  }
  response.write(a + ' ' + op + ' ' + b + ' = ' + result)
  response.end();
})
*/

// 클라이언트가 name 이라는 이름으로 보낸 값을 꺼낸다.



server.listen(8888)

console.log("서버 실행 중...")
