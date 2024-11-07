document.addEventListener('DOMContentLoaded', function () {
    // IntersectionObserverの設定
    const options = {
        root: null, // ビューポート
        rootMargin: '0px',
        threshold: 0.1 // 10%が可視になったときに発火
    };

    const observer = new IntersectionObserver((entries, observer) => {
        entries.forEach(entry => {
            if (entry.isIntersecting) {
                // 要素が可視になったときに"visible"クラスを追加
                entry.target.classList.add('visible');
                observer.unobserve(entry.target); // 一度だけ実行するために監視解除
            }
        });
    }, options);

    // 監視対象のセクションを取得
    const genresAndProgramming = document.querySelectorAll(
        '#animal, #baseball, #soccer, #sports, #enta, #photo, #html_css, #java, #js, #jsp_serv, #mysql'
    );

    // 監視対象のセクションに対して一括処理
    genresAndProgramming.forEach(section => {
        section.classList.add('fade-in'); // 初期状態でfade-inクラスを追加
        observer.observe(section); // 監視を開始
    });
});


// 検索フォームの処理
document.querySelector('.search-bar form').addEventListener('submit', function(event) {
    event.preventDefault(); // フォームのデフォルト送信を防ぐ

    const query = document.querySelector('input[name="query"]').value.toLowerCase(); // 入力値を小文字に変換
    const resultsContainer = document.getElementById('search-results');
    resultsContainer.innerHTML = ''; // 以前の検索結果をクリア

    // 検索対象のテキストを定義
    const quizItems = [
        { title: "動物クイズ", description: "動物に関する知識を試そう！！", genre: "AnimalQuiz" },
        { title: "野球クイズ", description: "野球に関する知識を試そう！！", genre: "BaseballQuiz" },
        { title: "サッカークイズ", description: "サッカーに関する知識を試そう！！", genre: "SoccerQuiz" },
        { title: "スポーツクイズ", description: "スポーツ総合に関する知識を試そう！！", genre: "SportsQuiz" },
        { title: "芸能クイズ", description: "芸能関係に関する知識を試そう！！", genre: "EntertainmentQuiz" },
        { title: "写真クイズ", description: "写真に関する知識を試そう！！", genre: "PhotographQuiz" },
        { title: "HTML/CSS基礎問", description: "HTML5/CSS3に関する知識を試そう！！", genre: "Html_Css" },
        { title: "JavaScript基礎問", description: "JavaScriptに関する知識を試そう！！", genre: "JavaScript" },
        { title: "Java基礎問", description: "Javaに関する知識を試そう！！", genre: "Java_F" },
        { title: "JSP/Servlet基礎問", description: "JSP/Servletに関する知識を試そう！！", genre: "Jsp_Servlet" },
        { title: "DATABASE(MySQL)基礎問", description: "DATABASE(MySQL)に関する知識を試そう！！", genre: "Mysql" },
    ];

    // 検索対象に一致するアイテムをフィルタリング
    const results = quizItems.filter(item => 
        item.title.toLowerCase().includes(query) || 
        item.description.toLowerCase().includes(query)
    );

    // 検索結果があれば表示
    if (results.length > 0) {
        results.forEach(item => {
            const resultItem = document.createElement('div');
            resultItem.innerHTML = `<h4>${item.title}</h4><p>${item.description}</p>`;
            resultItem.classList.add('search-result');
            resultItem.onclick = () => {
                // クイズ選択の処理をここに追加
                alert(`選択されたクイズ: ${item.title}`);
            };
            resultsContainer.appendChild(resultItem);
        });
        resultsContainer.style.display = 'block'; // 検索結果を表示
    } else {
        // 該当する結果がない場合
        resultsContainer.innerHTML = '<p>該当する結果はありません。</p>';
        resultsContainer.style.display = 'block';
    }
});