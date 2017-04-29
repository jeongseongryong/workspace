
const express = require ('express')
const datasource = require('../util/datasource')
const teacherDao = require('../dao/teacher-dao')
const teacherService = require('../service/teacher-service')
const memberDao = require('../dao/member-dao')


const connection = datasource.getConnection()
teacherDao.setConnection(connection)
memberDao.setConnection(connection)
teacherService.setMemberDao(memberDao)
teacherService.setTeacherDao(teacherDao)

const router = express.Router()

router.get('/list.json', (request, response) => {
  var pageNo=1,
      pageSize = 3
  if (request.query.pageNo) {
    pageNo = parseInt(request.query.pageNo) // OGNL 객체.객체.객체
  }
  if (request.query.pageSize) {
    pageSize = parseInt(request.query.pageSize)
  }
  teacherService.list(pageNo,pageSize, function(results, totalCount) {
    response.json({'list': results, 'totalCount': totalCount})
  }, function(error) {
    response.status(200)
            .set('Content-Type', 'text/plain;charset=UTF-8')
            .end('error')
    console.log(error)
  })
}) // get

router.get('/detail.json', function(request, response) {
  var no = parseInt(request.query.no)
  teacherService.detail(no, function(result) {
    response.json(result)

  }, function(error) {
    response.status(200)
            .set('Content-Type', 'text/plain;charset=UTF-8')
            .end('error')
    console.log(error)
  })
}) //get

router.post('/update.json', function(request, response) {
   teacherService.update({
     no: request.body.no,
     name: request.body.name,
     tel: request.body.tel,
     email:request.body.email,
     password : '1111',
     homepage: request.body.hmpg,
     facebook: request.body.fcbk,
     twitter: request.body.twit

   }, function(result) {

     response.redirect({'result' : 'yes'})

}, function(error) {
  response.status(200)
          .set('Content-Type', 'text/plain;charset=UTF-8')
          .end('error')
  console.log(error)
  })
}) //post

router.get('/delete.json', function (request, response) {
  var no = parseInt(request.query.no)
  teacherService.delete(no, function(result) {
    response.redirect({'result' : 'yes'})
  }, function(error) {
    response.status(200)
            .set('Content-Type', 'text/plain;charset=UTF-8')
            .end('error')
    console.log(error)
  })
})


router.post('/add.json', function(request, response) {
   teacherService.insert({
     name: request.body.name,
     tel: request.body.tel,
     email:request.body.email,
     password : '1111',
     homepage: request.body.hmpg,
     facebook: request.body.fcbk,
     twitter: request.body.twit
   }, function(result) {

     response.redirect({'result' : 'yes'})

}, function(error) {
  response.status(200)
          .set('Content-Type', 'text/plain;charset=UTF-8')
          .end('error')
  console.log(error)
  })
}) //post



module.exports = router
