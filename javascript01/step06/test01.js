/* 주제 object() - 객체 생성 및 초기화
-객체를 초기화시킬 떄 사용하는 기본 함수
*/
var obj1 = new Object();
console.log(obj1)

var obj2 = {}
console.log(obj2)

var obj2 = {
  name: '홍길동',
  age: 20
}

console.log(obj2.hasOwnProperty('name'))
console.log(obj2.hasOwnProperty('age'))
console.log(obj2.hasOwnProperty('tel'))

var obj3 = Object.create(null);
console.log(obj3)
