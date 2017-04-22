"use strict"

window.$ = window.jquery = require('jquery')

var managerService =require('electron').remote.getGlobal('managerService')
/*
// electron 관리자 객체 얻기
var electron = require ('electron')
//
var remote = electron.remote

var studentService =  remote.getGlobal('studentService')
*/
var tbody = $('#manager-tbl > tbody')

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
  managertService.list(
    pageNo,
    function (results, totalCount) {


      tbody.html('');

      for (var i = 0; i < 3; i++) {
        if (i < results.length) {
          let m = results[i]
          $("<tr>").html("<td>" + m.mno +
          "</td><td><a href='#' data-no='" + m.mno + "' class='view-link'>" + m.name +
          "</a></td><td>" + m.tel +
          "</td><td>" + m.email +
          "</td><td>" + (m.work =="Y" ? "재직중" : "실업") + "</td>")
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
