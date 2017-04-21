/*

*/
"use strict"

var prompt = require('prompt')

var studentList = [
  ['홍길동1', 100, 100, 100, 300, 100],
  ['홍길동2', 90, 90, 90, 270, 90],
  ['홍길동3', 80, 80, 80, 240, 80],
  ['홍길동4', 70, 70, 70, 210, 70],
  ['홍길동5', 60, 60, 60, 180, 60]
];

prompt.start()

inputCommand()

function inputCommand() {
  prompt.get(['command'], function(err, result) {
    switch (result.command) {
    case 'quit':
      doQuit()
      return; // 함수 실행을 끝낸다.
    case 'list':
      doList()
      return;
    case 'add':
      doAdd()
      return;
    case 'delete':
      doDelete()
      return;
    default:
      doDefault()
    }
  })
}

function doQuit() {
  console.log('안녕히 가세요!')
}

function doList() {
  console.log('[학생 목록]')
  var count = 0;
  for (var student of studentList) {
    console.log(count++ + ":" + student[0] + "," +
      student[1] + "," +
      student[2] + "," +
      student[3] + "," +
      student[4] + "," +
      student[5]);
  }
  inputCommand()
}

function doAdd() {
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
}

function doDelete() {
  console.log('[학생 삭제]')
  prompt.get(['no'], function(err, result) {
    var no = parseInt(result.no)
    if (studentList.length == 0) {
      console.log('삭제할 항목이 없습니다.')
      inputCommand()
      return
    }

    if (no < 0 || no >= studentList.length) {
      console.log('학생 번호가 옳지 않습니다.')
      inputCommand()
      return
    }

    studentList.splice(no, 1)
    console.log('삭제했습니다.')
    console.log()
    inputCommand()
  })
}

function doDefault() {
  console.log('해당 명령은 지원하지 않습니다.')
  inputCommand()
}
