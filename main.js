/* 주제: Mysql DBMS에 직접접속 9

 */
const {app, BrowserWindow} = require('electron')
const path = require('path')
const url = require('url')

const datasource = require('./util/datasource')
const connection = datasource.getConnection()

const studentDao = require('./dao/student-dao')
studentDao.setConnection(connection)
const teacherDao = require('./dao/teacher-dao')
teacherDao.setConnection(connection)
const managerDao = require('./dao/manager-dao')
managerDap.setConnection(connection)
const memberDao =require('./dao/member-dao')
memberDao.setConnection(connection)

const studentService = require('./service/student-service')
studentService.setMemberDao(memberDao)
studentService.setStudentDao(studentDao)
const teacherService = require('./service/teacher-service')
teacherService.setMemberDao(memberDao)
teacherService.setTeacherDao(teacherDao)
const managerService = require('./service/manager-service')
teacherService.setMemberDao(memberDao)
teacherService.setManagerDao(managerDao)

global.studentService = studentService
global.teacherService = teacherService
global.managerService = managerService

let win

app.on('ready', createWindow)

function createWindow() {
  win = new BrowserWindow({width: 800, height: 600})
  win.loadURL(url.format({
    protocol: 'file:',
    pathname: path.join(__dirname, '../renderer/index.html'),
    slashes: true
  }))
  // win.webContents.openDevTools() //웹 브라우저 개발창 도구를 띄움
}



//
