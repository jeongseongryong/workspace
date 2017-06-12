//Echo 서버 만들기
const net = require('net')

const server = net.createServer((socket) => { //애로우function
	console.log('=> 클라이언트가 연결 되었습니다.')

	socket.on('data', (data) => {
	socket.write('[룡]' + data.toString())
	socket.destroy(); //한번 응답후 끝내기
	})
}); 

server.listen(8888, () => {
	console.log('=>서버 실행 중...')
}) 
