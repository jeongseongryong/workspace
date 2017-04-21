/* 주제: 객체 - this 변수

*/
"use strict"

function f1() {
  console.log(this)
}


new f1()


var obj = {
  f2 : function() {
    console.log(this)
  }
}


obj.f2()

//  f2() //실행오류
