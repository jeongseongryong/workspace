const express = require ('express')
const datasource = require('../util/datasource')
const managerDao = require('../dao/manager-dao')
const managerService = require('../service/manager-service')
const memberDao = require('../dao/member-dao')


const connection = datasource.getConnection()
managerDao.setConnection(connection)
memberDao.setConnection(connection)
managerService.setMemberDao(memberDao)
managerService.setManagerDao(managerDao)

const router = express.Router()

router.get('/list.do', (request, response) => {
  var pageNo=1
      pageSize = 3;
  if (request.query.pageNo) {
    pageNo = parseInt(request.query.pageNo) // OGNL 객체.객체.객체
  }
  if (request.query.pageSize) {
    pageSize = parseInt(request.query.pageSize)
  }
  managerService.list(pageNo,pageSize, function(results, totalCount) {
    var lastPageNo= parseInt(totalCount/ pageSize) + (((totalCount % pageSize) > 0) ? 1 : 0)
    response.setHeader('Content_Type' , 'text/html;charset=UTF-8')
    response.render('manager/index', {
      'data': results,
      'pageNo': pageNo,
      'nextPageNo': pageNo +1,
      'prevPageNo' : pageNo -1,
      'disabledPrevBtn' : (pageNo == 1) ? 'disabled' : '',
      'disabledNextBtn' : (pageNo == lastPageNo) ? 'disabled' : ''
    })
  }, function(error){
    response.render('error', {
      'message' : '매니저 목록 데이터 가져오는 중 오류가발생했습니다.'})
    console.log(error)
  })
}) // get

router.get('/detail.do', function(request, response) {
  var no = parseInt(request.query.no)
  managerService.detail(no, function(result) {
    response.render('manager/view', {
      'detail' : true,
      'data': result,
      'checkedWorking' : (result.work == 'Y' ? 'checked' : '')
    })
  }, function(error) {
    response.render('error', {
      'message' : '학생 목록 데이터 가져오는 중 오류가 발생했습니다.'})
    console.log(error)
  })
}) //get

router.post('/update.do', function(request, response) {
   managerService.update({
     no: request.body.no,
     working:(request.body.workig == undefined ? 'N' : 'Y'),
     schoolName: request.body.schoolName,
     name: request.body.name,
     tel: request.body.tel,
     email:request.body.email,
     password : '1111',
     posi: request.body.posi,
     fax: request.body.fax,
     path: request.body.path
   }, function(result) {

     response.redirect('list.do')

}, function(error) {
  response.render('error', {
    'message' : '매니저 데이터를 변경하는 중 오류가 발생했습니다.'})
  console.log(error)
  })
}) //post

router.get('/delete.do', function (request, response) {
  var no = parseInt(request.query.no)
  managerService.delete(no, function(result) {
    response.redirect('list.do')
  }, function(error) {
  response.render('error', {
    'message' : '매니저 데이터를 변경하는 중 오류가 발생했습니다.'})
  console.log(error)
  })
})

router.get('/form.do', function(request, response) {
  response.render('manager/view')
})

router.post('/add.do', function(request, response) {
   managerService.insert({
     name: request.body.name,
     tel: request.body.tel,
     email:request.body.email,
     password : '1111',
     posi: request.body.posi,
     fax: request.body.fax,
     path: request.body.path

   }, function(result) {

     response.redirect('list.do')

}, function(error) {
  response.render('error', {
    'message' : '학생 데이터를 등록하는 중 오류가 발생했습니다.'})
  console.log(error)
  })
}) //post



module.exports = router
