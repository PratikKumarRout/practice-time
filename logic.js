// challenge 1
async function wrapper() {
    try {
        await fetchData();
    } catch (error) {
        console.log("Error caught in wrapper.");

    }
}

wrapper().catch(() => console.log("error caught in caller"));