"use strict"

window.$ = window.jQuery = require('jquery')
var managerService =require('electron').remote.getGlobal('managerService')


var fiNo = $('#fi-no'),
    fiEmail = $('#fi-email'),
    fiName = $('#fi-name'),
    fiTel = $('#fi-tel'),
    fiPosi = $('#fi-posi'),
    fiFax = $('#fi-fax'),
    fiPath = $('#fi-path'),
    fiPassword =$('#fi-password');


if (location.search == "") {
  $('.bit-view').css('display', 'none')
  $('.bit-new').css('display', '')

  $('#add-btn').click(function() {
    managerService.insert(
      {
        name: fiName.val(),
        tel: fiTel.val(),
        email: fiEmail.val(),
        posi: fiPosi.val(),
        fax: fiFax.val(),
        path:fiPath.val(),
        password: fiPassword.val()
      },
      function() {
            location.href = 'index.html'
          },
          function(error) {
            alert('매니저 데이터 등록 중 오류 발생!')
            throw error;
    }) //insertMember()
  }) // click()

} else { // 기존 사용자 정보를 가져온다.
  $('.bit-new').css('display', 'none')
  var no = location.search.substring(1).split('=')[1]

  managerService.detail(
    no,
    function(result) {
      var manager = result
      fiNo.text(manager.mrno)
      fiName.val(manager.name)
      fiTel.val(manager.tel)
      fiEmail.val(manager.email)
      fiPosi.val(manager.posi)
      fiFax.val(manager.fax)
      fiPassword.val(manager.password)

    },
    function(error) {
      alert('매니저 데이터 가져오는 중 오류 발생!')
      throw error
  })

  $('#upd-btn').click(function() {
    managerService.update(
      {
        "no": no,
        "name": fiName.val(),
        "tel": fiTel.val(),
        "email": fiEmail.val(),
        "posi": fiPosi.val(),
        "fax": fiFax.val()

      },
          function(result) {
            alert('변경하였습니다.')
          },

      function(error) {
        alert('매니저 기본 데이터 변경 중 오류 발생!')
        throw error;
    })
  }) // click()


  $('#del-btn').click(function() {
    managerService.delete(no,
     function(result) {
        alert('삭제 하였습니다.')
          location.href = 'index.html'
        },
          function(error) {
              alert('매니저 기본 데이터 삭제 중 오류 발생!')
              throw error;
      })
  }) // click()

} // else

$('#lst-btn').click(function() {
  location.href = "index.html"
})
