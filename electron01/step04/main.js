/* 주제: HTML 파일의 URL 경로를 쉽게 찾기

*/
const {app, BrowserWindow} = require('electron')
const path = require('path')

const url = require('url')

let win

app.on('ready', createWindow)

function createWindow() {
  win = new BrowserWindow({width: 800, height: 600})
  var loadlURL(url.format({
    protocol: 'file',
    pathname: path.join(__dirname, '/index.html') ,
    slashes: true
  }))

}
