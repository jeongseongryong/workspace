"use strict"

var a1 = []; //빈 배열 만들기
console.log(a1.length);

var a2 = [10, 20, 30, 40];//
console.log(a2.length);
console.log('----------------------------');

a1[0] = 100;
a1[1] = 200;
console.log(a1.length);

a1[100] = 300;
console.log(a1.length);
console.log('----------------------------');


console.log(a1[0]);
console.log(a1[1]);
console.log(a1[50]);
console.log(a1[101]);
console.log('----------------------------');

a2[4] = "홍길동"
a2[5] = false;
a2[6] = function() {};
a2[7] = null;
a2[8] = {};

for (var i = 0; i < a2.length; i++) {
  console.log(i,":",a2[i]);
}
