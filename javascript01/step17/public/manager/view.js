var viewTags = $('.bit-view'),
    newTags = $('.bit-new'),
    fiNo = $('#fi-no'),
    fiEmail = $('#fi-email'),
    fiTel=$('#fi-tel')
    fiName = $('#fi-name'),
    fiPric = $('#fi-pric'),
    fiFax= $('#fi-fax'),
    fiPath = $('#fi-path');

var no = 0
try {
  no = location.href.split('?')[1].split('=')[1]
} catch (err) {}

if (no == 0) { // 새 매니저 등록
  viewTags.css('display', 'none')

  $('#add-btn').click(function() {
    $.post('add.json', {
      'email': fiEmail.val(),
      'name': fiName.val(),
      'tel': fiTel.val(),
      'pric': fiPric.val(),
      'fax': fiFax.val(),
      'path': fiPath.val()

    }, function(result) {
      location.href = 'index.html'

    }, 'json')
  })
} else { // 학생 정보 조회
  newTags.css('display', 'none')

  $.getJSON('detail.json', {'no': no}, function(result) {
    fiNo.text(result.mno)
    fiEmail.val(result.email)
    fiName.val(result.name)
    fiTel.val(result.tel)
    fiPric.val(result.pric)
    fiFax.val(result.fax)
    fiPath.val(result.path)
  })
}

$('#upd-btn').click(function() {
    $.post('update.json', {
      'no': fiNo.text(),
      'email': fiEmail.val(),
      'name': fiName.val(),
      'tel': fiTel.val(),
      'pric': fiPric.val(),
      'fax': fiFax.val(),
      'path': fiPath.val()
    }, function(result) {
      location.href = 'index.html'
    }, 'json')
  })

$('#del-btn').click(function() {
  $.getJSON('delete.json', {'no': no}, function(result) {
    location.href= 'index.html'
  })
})



//
