let queue = [];

function renderQueue() {
  const display = document.getElementById("queueDisplay");
  display.innerHTML = "";
  queue.forEach(task => {
    const div = document.createElement("div");
    div.className = "task";
    div.textContent = task;
    display.appendChild(div);
  });
}

function enqueue() {
  const val = document.getElementById("taskInput").value;
  if (val) {
    queue.push(val);
    renderQueue();
    document.getElementById("taskInput").value = "";
  }
}

function dequeue() {
  if (queue.length > 0) {
    alert(`Processing: ${queue[0]}`);
    queue.shift();
    renderQueue();
  } else {
    alert("Queue is empty");
  }
}
