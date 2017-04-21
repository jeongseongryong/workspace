/* 주제 : 흐름제어문 - 반복문 for.. of

*/
"use strict"
var names = ["홍길동", "임꺽정", "유관순", "안중근", "윤봉길", "김구"];

for (var index in names) {
  console.log(index);
}
console.log("-----------------------------");


for (var value of names) {
  console.log(value);
}
console.log("-----------------------------");
