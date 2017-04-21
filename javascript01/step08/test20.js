function bit(value) {
  var el = []

  if (value instanceof HTMLElement) {
    el[0] = value
  } else if (value.startsWith('<')) {
    el[0] = document.createElement(value.substr(1, value.length -2))
  } else {
    var list = document.querySelectorAll(value)
    for (var e of list) {
      el.push(e)
    }
  }

  el.append = function(children) {
    if (!(children instanceof Array)) {
      console.error('배열 ㄴㄴ');
      return;
    }
    for (var e of this) {
      for (var child of children) {
        e.appendChild(child)
      }
    }
    return this
  }
  el.html = function(content) {
    for (var e of this) {
      e.innerHTML = content
    }
    return this
  }
  el.click = function(listener) {
    for (var e of this) {
      e.addEventListener('click', listener)
    }
    return this
  }

  el.attr = function(name, value) {
    if (arguments.length < 2) {
      return this[0].getAttribute(name)
    }else {
      for (var e of this) {
        e.setAttribute(name, value)
      }
      return this
    }
  }
  el.appendTo = function(parents) {
    for (var p of parents) {
      for (var e of this) {
        p.appendChild(e)
      }
    }
    return this;
  }

  return el
}




var $ = bit;
