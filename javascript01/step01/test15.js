/*주제 :배열



*/
"use strict"
//배열 사용 전

var kor = 100, eng = 100, math = 100;
var sum = kor + eng + math;
var aver = sum / 3;
console.log(kor, eng, math, sum, aver);

//배열 사용 후
var score = [];
score [0] = 90;
score [1] = 80;
score [2] = 70;
score [3] = score [0] + score [1] + score [2];
score [4] = score [3] / 3;
console.log(score [0], score [1], score [2], score [3], score [4]);
