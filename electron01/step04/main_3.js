/* 주제: HTML 파일의 경로를 쉽게 찾기

 */

const {app, BrowserWindow} = require('electron')
const path = require('path')

const url = require('url')

let win

app.on('ready', createWindow)

function createWindow() {
  win = new BrowserWindow({width: 800, height: 600})
  //win.loadURL('file:///C:/workspace/electron01/step03/index.html')
  //win.loadURL('file://' + __dirname + '/index.html')
  //win.loadURL(path.join('file://', __dirname, '/index.html'))
  var htmlURL = url.format({
    protocol: 'file',
    pathname: path.join(__dirname, 'index.html'),
    slashes: true
    
  })
  console.log(htmlURL)
  //함수로 넘길때는 (값,값,값 ) 이렇게 넘겼지만
  // urlObject 객체로 넘겨라
  win.loadURL(htmlURL)

}
