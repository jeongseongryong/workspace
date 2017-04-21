/* 주제: 객체 - 일반 객체와 함수 객체 응용
-일반객체
=> 다음과같이 new 또는 {} 으로 만드는 객체
var obj = new 생성자()
var dbj = {}
 =>prototype이 없다.

 -함수 객체 = 일반객체 + 함수 코드 prototype
*/
"use strict"

// 함수객체
function Calculator() {
  this.result = 0
}

Calculator.prototype.plus = function(value) {this.result += value}
Calculator.prototype.minus = function(value) {this.result -= value}

Calculator.plus = function (a, b) {return a + b}
Calculator.minus = function (a, b) {return a - b}

var calc1 = new Calculator()

calc1.plus(100)
calc1.minus(20)
calc1.plus(10)
console.log(calc1.result)

var r1 = Calculator.plus(100, 200)
var r2 = Calculator.minus(100, 200)
console.log(r1, r2)
