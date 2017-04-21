"use strict"
module.exports = {
  setTeacherDao(dao) {
    this.teacherDao = dao
  },

  setMemberDao(dao) {
    this.memberDao = dao
  },

    list(pageNo, success, error) {
      var obj = this
      this.teacherDao.selectList(pageNo, function(teacher) {
        obj.teacherDao.countAll(function(result) {
          success(teacher, result[0].cnt)
        }, error)
      }, error)
    },

    detail(no, success, error) {
      this.teacherDao.selectOne(no, success, error)
    },

    insert(teacher, success, error) {
      var obj = this
      this.memberDao.insert(teacher, function(result) {
        teacher.no = result.insertId
        obj.teacherDao.insert(teacher, success, error)
      }, error)
    },

    update(teacher, success, error) {
      var obj = this
      this.memberDao.update(teacher, function(result) {
        obj.teacherDao.update(teacher, success, error)
      }, error)
    },

    delete(no, success, error) {
      var obj = this
    this.teacherDao.delete(no, function(result) {
        obj.memberDao.delete(no, success, error)
      }, error)
    } //delete
  } //exports
