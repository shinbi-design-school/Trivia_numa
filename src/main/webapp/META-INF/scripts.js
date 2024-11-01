document.getElementById("hamburger").addEventListener("click", function() {
    const nav = document.getElementById("nav");
    if (nav.style.display === "flex") {
        nav.style.display = "none"; // 非表示
    } else {
        nav.style.display = "flex"; // 表示
    }
});

