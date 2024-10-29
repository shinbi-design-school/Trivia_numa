document.addEventListener('DOMContentLoaded', function () {
    const options = {
        root: null, // ビューポート
        rootMargin: '0px',
        threshold: 0.1 // 10%が可視になったときに発火
    };

    const observer = new IntersectionObserver((entries, observer) => {
        entries.forEach(entry => {
            if (entry.isIntersecting) {
                entry.target.classList.add('visible'); // visibleクラスを追加
                observer.unobserve(entry.target); // 一度だけ実行するために監視を解除
            }
        });
    }, options);

    // 対象のセクションを監視
    const genres = document.querySelectorAll('#genre');
    const programming = document.querySelectorAll('#programming');

    genres.forEach(genre => {
        genre.classList.add('fade-in'); // fade-inクラスを追加
        observer.observe(genre); // 監視を開始
    });

    programming.forEach(prog => {
        prog.classList.add('fade-in'); // fade-inクラスを追加
        observer.observe(prog); // 監視を開始
    });
});
