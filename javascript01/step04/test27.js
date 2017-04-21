/* 주제: 함수 - 재귀호출 II
-꼬리 재귀 (tail recurdive)


*/
"use strict"


function sigma(n, sum) {
  if (n == 1)
    return sum + n
  return sigma(n - 1, sum + n);
}

var result = sigma(5, 0)
console.log(result)
