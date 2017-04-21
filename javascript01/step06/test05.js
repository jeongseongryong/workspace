/* 주제 setInterval(callback, delay[, ...args])

*/
"use strict"

var count = 0;
{
  let timer = setInterval(function() {
    console.log('1초 지났음!')
    if(++count == 10)
    console.log(timer)
      clearInterval(timer)
  }, 1000)
}
var timer = 'ok'
console.log(timer)
