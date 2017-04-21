/* 주제: 함수 - 클로저(closure) II

*/
"use strict"

var arr = ["홍길동", "임꺽정", "유관순", "안중근", "윤봉길"]
var count = -1;

function outer() {
  var i = ++count;
  return function() {
    console.log(arr[i])
  }
}


  var f1 = outer();
  var f2 = outer();
  var f3 = outer();
  var f4 = outer();
  var f5 = outer();

f1();
f2();
f3();
f4();
f5();
