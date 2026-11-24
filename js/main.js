// rakibrary.com — small, dependency-free site scripts
(function () {
  // Mobile menu toggle
  var toggle = document.querySelector('.nav-toggle');
  var links = document.getElementById('nav-links');
  if (toggle && links) {
    toggle.addEventListener('click', function () {
      var open = links.classList.toggle('open');
      toggle.setAttribute('aria-expanded', open ? 'true' : 'false');
    });
  }

  // Footer year
  document.querySelectorAll('[data-year]').forEach(function (el) {
    el.textContent = new Date().getFullYear();
  });

  // Project filters (projects.html)
  var filterBtns = document.querySelectorAll('.filter-btn');
  filterBtns.forEach(function (btn) {
    btn.addEventListener('click', function () {
      var f = btn.getAttribute('data-filter');
      filterBtns.forEach(function (b) { b.setAttribute('aria-pressed', b === btn ? 'true' : 'false'); });
      document.querySelectorAll('.project-group').forEach(function (g) {
        g.hidden = !(f === 'all' || g.getAttribute('data-group') === f);
      });
    });
  });

  // "Show more" buttons reveal hidden gallery items
  document.querySelectorAll('[data-show-more]').forEach(function (btn) {
    btn.addEventListener('click', function () {
      var target = document.getElementById(btn.getAttribute('data-show-more'));
      if (!target) return;
      target.querySelectorAll('[data-extra]').forEach(function (el) { el.hidden = false; });
      btn.remove();
    });
  });

  // Lightbox for any button with data-full
  var dialog = document.querySelector('.lightbox');
  if (dialog && typeof dialog.showModal === 'function') {
    var img = dialog.querySelector('img');
    var cap = dialog.querySelector('p');
    document.addEventListener('click', function (e) {
      var trigger = e.target.closest('[data-full]');
      if (!trigger) return;
      img.src = trigger.getAttribute('data-full');
      img.alt = trigger.getAttribute('data-caption') || '';
      cap.textContent = trigger.getAttribute('data-caption') || '';
      dialog.showModal();
    });
    dialog.querySelector('.lightbox-close').addEventListener('click', function () { dialog.close(); });
    dialog.addEventListener('click', function (e) { if (e.target === dialog) dialog.close(); });
  }
})();
