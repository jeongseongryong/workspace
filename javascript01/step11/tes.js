const mysql = require('mysql');

var connection = mysql.createConnection({
  database: 'webappdb',
  user: 'webapp',
  password: '1111'
})
console.log('MySQL 서버에 연결할 도구 생성완료')

connection.connect()
console.log('MySQL 서버와 연결됨')

connection.query('delete from memb where name="으우우"' , function(error, results){
  console.log('결과 가져옴')
  if (error) throw error;

console.log(results)
})

connection.end()
console.log('연결 끝 예약')
