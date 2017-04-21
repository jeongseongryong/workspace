/*

*/
"use strict"


var v1 = 100
console.log(v1)

// delete v1 // 실행오류 객체에 소속되지 않은 변수는 delete을 사용할 수 없다.

console.log("--------------")
var obj = {}
obj.v1 = 100
console.log(obj.v1)

delete obj.v1
console.log(obj.v1)
