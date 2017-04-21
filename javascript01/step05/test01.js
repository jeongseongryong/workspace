/* 주게 객체 -소개

*/
"use strict"

names = "홍길동"

var names = []
names[0] = "홍길동"
names[1] = "임꺽정"
names[2] = "유관순"
names[5] = "윤봉길"
console.log(names);
console.log(names[0])
console.log(names[1])
console.log(names[2])
console.log(names[5])
console.log("---------------------")

var obj = {}
obj["name"] = "홍길동"
obj["name2"] = "임꺽정"
obj.name3 = "유관순" // !!!!

var v = "name4"
obj[v] = "윤봉길"
console.log(obj)
console.log(obj.name)
console.log(obj["name"])
console.log(obj['name'])
var v2 = 'name'
console.log(obj[v2])



// obj.first name = "길동" //
obj['first name'] = '길동'
obj['hello^^;'] = '오호라~'
// console.log(obj.first name)
console.log(obj['first name'])
console.log(obj['hello^^;'])
