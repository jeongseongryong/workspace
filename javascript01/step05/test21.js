/* 주제: 객체 - 배열에서 여러개의 항목 받기
- 할당 연산자(=)를 사용하여 한 번에 여러 개의 배열 항목을 받을 수 있다.
*/
"use strict"

var a = 10;
var b = 20;
var c = 30;
console.log(a, b, c)

var i = 10, j = 20, k = 30;
console.log(i, j, k)

var [x, y, z] = [10, 20, 30, 40, 50]
console.log(x, y, z)

var obj = {
  name: '홍길동',
  age: 20,
  tel: '1111-1111',
  email: 'hong@test.com',
}

/*
var name = obj.name;
var age = obj.age;
*/


var {name, age} = obj
console.log(name, age)


var {age, email} = obj
console.log(age, email)
