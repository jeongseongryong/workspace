/* Electron 모듈 사용하기

*/
const {app, BrowserWindow} = require('electron')



let win

app.on('ready', createWindow)


function createWindow() {

win = new BrowserWindow({width: 800, height: 600})
}
