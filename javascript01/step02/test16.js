/* 주제:

*/
"use strict"


if (v0 == undefined) console.log("v0는 변수는 존재하지만값이 없는 상태이다.");

var v1 = 20;
v1 = undefined;  // 변수는 존재하는데 값을 지정하지 않아 타입이 정의되지않았다.
if (v1 == undefined) console.log("v1는 변수는 존재하지만 값이 없는 상태이다.");

if (v1) console.log("v1는 false로 바뀐다.");

var v2 = null;
if (v2 == null) console.log("v2는 null이다.");

var v3 = NaN;
if (v3 == NaN) console.log("v3는 NaN이다.");
if (isNaN(v3)) console.log("v3는 isNaN(v3) = true 이다.");

var v4 = Infinity;
if (v4 == Infinity) console.log("v4는 Infinity이다.");
