/* 주제: Mysql DBMS에 직접접속
 비지니스 로직을 분리하여 xxx-service.js
 */
const {app, BrowserWindow} = require('electron')
const path = require('path')

// URL 경로를 보다 쉽게 다루기 위한 모듈이다.
const url = require('url')

let win

app.on('ready', createWindow)

function createWindow() {
  win = new BrowserWindow({width: 800, height: 600})
  win.loadURL(url.format({
    protocol: 'file:',
    pathname: path.join(__dirname, 'index.html'),
    slashes: true
  }))
  // win.webContents.openDevTools() //웹 브라우저 개발창 도구를 띄움
}



//
