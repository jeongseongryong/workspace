"use strict"

module.exports = {
  setConnection(con) {
    this.connection = con
  },
/*


select m.mno, m.name, m.tel, m.email, t.hmpg
from tcher t inner join memb m on t.tno=m.mno
order by m.name asc
*/
  selectList(pageNo, successFn, errorFn) {
    this.connection.query(
      'select m.mno, m.name, m.tel, m.email, t.hmpg, t.fcbk \
      from tcher t inner join memb m on t.tno=m.mno  \
      order by m.name asc \
       limit ?, ?',
      [(pageNo - 1) * 3, 3],
      function(error, results) {
        if (error) {
          errorFn(error)
        } else {
          successFn(results)
        }
      }) // connection.query()
  },//selectList()

  countAll(successFn, errorFn) {
    this.connection.query(
      'select count(*) cnt from tcher',
      function(error, results) {
        if (error) {
          errorFn(error)
        } else {
          successFn(results)
        }
      }) //connection.query()
  },//countAll()

  selectOne(no, successFn, errorFn) {
    this.connection.query(
      'select m.mno, m.name, m.tel, m.email, t.hmpg, t.fcbk \
      from tcher t inner join memb m on t.tno=m.mno \
      where t.tno=?',
      [no],
      function(error, results) {
        if (error) {
          errorFn(error)
        } else {
          successFn(results[0])
        }
      }) // connection.query()
  },//selectOne()

  insert(teacher, successFn, errorFn) {
    this.connection.query(
      'insert into tcher(tno, hmpg, fcbk) values(?,?,?)',
      [ teacher.no, teacher.hmpg, teacher.fcbk],
      function(error, result) {
        if (error) {
          errorFn(error)
        } else {
          successFn(result)
        }
      }) //connection.query()
  }, //insert

  update(teacher, successFn, errorFn) {
    this.connection.query(
      'update tcher set hmpg=?, fcbk=? where tno=?',
      [teacher.hmpg, teacher.fcbk, teacher.no],
      function(error, result) {
        if (error) {
          errorFn(error)
        } else {
          successFn(result)
        }
      }) //connection.query()
  }, //update()

  delete(no, successFn, errorFn) {
    this.connection.query(
      'delete from tcher where tno=?',
      [no],
      function(error, result) {
        if (error) {
          errorFn(error)
        } else {
          successFn(result)
        }
      })
  }//delete()

}//exports
