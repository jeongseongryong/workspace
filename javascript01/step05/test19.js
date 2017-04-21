/* 주제: 객체 - read only 프로퍼티 만들기
-프로퍼티

*/
"use strict"

var obj = {}
obj.result = 10


Object.defineProperty(obj, 'result2', {
  value: '100'
})

console.log(obj.result)
console.log(obj.result2)
console.log('---------------------------');

obj.result = 20
console.log(obj.result)
obj.result2 = 200 // result2 는 read only 프로퍼티이기 떄문에 값을 변경할 수 없다.
console.log(obj.result2)
