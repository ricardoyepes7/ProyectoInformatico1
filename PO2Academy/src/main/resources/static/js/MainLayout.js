  document.addEventListener('DOMContentLoaded', () => {
        const title = document.getElementById("head-title").getAttribute('data-page');
        if (title === "home") document.getElementById("nav-button-home").classList.add("active")
        if (title === "glossary") document.getElementById("nav-button-glossary").classList.add("active");
        if (title === "challenge") document.getElementById("nav-button-challenge").classList.add("active");
        if (title === "tutorial") document.getElementById("nav-button-tutorial").classList.add("active");
    })