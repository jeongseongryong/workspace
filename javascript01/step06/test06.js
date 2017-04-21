/* 주제 함수나 객체를 별도의 파일로 분리하여 관리하기
 모듈정의
 => test06_m1.js
 => test06_m2.js
*/
"use strict"

var m1 = require('./test06_m1.js')

console.log(m1.plus(10,20))
console.log(m1.minus(10,20))
console.log(m1.multiple(10,20))

// console.log(m1.divide(10,20))
