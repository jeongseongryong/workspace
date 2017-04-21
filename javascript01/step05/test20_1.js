/* 주제: 객체 - defineProperty() 응용

*/
"use strict"

// 함수객체
function Calculator() {
  this.result = 0
}

Calculator.prototype.plus = function(value) {this.result += value}
Calculator.prototype.minus = function(value) {this.result -= value}



var calc1 = new Calculator()

calc1.plus(100)
calc1.minus(20)
calc1.plus(10)
calc1.result = 1000 // 개발자가 실수로 이렇게 result 값을 임의적으로 바꾸더라도 막을방법이없다.
console.log(calc1.result)
