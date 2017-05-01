/* 주제 : 예외처리 - throw
-
*/
"use strict"

function divide(a, b) {
  return a / b
}

var result = divide(10, 2)
console.log(result)

result = divide(10, 0)
console.log(result)
