/* 주게 객체 - 용도

*/
"use strict"


function createScore(name, kor, eng, math){
  return{
    name: name,
    kor: kor,
    eng: eng,
    math: math,
    sum: kor + eng + math,
    aver: (kor + eng + math) / 3
  }
}


var scores2 = [
  createScore("홍길동1", 100, 100, 100),
  createScore("홍길동2", 90, 90, 90),
  createScore("홍길동3", 80, 80, 80),
  createScore("홍길동4", 70, 70, 70),
  createScore("홍길동5", 60, 60, 60),
]

console.log("홍길동 3의 총점은?", scores2[2].sum)
