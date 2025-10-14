let undoStack = [];
let redoStack = [];
const editor = document.getElementById("editor");

function handleInput() {
  undoStack.push(editor.value);
  redoStack = []; // clear redo stack on new input
}

function undo() {
  if (undoStack.length > 1) {
    redoStack.push(undoStack.pop());
    editor.value = undoStack[undoStack.length - 1];
  }
}

function redo() {
  if (redoStack.length > 0) {
    const redoValue = redoStack.pop();
    undoStack.push(redoValue);
    editor.value = redoValue;
  }
}
