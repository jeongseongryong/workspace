/* 주제: 흐름 제어문 -조건문
-문법
1)if 문만 사용한 경우
if (식) <--(expression)의 결과값은 true 또는 false이다.
 명령문;

2) if ~ else ~ 문 사용:
if (식) <-- 식의 결과가 참이면 '명령문1'이 실행되고, 거짓이면 '명령문2'가 실행
 명령문1;
else
 명령문2;

 3) 블록({})을 사용하면 여러 개의 명령을 하나로 묶을 수 있다.
*/
"use strict"

var value = 10;

if ((value % 2) == 0) console.log("짝수입니다.");


if ((value % 2) == 0)
 console.log("짝수입니다.");
console.log("--------------------");

value = 11;
if ((value % 2) == 0)
 console.log("짝수");  // <-- if 문에 속해있는 문장이다.
 console.log("입니다."); // <-- if 문과 상관없다.
 console.log("----------------------");


 // if 문장 뒤에 세미콜론을 주의해서 사용하라!

value = 11;
 if ((value % 2) == 0);    // <-- 세미콜론을 사용하는 순간 한 문장이 끝났음을 표시함
  console.log("짝수입니다.");
 console.log("-------------------");

// 여러 개의 문장을 if 문에 묶고 싶을때,


value = 11;
if ((value % 2) == 0) { // <-- 블록을 한 개의 문장으로 취급한다.
 console.log("짝수");
 console.log("입니다.");
}
