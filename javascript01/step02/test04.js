"use strict"
var a;

a = 10;
console.log(++a);

a = 10;
console.log(--a);

a = 10;
console.log(a++);

a = 10;
console.log(a--);

a = 10;
a = ++a;
console.log(a);

a = 10;
a = a++;
console.log(a);
console.log("-----------------")

a = 10;
var r = a++ + a++ + a++ + a--;
console.log(r, a);
