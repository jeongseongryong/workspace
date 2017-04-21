/* 주제: 모듈안에서 모듈 밖의 변수를 사용할 수 있는가?

*/
"use strict"


// v1 = 200 // 실행오류

var v1 = 200
console.log('test10_m1.js => v1:', v1);

global.v2 = 200
global.v3 = 300
console.log('test10.js => globals.v2:', global.v2)
