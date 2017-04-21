/* 주제: 객체 - this 변수의 활용

var obj2 = {}
obj2.v2 = 0
obj2.f1 = function() {
v1 = 100
}
*/
"use strict"

var obj = {
  v1: 0,
  f1: function() {
    this.v1 = 100

  }
}

obj.f1()
console.log(obj.v1)
console.log("--------------------");
