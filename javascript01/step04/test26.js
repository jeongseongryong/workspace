/* 주제: 함수 - 재귀호출


*/
"use strict"

var sum = 0
for (var i =1; i <= 5; i++) {
  sum += i
}
console.log(sum)
console.log('----------------------------')

function sigma(n) {
  if (n == 1)
    return 1
  return n + sigma(n - 1)
}

var sum2 = sigma(5)
console.log(sum2)