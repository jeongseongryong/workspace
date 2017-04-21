/* 주제 : 흐름제어문 - 반복문 for

*/
"use strict"

for (var count = 1; count <= 10; count++) {
  console.log(count);
}
console.log("-----------------------------");


for (var a = 2; a <= 9; a++) {
  for (var b = 1; b <= 9; b++) {
    console.log(a + "+" + b + "=" + (a * b));
  }
}
console.log("-----------------------------");

var name = ["홍길동", "임꺽정", "유관순", "안중근", "윤봉길", "김구"];

for (var i = 0; i < name.length; i++) {
  console.log(name[i]);
}
console.log("-----------------------------");
