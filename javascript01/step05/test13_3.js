/* 주제: 객체 - this 변수의 활용

var obj2 = {}
obj2.v2 = 0
obj2.f1 = function() {
v1 = 100
}
*/
"use strict"

var obj1 = {
v1: 100
f1: function() {
  // this = 호출할 떄 앞에 준 객체
  console.log(this)
  console.log(this.v1)
  }
}
obj1.f1()


function f2 () {
  console.log('hello')
}

f2()
