/* 주제: 함수 - 익명 함수와 호이스팅


*/
"use strict"

f1();

function f1() {
  console.log("okok");
}

var f2 = function() {
  console.log("익명함수....");
}

f2(); 
