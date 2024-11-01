document.getElementById("hamburger").addEventListener("click", function() {
    const nav = document.getElementById("nav");
    if (nav.style.display === "flex") {
        nav.style.display = "none"; // 非表示
    } else {
        nav.style.display = "flex"; // 表示
    }
});

window.onload = function() {
    const loadingText = document.getElementById("loading-text");
    loadingText.style.opacity = 1; // ロード完了時にテキストを表示
};
