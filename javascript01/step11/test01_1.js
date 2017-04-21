/* 데이터베이스 프로그래밍
=> Javascipt + NodeJS + DBMS(Mysql)

DBMS(database management System)
=>데이터를 전문적을 관리해주는 소프트웨어

SQL(stuctured Query Language)
=>데이터를 처리할 떄 DBMS에게 내리는 명령의 문법

NodeJS와 DBMS
=>특정 DBMS와 연결하여 SQL을 전달하고 결과를 받을 수 있는서드파티 모듈이 존재한다
  NodeJS에게 기본으로 제공하는 모듈은 아니다.
=>사용하려면 DBMS 제품에 맞는 모듈을 설치해야 한다.
*/

/* MySQL NodeJS 모듈 사용하기
1)모듈 설치
  >npm install masql*/

const mysql  = require('mysql');

// mySQL서버에 연결할 수행 도구 준비
var connection = mysql.createConnection({
  // host: 'localhost', //'192.168.0.39',    //기본 값:localhost
  // port: 3306,    //기본 값: 3306
  database: 'webappdb',
  user: 'webapp',
  password: '1111',
})

console.log('MySQl 서버에 연결할 도구 생성완료!')
// MySQL 서버와연결한다.

connection.connect()
console.log('MySQL 서버와 연결됨!')
// MySQL서버와 연결 끊기를 예약한다.

connection.end()
console.log('MySQL 서버와의 연결 끊기가 예약되었음!')
