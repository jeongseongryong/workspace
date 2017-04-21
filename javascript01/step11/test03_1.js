/* IN-Parameter 활용
=> insert 나 update 할 떄 여러 개의 값을 지정하기 위해 문자열을 '+' 연산자를 사용하여
  문자열을 연결해야한다.
  이런 불편함을 없애기 위해 IN-Parameter 문법이나왔다.

*/



const mysql  = require('mysql');
const connection = mysql.createConnection({

  database: 'webappdb',
  user: 'webapp',
  password: '1111'
})


connection.connect()


connection.query('insert into memb(name, email, tel, pwd) values(?,?,?,?,password(?))',
  ["aaa", "aaa@test.comn","1111-1111", "1111"],
function(error, results) {
  console.log('결과를 가져왔음!')
  if (error) throw error;

console.log(results)
})

connection.end()
console.log('MySQL 서버와의 연결 끊기가 예약되었음!')
