// MeMb 테이블 데이터 처리
// => DAO(Data Access Object)
"use strict"

const memberDao = {}

memberDao.insert =function(member, successFn, errorFn) {
  connection.query(
    'insert into memb(name,tel,email,pwd) values(?,?,?,password(?))',
    [ member.name, member.tel, member.email, member.password],
    function(error, result) {
      if (error) {
        errorFn(error)
      } else {
        successFn(result)
      }
  }) //connection.query()
} //insertStudent()
// 데이터 처리를 담당하는 자바스크립트
// => DAO(Data Access Object)



memberDao.insert= function(member, successFn, errorFn) {
  connection.query(
    'insert into memb(name,tel,email,pwd) values(?,?,?,password(?))',
    [ member.name, member.tel, member.email, member.password],
    function(error, result) {
      if (error) {
        errorFn(error)
      } else {
        successFn(result)
      }
  }) //connection.query()
} //insertStudent()



memberDao.update= function(member, successFn, errorFn) {
  connection.query(
    'update memb set name=?, tel=?, email=? where mno=?',
    [member.name, member.tel, member.email, member.no],
    function(error, result) {
      if (error) {
        errorFn(error)
      } else {
        successFn(result)
      }
})

} //updateMember()

memberDao.delete=function(no, successFn, errorFn) {
connection.query(
  'delete from memb where mno=?',
  [no],
  function(error, result) {
    if (error) {
      errorFn(error)
    } else {
      successFn(result)
    }
}) //connection.query()
} // deleteMember()