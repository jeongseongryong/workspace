/* 주제: 흐름 제어문 - switch의 조건 값
-case 지정할 수 있는 값의 종류

*/
"use strict"



switch ("문자열") {
 case "문자열":
  console.log("문자열 가능!");
   break;
 case 1:
  console.log("숫자 가능");
   break;
 case 3.14159:
  console.log("부동소수점 가능");
  break;
 case true:
 console.log("boolean 값 가능");
  break;
 case undefined:
  console.log("undefined 값 가능");
  break;
case null:
  console.log("null 값 가능");
  break;
  case NaN: //NaN는 직접 비교 할수 없다. isNaN()로 확인해야 한다.
  console.log("NaN 값 가능");
    break;
}
console.log("--------------------");

var v = NaN;

if (v == NaN);
 console.log(NaN);
