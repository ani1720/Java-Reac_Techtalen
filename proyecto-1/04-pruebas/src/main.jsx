const apiKey = "tMyhZKb8CG7goaU6VVwjtbUDEcr6mJAY";
const peticion = fetch(`http://api.giphy.com/v1/gifs/random?api_key=${apiKey}`);
console.log("Petición realizada a la API de Giphy");
peticion
  .then((resp) => resp.json())
  .then(({ data }) => {
    const { url } = data.images.original;
    const img = document.createElement("img");
    img.src = url;
    document.body.append(img);
  })
  .catch(console.warn);