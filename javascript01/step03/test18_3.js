/* 주제 : 예외처리 - throw
-
*/
"use strict"

function divide(a, b) {
  if (b == 0) // 0으로 나누려한다면,
    throw {errorCode: 400, message:'0으로 나눌 수 없다.'} 
  return a / b
}



var result = divide(12121212, 0)
  console.log('-------------------------')
  console.log(result)
