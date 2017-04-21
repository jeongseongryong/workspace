/* 주제: 함수 -함수 호출 동기 방식과 비동기 방식



*/
"use strict"
var prompt = require('prompt');

prompt.start();

prompt.get(['a', 'b'], function(err, result) {
  console.log("입력 값 출력 --------------------------");
  console.log(result.a, result.b);
});
console.log("우헤헤헤헤헤헤헤 ......");
