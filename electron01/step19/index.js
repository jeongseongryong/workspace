"use strict"
const net = require('net')
window.$ = window.jQuery = require('jquery')
var host = $('#host'),
    port = $('#port'),
    name = $('#name'),
    message = $('#message'),
    chatboard = $('#chatboard'),
    sendBtn = $('#sendBtn');

var myName = null;

var socket = new net.Socket()

var buffer = ''

socket.on('data', (data) => {
  buffer += data.toString()

  // 줄바꿈 코드를 찾아서 값을 추출한다.
  var value = null
  while (true) {
    var newLineIndex = buffer.indexOf('\n')
    if ( newLineIndex < 0) // 줄바꿈 코드가 없다면,
      return; // 아직 데이터를 다 받지 못했다는 의미이다. 다음 데이터를 받을 때 계속한다.

    // 줄바꿈 코드 앞에 문자열과 줄바꿈 코드 뒤의 문자열을 분리한다.
    // => 줄바꿈 코드 앞의 문자열을 값으로 추출한다.
    value = buffer.substring(0, newLineIndex)
    // => 줄바꿈 코드 뒤의 문자열은 다시 버퍼에 담는다.
    buffer = buffer.substring(newLineIndex + 1)

    if (value.length > 0) // 값이 있으면 반복문을 멈춰서 처리한다.
	  break;
  }
  $('<li>').addClass(value.startsWith(myname) ? "me" : "him")
                    .html(vlaue)
                    .appendTo(chatboard)
  messageBox.scrollTop(messageBox.prop('scrollHeight'));

})

socket.on('error', (error) => {
  alert(error.message)
})

$('#connectBtn').click(() => {
  socket.connect(parseInt(port.val()), host.val(), () => {
    soket.write(name.val() + '\n')
    myName = '['+ name.val()
  })
})


sendBtn.click(() => {
  socket.write(message.val() + '\n')
  message.val('')
})

message.keyup((e) => {
  if (e.keyCode == 0x0d) {
    var text = message.val().replace('\r', '').replace('\n', '');
    message.val(text)
    sendBtn.click()
  }
})
