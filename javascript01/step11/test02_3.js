/* 데이터 데이터 명령: update


*/



const mysql  = require('mysql');
const connection = mysql.createConnection({

  database: 'webappdb',
  user: 'webapp',
  password: '1111'
})


connection.connect()


connection.query('update memb set tel="2222-2222" where name="aaa"' , function(error, results) {
  console.log('결과를 가져왔음!')
  if (error) throw error;

console.log(results)
})

connection.end()
console.log('MySQL 서버와의 연결 끊기가 예약되었음!')
