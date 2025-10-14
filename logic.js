const fill = document.querySelector(".fill");
const counter = document.getElementById("counter");

let percent = 0;

function updatePie() {
  percent = (percent + 1) % 101;
  const offset = 283 - (283 * percent) / 100;
  fill.style.strokeDashoffset = offset;
  counter.textContent = percent + "%";

  // Color logic
  if (percent <= 10) fill.style.stroke = "#2E7D32";       // Green
  else if (percent <= 20) fill.style.stroke = "#558B2F";
  else if (percent <= 30) fill.style.stroke = "#FBC02D";   // Yellow
  else if (percent <= 40) fill.style.stroke = "#FFA000";
  else if (percent <= 50) fill.style.stroke = "#F57C00";
  else if (percent <= 60) fill.style.stroke = "#E64A19";
  else if (percent <= 70) fill.style.stroke = "#D84315";
  else if (percent <= 80) fill.style.stroke = "#BF360C";
  else if (percent <= 90) fill.style.stroke = "#B71C1C";
  else fill.style.stroke = "#880E4F";                      // Deep red

  requestAnimationFrame(() => setTimeout(updatePie, 50));
}

updatePie();
