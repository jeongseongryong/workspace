/* 주제 : 흐름제어문 - 반복문 for.. in

*/
"use strict"

var names = ["홍길동", "임꺽정", "유관순", "안중근", "윤봉길", "김구"];

for (var key in names) {
  console.log(key, names[key]);
}
console.log("-----------------------------");

for (var i = 0; i < names.length; i +=2) {
   console.log(i, names[i]);
}
console.log("-----------------------------");

var student = {
  name: "홍길동",
  age: 20,
  tel: "1111-1111",
  email: "test@test.com"
};

for (var key in student) {
  console.log(key, student[key]);
}
console.log("-----------------------------");
