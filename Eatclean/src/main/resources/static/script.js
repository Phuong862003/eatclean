function scrollLeft() {
  document.querySelector(".horizontal-scroll-container").scrollBy({
    left: -200,
    behavior: "smooth"
  });
}

function scrollRight() {
  document.querySelector(".horizontal-scroll-container").scrollBy({
    left: 200,
    behavior: "smooth"
  });
}
