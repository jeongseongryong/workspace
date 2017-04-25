/* 템플릿 엔진 사용하기 - 배열 데이터 처리
=> {{#each 배열프라퍼티명 }}
...
{{/each}}
*/

const handlebars = require('handlebars')

var str = '{{#each students}}\
 {{no}}, {{name}}, {{email}}\n\
 {{/each}}'
var data = {
  students: [
    {no: 1, name: '홍길동1', email : 'hong1@test.com'},
    {no: 2, name: '홍길동2', email : 'hong2@test.com'},
    {no: 3, name: '홍길동3', email : 'hong3@test.com'},
    {no: 4, name: '홍길동4', email : 'hong4@test.com'}
  ]
}


var templit = handlebars.compile(str)
var result = templit(data)

console.log(result)
