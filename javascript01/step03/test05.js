/* 주제: 흐름 제어문 - 조건문 if - else if -else if -else
-문법


*/
"use strict"

var age;

age = 11;

if (age < 8)
console.log("유아");
else { // <-- age >= 8
  if (age >= 8 && age < 14)
   console.log("어린이");
 else // <-- age >= 14
   console.log("청소년 이상입니다.");
}
console.log("-------------");

// if ~ else ~ 는 한 그룹으로 취급한다.
age = 40;

if (age < 8)
console.log("유아");
else  // <-- age >= 8,if ~ else ~ 는 한문장이기 때문에 블록을 생략해도 된다.
  if (age >= 8 && age < 14)
   console.log("어린이");
 else // <-- age >= 14
   console.log("청소년 이상입니다.");

console.log("-------------");


age = 65;

if (age < 8)
console.log("유아");
else  // <-- age >= 8,if ~ else ~ 는 한문장이기 때문에 블록을 생략해도 된다.
  if (age >= 8 && age < 14)
   console.log("어린이");
 else // <-- age >= 14
   if (age >= 14 && age < 20)
   console.log("청소년");
 else
  if (age >= 20 && age < 65)
   console.log("성인");
   else
     console.log("노인");
console.log("--------------------");

// 실무에서는 if~ else ~ 문장을 보기 좋게 정렬한다.
// if -else if ~else if ~ else 라는 문법은 없다!
// -그냥 if ~ else 코드를 정돈한 것이다.
age = 65;

if (age < 8)
console.log("유아");
else if (age >= 8 && age < 14)
   console.log("어린이");
else if (age >= 14 && age < 20)
   console.log("청소년");
else if (age >= 20 && age < 65)
   console.log("성인");
else
   console.log("노인");
console.log("--------------------");
