/* 주제 : 흐름제어문 - 반복문 do ~ while

*/
"use strict"

var count = 1;

do
  console.log(count++);
while (count <= 10)
 console.log("---------------")

 do {
   console.log(count++);
   console.log(">");
} while (count <= 10);
