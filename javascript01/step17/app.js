/* Express 프레임워크 적용 - AJAX 웹 프로그래밍 방식+ 템플릿 엔진
=> 서버에서 데이터를 받아서 UI생성할 때 직접 생성하지 않고,
   템플릿 엔진을 사용하여 UI를 생성한다.
=> 서버쪽 하고는 상관없다.
  클라이언트 UI만 적용하면 된다
*/
var express = require('express')
var bodyParser = require('body-parser')
var path = require('path')
var cons = require('consolidate')
// var handlebars = require('handlebars')

var app = express()
app.use(express.static('public'))
app.use(bodyParser.urlencoded({extended: false}))



app.use('/student', require('./control/student-control'))
app.use('/teacher', require('./control/teacher-control'))
app.use('/manager', require('./control/manager-control'))
app.use('/lecture', require('./control/lecture-control'))



app.listen(8888, function() {
  console.log('서버가 시작되었습니다.')
})
