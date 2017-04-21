/* 주제: exports를 함수 객체로 대체하기 II

*/
"use strict"


module.exports = function() {
  return {
    result: 0,
    plus(value) {this.result += value},
    minus(value) {this.result -= value},
    multiple(value) {this.result *= value},
    divibe(value) {this.result /= value}
  }
}
