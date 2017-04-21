/* 주제: exports를 함수 객체로 대체하기 II

*/
"use strict"

var m1 = require('./test09_m1.js')

var calc = m1();

calc.plus(10)
calc.minus(5)
calc.plus(100)
console.log(calc.result)
