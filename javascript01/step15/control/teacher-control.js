
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

router.get('/list.do', (request, response) => {
  var pageNo=1,
      pageSize = 3
  if (request.query.pageNo) {
    pageNo = parseInt(request.query.pageNo) // OGNL 객체.객체.객체
  }
  if (request.query.pageSize) {
    pageSize = parseInt(request.query.pageSize)
  }
  teacherService.list(pageNo,pageSize, function(results, totalCount) {
    var lastPageNo= parseInt(totalCount/ pageSize) + (((totalCount % pageSize) > 0) ? 1 : 0)
    response.setHeader('Content_Type' , 'text/html;charset=UTF-8')
    response.render('teacher/index', {
      'data': results,
      'pageNo': pageNo,
      'nextPageNo': pageNo +1,
      'prevPageNo' : pageNo -1,
      'disabledPrevBtn' : (pageNo == 1) ? 'disabled' : '',
      'disabledNextBtn' : (pageNo == lastPageNo) ? 'disabled' : ''
    })
  }, function(error){
    response.render('error', {
      'message' : '강사 목록 데이터 가져오는 중 오류가발생했습니다.'})
    console.log(error)
  })
}) // get

router.get('/detail.do', function(request, response) {
  var no = parseInt(request.query.no)
  teacherService.detail(no, function(result) {
    response.render('teacher/view', {
      'detail' : true,
      'data': result,

    })
  }, function(error) {
    response.render('error', {
      'message' : '강사 목록 데이터 가져오는 중 오류가 발생했습니다.'})
    console.log(error)
  })
}) //get

router.post('/update.do', function(request, response) {
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

     response.redirect('list.do')

}, function(error) {
  response.render('error', {
    'message' : '강사 데이터를 변경하는 중 오류가 발생했습니다.'})
  console.log(error)
  })
}) //post

router.get('/delete.do', function (request, response) {
  var no = parseInt(request.query.no)
  teacherService.delete(no, function(result) {
    response.redirect('list.do')
  }, function(error) {
  response.render('error', {
    'message' : '강사 데이터를 변경하는 중 오류가 발생했습니다.'})
  console.log(error)
  })
})

router.get('/form.do', function(request, response) {
  response.render('teacher/view')
})

router.post('/add.do', function(request, response) {
   teacherService.insert({
     name: request.body.name,
     tel: request.body.tel,
     email:request.body.email,
     password : '1111',
     homepage: request.body.hmpg,
     facebook: request.body.fcbk,
     twitter: request.body.twit
   }, function(result) {

     response.redirect('list.do')

}, function(error) {
  response.render('error', {
    'message' : '강사 데이터를 등록하는 중 오류가 발생했습니다.'})
  console.log(error)
  })
}) //post



module.exports = router
