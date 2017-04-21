/* 주제: 함수 - 함수 호이스팅(hoisting)


*/
"use strict"

name = "홍길동";

var name; // 변수나 함수 정의가 제일 먼저 실행된다.


f1();



function f1() {
  console.log("f1() 호출됨");
}

f1();
