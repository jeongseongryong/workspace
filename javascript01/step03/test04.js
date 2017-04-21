/* 주제: 조건문 if - else -
-문법 if - else -


*/
"use strict"

var value;

// else 문법 도입 전
value = 11;
if ((value % 2) == 0)
 console.log("짝수입니다.");

if ((value % 2) != 0)
 console.log("홀수입니다.");
console.log("----------------");


// else 문법 도입 후
value = 11;
if ((value % 2) == 0)
 console.log("짝수입니다.");
else // <-- if 조건이 거짓일 때 else에 소속된 문장을 실행한다.
 ((value % 2) != 0)
 console.log("홀수입니다.");
console.log("---------------");

/*
// else 는 if 없이 실행할 수 없다.
//  - else는 항상 if문과 이어져야 한다.
value = 11;
if ((value % 2) == 0)
 console.log("짝수입니다.");
console.log("--------------"); // <-- 이 문장이 들어가는 순간 if 문은 종료된 것이다.
else   // <-- 이 else와 관련된 if문이 없다. 바로 위에 있던 if는 이미 종결되었기 떄문
 console.log("홀수입니다."); // <-- else에 소속된 문장
console.log("---------------");
*/

value = 11;
if ((value % 2) == 0) { // <-- 중괄호를 사용하여 if가 끊기지 않도록 한다.
console.log("짝수입니다.");
console.log("------------");
 }
else // <-- 이 else는 위의 if와 연결될 수 있다. 그래서 오류가 아니게 된다.
 console.log("홀수입니다.");
console.log("---------------");
