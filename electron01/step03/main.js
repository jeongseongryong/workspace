/* 주제: 생성된 윈도우에 HTML 파일을 로딩하기

*/
const {app, BrowserWindow} = require('electron')
const path = require('path')


let win

app.on('ready', createWindow)


function createWindow() {

win = new BrowserWindow({width: 800, height: 600})
//win.loadURL('http://www.naver.com')
 win. loadURL('file:///C:/workspace/electron01/step03/index.html')

}