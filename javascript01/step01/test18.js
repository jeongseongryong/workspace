/* 주제: 배열과 변수
 -배열이 생성되면 그 배열의 주소가 변수에 저장된다.
*/

"use strict"

var a1 = ["홍길동",99, 98, 97];

console.log(a1[1]);

var v1 = a1;
a1[1] = 88;
console.log(v1[1]);
