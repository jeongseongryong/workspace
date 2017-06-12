"use strict"
const net = require('net')
window.$ = window.jQuery = require('jquery')
var host = $('#host'),
    port = $('#port'),
    connectBtn = $('#connectBtn'),
    closeBtn = $('closeBtn'),
    v1 = $('#v1'),
    v2 = $('#v2'),
    op = $('#op')

closeBtn.css('display', 'none')

var socket = new net.Socket()
// socket.setTimeout(500)

socket.on('connect', () => {
  connectBtn.css('display', 'none')
  closeBtn.css('display', '')
})

socket.on('data', (data) => {
  $('#response').val(data.toString())
})

socket.on('error', (error) => {
  alert(error.message)
})

socket.on('timeout', () => {
  alert('서버가 응답하지 않습니다.')
  socket.destroy()
})

socket.on('close', () => {
  // connectBtn.css('display', '')
  // closeBtn.css('display', 'none')
})

connectBtn.click(() => {
  socket.connect(parseInt(port.val()), host.val())
  //socket.setTimeout(500) // 500밀리초 후에 연결 여부 확인후 연결 되지 않으면, timeout 이벤트 발생
})

closeBtn.click(() => {
  socket.destroy();
  connectBtn.css('display', '')
  closeBtn.css('display', 'none')
})




$('#send').click(() => {
  var obj = {
    'v1': parseInt(v1.val()),
    'v2': parseInt(v2.val()),
    'op': op.val()
  }
   socket.write(JSON.stringify(obj) + '\n')
   socket.end();
  // console.log(JSON.stringify(obj));
})
