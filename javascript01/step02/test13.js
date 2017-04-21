// 연산자 우선순위



"use strict"


var r = 10 + 2 * 3; //더하기 보다 곱하기가 우선
console.log(r);

r = (10+2) * 3; //더하기를 먼저하고 싶다면 괄호()를 사용
console.log(r);

r = 10 - 3 + 7;// 같은 우선순위에서는 먼저 나온 순서대로 실행
console.log(r);

r = 10 / 2 * 3;
console.log(r);

var a = 10
r = a++ + a++ - a++;

console.log(r, a);
