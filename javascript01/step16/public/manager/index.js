var pageNoTag = $('#page-no'),
    tbody = $('#manager-tbl > tbody'),
    prevBtn = $('#prev-btn'),
    nextBtn = $('#next-btn'),
    pageSize = 3;

var currPageNo = parseInt(pageNoTag.text())

displayList(1)

function displayList(pageNo) {
  // 서버에서 매니저 목록 데이터를 받아 온다.
  $.getJSON('list.json', {'pageNo':pageNo, 'pageSize': pageSize}, function(result) {
    var list = result.list;
    var totalCount = result.totalCount;
    var lastPageNo = parseInt(totalCount / pageSize) + (totalCount % pageSize > 0 ? 1 : 0)

    /*var templateFn = Handlebars.compile($('#tbody-template').text())
    var generatedHTML = templateFn(result) // 템플릿 함수에 데이터를 넣고 HTML을 생성 한다.
    tbody.text('') //tbody 의 기존 tr 태그들을 지우고
    tbody.html(generatedHTML) // 새 tr 태그들로 설정한다.*/
    tbody.text('')
    for (var t of list) {
      $('<tr>').append($('<td>').text(t.mno))
               .append($('<td>').append(
                 $('<a>').attr('href', 'view.html?no=' + t.mno)
                         .text(t.name == '' ? '(이름 없음)' : t.name)))
               .append($('<td>').text(t.tel))
               .append($('<td>').text(t.email))
               .append($('<td>').text(t.pric))
               .append($('<td>').text(t.fax))
               .append($('<td>').text(t.path))
               .appendTo(tbody)
    }
    currPageNo = pageNo
    pageNoTag.text(currPageNo)

    if (currPageNo == 1) {
      prevBtn.prop('disabled', true)
    } else {
      prevBtn.prop('disabled', false)
    }

    if (currPageNo == lastPageNo) {
      nextBtn.prop('disabled', true)
    } else {
      nextBtn.prop('disabled', false)
    }

  }) // getJSON()
} // displayList()


prevBtn.click(function() {
  displayList(currPageNo - 1)
})

nextBtn.click(function() {
  displayList(currPageNo + 1)
})







//
