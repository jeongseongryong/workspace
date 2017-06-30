"use strict"
window.$ = window.jQuery = require('jquery')

const mysql = require('mysql')
const connection = mysql.createConnection({
  database: 'webappdb',
  user : 'webapp',
  password: '1111'
})
connection.connect()

  var tbody = $('#student-tbl > tbody')
  listStudent(1)

$('#add-btn').click(function(){
  location.href = "view.html"
})

$('#prev-btn').click(function(){
  var currPageNo = parseInt($('#page-no').text())
  listStudent(currPageNo - 1)
})

$('#next-btn').click(function(){
  var currPageNo = parseInt($('#page-no').text())
  listStudent(currPageNo + 1)
})

function listStudent(pageNo){
  connection.query(
      'select m.mno, m.name, m.tel, m.email, s.work \
      from stud s inner join memb m on s.sno = m.mno \
      order by mno asc \
      limit ' + (pageNo - 1) * 3 + ', 3',
      function (error, results) {
      if (error) {
        alert('데이터 조회중 오류발생')
        throw error;
      }
      tbody.html('');


      for (var i = 0;i < 3 ; i++){
        if (i < results.length){
          let s = results[i]
          $("<tr>").html("<td>" + s.mno +
          "</td><td><a href='#' data-no='" + s.mno + "' class='view-link'>" + s.name +
          "</a></td><td>" + s.tel +
          "</td><td>" + s.email +
          "</td><td>" + (s.work == "Y" ? "재직중":"실업중") + "</td>")
          .appendTo(tbody)
        }else {
          $("<tr><td colspan='5'>&nbsp;</td></tr>").appendTo(tbody)
        }

      }
      $('table .view-link').click(onClickViewLink)

      preparePagingBar(pageNo)
    })

}

function preparePagingBar(pageNo){
  $('#page-no').text(pageNo)

  if(pageNo == 1){
    $('#prev-btn').attr('disabled', true)
  } else{
    $('#prev-btn').attr('disabled', false)
  }

  connection.query(
      'select count(*) cnt from stud',
      function (error, results) {
      if (error) {
        alert('데이터 조회중 오류발생')
        throw error;
      }


      var totalCount = results[0].cnt;
      var totalPage = parseInt(totalCount / 3 + (totalCount % 3 > 0 ? 1 : 0));
      // if (totalCount % 3 > 0 ){
      //   totalPage++;
      // }
      if (pageNo == totalPage) {
        $('#next-btn').attr('disabled', true)
      } else {
        $('#next-btn').attr('disabled', false)
      }

}
)}

function onClickViewLink(event) {
  location.href = 'view.html?no=' + $(this).attr('data-no') // this는 이벤트가 발
  event.preventDefault()
}
