// Echo 클라이언트 만들기
const net = require('net')

const socket = new net.Socket();

socket.connect(8888, "localhost", function() {
  console.log( '=> 연결되었음');
  socket.write('hello~\n');
  console.log('=>서버에 데이터 보냈음');
})

socket.on('data',function(data) {
	console.log(data.toString);
	socket.destroy();
})
socket.on('close', function() {
  console.log('연결이 끊어졌음');
})
