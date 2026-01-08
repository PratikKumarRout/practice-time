// cahllenge 1
async function getweather(city) {

    const url = `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${apiKey}&units=metric`;

    try {
        const response = await fetch(url);
        if (!response.ok) {
            if (response.status === 404) throw new Error("City not found. check you spelling!");
            if (response.status === 401) throw new Error("Invalid api key. did you activate it ?");
            throw new Error(`http error: ${response.status}`);
        }
        const data = await response.json();

        // console.log(JSON.stringify(data, null, 2));
        console.log( city +" "+ data.wind.speed);

    } catch (error) {
        console.error("error: " + error.mesage);
    }
}

getweather("London");
getweather("Balasore");
getweather("Bhubaneswar");
