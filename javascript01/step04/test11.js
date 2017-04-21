/* 주제: 함수 - 파라미터로 arrow 함수(의 주소) 넘기기

*/
"use strict"

function caller(f){
  var value = f(20, 30);
  console.log(value);
}

function plus(a, b){
  return a + b;
}
caller(plus);

var plus2 = function(a, b){
  return a + b;
}

caller(function plus3(a, b){
  return a + b;
});


caller(function(a, b){
  return a + b;
});

caller((a, b) => {return a + b;});

caller((a, b) => {return a + b});

caller((a, b) => {return a + b})

caller((a, b) =>  a + b);
