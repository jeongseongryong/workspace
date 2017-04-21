/* 주제: 함수 - 정의와 사용 II

*/
function f1() {
  console.log("f1() 호출됨");
}

f1();

function f2() {
  return "hello";
}

var value = f2();
console.log("f2()의 리턴 값 = ", value);

function f3(a) {
  console.log("---->", a);
}

f3(100);
f3(200);
f3(300);

function f4(a) {
  return "a =" + a + "입니다.";
}

var value = f4(100);
console.log(value);


console.log(f4(200));
