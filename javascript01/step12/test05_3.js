/* 템플릿 엔진 사용하기 - 외부에서 템플릿 소스를 가져오기 I
=> 'fs' 모듈을 이용한다
*/

const fs = require('fs')
const path = require('path')

var templatepath = path.join(__dirname, 'test05_3_template.txt')

// 비동기 방식으로 파일을 읽는다.
// =>파일을 모두읽으면 파라미터로 주어진 함수가 호출된다.

fs.readFile(templatepath, 'utf8',(err, data) => {
  if(err) throw error
  console.log(data)
})
