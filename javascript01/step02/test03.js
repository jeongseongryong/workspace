"use strict"
var a = 7;
var b = "7";


/* "==" 연산자

*/
console.log(a == b); //7 == "7" -->7 == 7 --> true



/* "===" 연산자
-같은 타입에 대해서만 비교를 수행한다
-타입이 다르면 무조건 false
*/
console.log(a === b); // false
console.log(a !== b);
