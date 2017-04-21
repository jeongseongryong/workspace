/* 주제 Array() - 기본사용법
-
*/
var arr1 = new Array();
console.log(arr1)
console.log(typeof arr1)

var arr2 = []
console.log(arr2)
console.log(typeof arr2)

var arr3 = ["홍길동", "임꺽정", "유관순", "안중근"]
console.log('배열 길이=', arr3.length)

arr3.push('윤봉길')
arr3.push('김구', '신채호')
console.log('배열 길이=', arr3.length)

var value = arr3.pop()
console.log(arr3)

value = arr3.shift()
console.log(arr3)

value = arr3.splice(2, 1)
console.log(arr3)

value = arr3.splice(1, 3)
console.log(arr3)

console.log("-------------------")
