/* 주제 : 예외처리 - try ... catch ...
 =>목적?
 예외가 발생 하더라도 시스템을 멈추지 않고 계속 실행하게 만드는 것.
-
*/
"use strict"

function divide(a, b) {
  if (b == 0) // 0으로 나누려한다면,
    throw {errorCode: 400, message:'0으로 나눌 수 없다.'}
  return a / b
}


try {

var result = divide(12121212, 0)
  console.log(result)

}catch (error) {

  console.log(error.message)
}
