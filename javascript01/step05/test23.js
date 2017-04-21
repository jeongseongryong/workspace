/* 주제: 기타 - eval() 함수
-
*/


var obj = {
  name: "홍길동",
  age: 20
}
console.log(obj)

var str = "var v1 = 20, v2 = 30; console.log(v1 + v2)";

eval(str);

var obj2 = eval("var x1 = 100")
console.log(obj2);
