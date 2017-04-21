/* 주게 객체 - 값 초기화

*/
"use strict"
//배열 초기화
names = "홍길동"

var names = ["홍길동", "임꺽정", "유관순"]
names[5] = "윤봉길"
console.log(names)
console.log("---------------------")

//객체 초기화
var obj = {"name1": "홍길동", "name2": "임꺽정", "name3": "유관순"}
obj.name4 = "안중근"
console.log(obj)

console.log(typeof names)
console.log(typeof obj)

var obj2 = {"name": "홍길동", "name2": "임꺽정", "name3": "유관순"}
console.log(obj2)
