// cahllenge 1
// function that accepts callback funtion
function processUser(name, callback) {
    console.log("Processing.....");
    callback(name);
}

// the callback function itself
const welcome = (name) => console.log("welcome: " + name);

processUser("Pratik", welcome);