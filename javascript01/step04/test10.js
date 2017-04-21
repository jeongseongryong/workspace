/* 주제: 함수 - 함수를 파라미터로 넘기기

*/
"use strict"

function plus(a, b) {
  return a + b;
}

function minus(a, b) {
  return a - b;
  }

function caller(cb){
  var value = cb(20, 30);
  console.log(value);
}

caller(plus);
caller(minus);
