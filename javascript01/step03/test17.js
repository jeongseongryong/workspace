/* 주제 : 흐름제어문 - 연습
-구구단을 출력하는 프로그램 작성
-예)
> node test17.js
prompt: step: 5
5 * 1 = 5
5 * 2 = 10
...
5 * 9 = 45
*/
"use strict"

var prompt = require('prompt');

prompt.start();


prompt.get(['step'], function(err, result) {
  var step = parseInt(result.step); // string --> number

for (var a = 1; a <= 9; a++) {
  console.log(step + "+" + a + "=" +(step * a));
}

});
