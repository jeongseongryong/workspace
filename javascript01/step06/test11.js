/* 주제: node.js에서 제공하는 글로벌 객체(builtwin)

*/
"use strict"

console.log(__dirname)

console.log(__filename)

const path = require('path')
console.log(path.join('c:/workspace/','javascript01/','step05/','test01.js'))

console.log(path.join(__dirname, 'test01.js'))

console.log(path.join(__dirname, '../../electron01/step04/main.js'))
