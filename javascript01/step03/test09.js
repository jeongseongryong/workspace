/* 주제: 흐름 제어문 - switch와 difault
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

level = "경비원";

switch (level){
 case "팀장":
  console.log("석사 학위자");
   break;
 case "개발자":
  console.log("정보처리 자격증 소지자");
  break;
 case "사원":
  console.log("워드 자격증 소지자");
  break;
 default:
   console.log("자격증이 필요 없습니다.");
}
console.log("--------------------");
