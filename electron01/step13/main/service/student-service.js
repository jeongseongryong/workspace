"use strict"

function createStudentService(memberDao, studentDao) {
  return {
    list(pageNo, success, error) {
      studentDao.selectList(pageNo, function(students) {
        studentDao.countAll(function(result) {
          success(students, result[0].cnt)
        }, error)
      }, error)
    },

    detail(no, success, error) {
      studentDao.selectOne(no, success, error)
    },

    insert(student, success, error) {
      memberDao.insert(student, function(result) {
        student.no = result.insertId
        studentDao.insert(student, success, error)
      }, error)
    },

    update(student, success, error) {
      memberDao.update(student, function(result) {
        studentDao.update(student, success, error)
      }, error)
    },

    delete(no, success, error) {
      studentDao.delete(no, function(result) {
        memberDao.delete(no, success, error)
      }, error)
    }
    
  } //return
} // createStudentService
