let arr = [];

function renderArray() {
  const display = document.getElementById("arrayDisplay");
  display.innerHTML = "";
  arr.forEach((val, idx) => {
    const div = document.createElement("div");
    div.className = "item";
    div.textContent = val;
    display.appendChild(div);
  });
}

function addItem() {
  const val = document.getElementById("inputValue").value;
  if (val) {
    arr.push(val);
    renderArray();
    document.getElementById("inputValue").value = "";
  }
}

function removeItem() {
  arr.pop();
  renderArray();
}

function searchItem() {
  const val = document.getElementById("inputValue").value;
  const idx = arr.indexOf(val);
  alert(idx !== -1 ? `Found at index ${idx}` : "Not found");
}

function reverseArray() {
  arr.reverse();
  renderArray();
}
