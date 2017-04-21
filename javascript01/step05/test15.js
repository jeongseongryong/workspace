/* 주제: 객체 - prototype

*/
"use strict"

function Calculator() {
  this.result = 0
}

Calculator.prototype.plus = function(value) {this.result += value}
Calculator.prototype.minus = function(value) {this.result -= value}
Calculator.prototype.multiple = function(value) {this.result *= value}
Calculator.prototype.divide = function(value) {this.result /= value}

var c1 = new Calculator()
var c2 = new Calculator()
var c3 = new Calculator()

c1.plus(10)
c2.minus(20)
c3.plus(30)

console.log(c1.result)
console.log(c2.result)
console.log(c3.result)

Calculator.prototype.plus(10)
