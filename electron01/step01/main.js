/* 주제: 윈도우 생성하기

*/

const {app} = require('electron')


app.on('ready', createWindow)

function createWindow() {
console.log('create the window...')
}
