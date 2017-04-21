/* 주제 함수나 객체를 별도의 파일로 분리하여 관리하기
 모듈정의
 => test06_m1.js
 => test06_m2.js
*/
"use strict"

function plus(a, b) { return a + b}
function minus(a, b) { return a - b}
function multiple(a, b) { return a * b}
function divide(a, b) { return a / b}

module.exports.plus = plus; // 이게 원칙;
// module.exports 에서 module은 생략가능 d
exports.minus = minus;
exports.multiple = multiple;
