/* 주제: 함수 -글로벌 변수와 로컬 변수



*/
"use strict"

var v1 = 100;

function f1() {
  var v1 = 200;
  var v2 = 300;
console.log("f1():", v1, v2);

}

console.log(v1);
f1();
console.log(v1);
// console.log(v2);
f1();
