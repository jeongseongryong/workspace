/* 주제: 흐름 제어문 - 조건문 else의 소속
-else 는 바로 전에 나온 if 문에 묶인다.



*/
"use strict"

var age;

age = 65;
if (age > 19){
   if (age >= 65)
 console.log("노인");
}
else // <--else 문은 항상 바로 직전이 if에 묶인다.
  console.log("미성년");
console.log("---------------");