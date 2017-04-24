"use strict"

window.$ = window.jquery = require('jquery')

var teacherService =require('electron').remote.getGlobal('teacherService')
/*
// electron 관리자 객체 얻기
var electron = require ('electron')
//
var remote = electron.remote

var studentService =  remote.getGlobal('studentService')
*/
var tbody = $('#teacher-tbl > tbody')

displayList(1)

$('#add-btn').click(function() {
  location.href = 'view.html'
})

$('#prev-btn').click(function() {
  var currPageNo = parseInt($('#page-no').text())
  displayList(currPageNo - 1)
})

$('#next-btn').click(function() {
  var currPageNo = parseInt($('#page-no').text())
  displayList(currPageNo + 1)
})
function displayList(pageNo) {
  teacherService.list(
    pageNo,
    function (results, totalCount) {
      console.log(results)

      tbody.html('');

      for (var i = 0; i < 3; i++) {
        if (i < results.length) {
          let t = results[i]
          $("<tr>").html("<td>" + t.mno +
          "</td><td><a href='#' data-no='" + t.mno + "' class='view-link'>" + t.name +
          "</a></td><td>" + t.email +
          "</td><td>" + t.tel +
          "</td><td>" + t.hmpg +
          "</td><td>" + t.fcbk + "</td>")
          .appendTo(tbody)
        } else {
          $("<tr><td colspan='5'>&nbsp;</td></tr>").appendTo(tbody)
        }
      }
      $('table .view-link').click(onClickViewLink);

       preparePagingBar(pageNo, totalCount)

    },
    function(error) {
      alert('데이터 조회 중 오류 발생!')
      throw error;
}) //listStudent()
} // displayList()

function preparePagingBar(pageNo, totalCount) {
  $('#page-no').text(pageNo)

  if (pageNo == 1) {
    $('#prev-btn').attr('disabled', true)
  } else {
    $('#prev-btn').attr('disabled', false)
  }


  var totalPage = parseInt(totalCount / 3) + (totalCount % 3 > 0 ? 1: 0);

  if(pageNo == totalPage) {
    $('#next-btn').attr('disabled', true)
  } else {
    $('#next-btn').attr('disabled', false)
    }
}



function onClickViewLink(event) {
  location.href = 'view.html?no=' + $(this).attr('data-no')
  event.preventDefault()
}
