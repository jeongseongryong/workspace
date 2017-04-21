/* 주제: 함수 - 클로저(closure) III

*/

"use strict"

var prompt = require('prompt')

var studentList = [
  ['홍길동1', 100, 100, 100, 300, 100],
  ['홍길동2', 90, 90, 90, 270, 90],
  ['홍길동3', 80, 80, 80, 240, 80],
  ['홍길동4', 70, 70, 70, 210, 70],
  ['홍길동5', 60, 60, 60, 180, 60],
];
prompt.start()

inputCommand()

function inputCommand() {
prompt.get(['command'], function(err, result){
  switch (result.command) {
    case 'quit':
    console.log('안녕히 가세요!')
    return;
  case 'list':
    console.log('[학생 목록]')
    for (var student of studentList) {
    console.log(student[0] + "," +
    student[1] + "," +
    student[2] + "," +
    student[3] + "," +
    student[4] + "," +
    student[5]);
  }
  break;
  case 'add':
    console.log('[학생 입력]')
    prompt.get(['name', 'kor', 'eng', 'math'], function(err, result) {
      var student = [result.name,
        parseInt(result.kor),
        parseInt(result.eng),
        parseInt(result.math)]
      student[4] = student[1] + student[2] + student[3]
      student[5] = student[4] / 3

      studentList[studentList.length] = student
      console.log('입력 되었습니다.')
      console.log()

      inputCommand();
    })
    return;
  case 'delete':
    console.log(['학생 삭제'])
    prompt.get(['no'], function(err, result) {
      var no = praseInt(result.no)
      if (studentList.loenght == 0) {
        console.log('삭제할 항목이 없습니다.')
        inputCommand()
        return
      }

      studentList.splice(no, 1)
      console.log('삭제했습니다.')
      console.log()
      inputCommand()
    })
    return;
  default:
    console.log('해당 명령은 지원하지 않습니다.')
    }
  inputCommand();
  })
}
