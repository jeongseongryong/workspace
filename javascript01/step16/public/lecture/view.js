var viewTags = $('.bit-view'),
    newTags = $('.bit-new'),
    fiNo = $('#fi-no'),
    fiTitle = $('#fi-title'),
    fiContent=$('#fi-content')
    fiSdt = $('#fi-sdt'),
    fiEdt = $('#fi-edt'),
    fiThrs = $('#fi-thrs')
    fiQty= $('#fi-qty'),
    fiPrice = $('#fi-price'),
    fiClassroom = $('#fi-classroom'),
    fiManager = $('#fi-manager');

var no = 0
try {
  no = location.href.split('?')[1].split('=')[1]
} catch (err) {}

if (no == 0) { // 새 강사 등록
  viewTags.css('display', 'none')

  $('#add-btn').click(function() {
    $.post('add.json', {
      'title': fiTitle.val(),
      'content': fiContent.val(),
      'sdt': fiSdt.val(),
      'edt': fiEdt.val(),
      'thrs':fiThrs.val(),
      'qty': fiQty.val(),
      'price': fiPrice.val(),
      'classroom': fiClassroom.val(),
      'manager': fiManager.val()

    }, function(result) {
      location.href = 'index.html'

    }, 'json')
  })
} else { // 학생 정보 조회
  newTags.css('display', 'none')

  $.getJSON('detail.json', {'no': no}, function(result) {
    fiNo.text(result.lno)
    fiTitle.val(result.title)
    fiContent.val(result.content)
    fiSdt.val(result.std)
    fiEdt.val(result.edt)
    fiThrs.val(result.thrs)
    fiQty.val(result.qty)
    fiPrice.val(result.price)
    fiClassroom.val(result.classroom)
    fiManager.val(result.manager)
  })
}

$('#upd-btn').click(function() {
    $.post('update.json', {
      'no': fiNo.text(),
      'title': fiTitle.val(),
      'content': fiContent.val(),
      'std': fiSdt.val(),
      'edt': fiEdt.val(),
      'thrs':fiThrs.val(),
      'qty': fiQty.val(),
      'price': fiPrice.val(),
      'classroom': fiClassroom.val(),
      'manager': fiManager.val()

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
