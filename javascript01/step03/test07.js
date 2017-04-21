/* 주제: 흐름 제어문 - switch ~ case
-문법

switch (식){
cas 값:
 식1:
 식2:
 ...
 break;
case 값2:
 ...
 break;
default;
 ...
 }
*/
"use strict"

var level;

// switch 를 사용하기 전
//사원 = 워드 자격증
//개발자 = 워드 자격증 + 정보처리기사 자격증
//팀장 = 워드 자격증 + 정보처리기사 자격증 + 석사 학위자
level = "팀장";

if (level == "사원")
 console.log("워드 자격증 소지자");

if (level == "개발자")
 console.log("워드 자격증 소지자"); {
 console.log("정보처리기사 자격증 소지자");
}
if (level == "팀장") {
 console.log("워드 자격증 소지자");
 console.log("정보처리기사 자격증 소지자");
 console.log("석사 학위자");
 }
console.log("---------------------------");

level = "팀장"

switch (level){
  case "팀장":
  console.log("석사 학위자");
  case "개발자":
  console.log("정보처리 자격증 소지자");
  case "사원":
  console.log("워드 자격증 소지자");
}
