// Function to smoothly scroll to a section
function scrollToSection(id) {
    document.getElementById(id).scrollIntoView({ behavior: "smooth" });
}

// Function to scroll back to top
function scrollToTop() {
    window.scrollTo({ top: 0, behavior: "smooth" });
}

// Show/Hide Scroll to Top Button
window.onscroll = function() {
    let button = document.getElementById("scrollTopBtn");
    if (document.documentElement.scrollTop > 100) {
        button.style.display = "block";
    } else {
        button.style.display = "none";
    }
};
