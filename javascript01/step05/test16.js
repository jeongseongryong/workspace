/* 주제: 객체 - 일반 함수오 인스턴스 함수
*/
"use strict"

function Calculator() {
  this.result = 0
}
Calculator.prototype.plus =function(value) {this.result += value}
Calculator.prototype.plus2 =function(a, b) {return a + b}


var c1 = new Calculator()
var c2 = new Calculator()

c1.plus(100)
var r1 = c1.plus2(100, 200)
console.log(c1.result, r1)

c2.plus(200)
var r2 = c2.plus2(1000, 2000)
console.log(c2.result, r2)

// 글로벌 함수
function plus2(a, b) {
  return a + b
}

// 글로벌 함수로 만드는 것은 유지보수에 안좋다.
// 아무래도 서로 관련된 함수끼리
Calculator.plus2 =function(a, b) {return a + b}

var r3 = Calculator.plus2(100, 200)
console.log(r3)
