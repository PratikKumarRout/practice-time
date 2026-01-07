// cahllenge 1
function processUser(name, callback) {
    console.log("Processing.....");
    callback(name);
}

const welcome = (user) => console.log("welcome: " + user);

processUser("Pratik", welcome);