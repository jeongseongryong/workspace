const mysql = require('mysql');

var connection = mysql.createConnection({
  database: 'webappdb',
  user: 'webapp',
  password: '1111'
})
console.log('MySQL 서버에 연결할 도구 생성완료')

connection.connect()
console.log('MySQL 서버와 연결됨')

connection.query('select mno, name, tel, email from memb' , function(error, results){
  console.log('결과 가져옴')
  if (error) throw error;

  for (var row of results) {
    console.log(row.mno, row.name, row.tel, row.email)
  }
})

connection.end()
console.log('연결 끝 예약')
