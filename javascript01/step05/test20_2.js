/* 주제: 객체 - defineProperty() 응용
-
*/
"use strict"


function Calculator() {
}
let result = 0
Calculator.prototype.plus = function(value) {
  result += value
}
Calculator.prototype.minus = function(value) {
  result -= value
}
Calculator.prototype.getResult = function(value){
  return result
}


var calc1 = new Calculator()

calc1.plus(100)
calc1.minus(20)
calc1.plus(10)
console.log(calc1.result) // 실행 오류 calc1 객체에는 result 프로퍼티가 없다

console.log(calc1.getResult())
