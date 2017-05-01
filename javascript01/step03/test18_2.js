/* 주제 : 예외처리 - throw
-
*/
"use strict"

function divide(a, b) {
  if (b == 0) // 0으로 나누려한다면,
    return -12121212 //리턴 값으로 나오기 희밧한 수를 리턴한다.
  return a / b
}


var result = divide(12121212, -1)
if (result == -12121212) {
  console.log('0으로 나눌 수 없습니다.')
} else {
  console.log(result)
}
