import React from "react";
import ReactDOM from "react-dom/client";
import App from "./App";
import ComponenteProp from "./ComponenteProps";
// // import SegundoComponente from "./SegundosComponentes";
// import Header from "./Header";
// import Footer from "./footer";
// import SegundoComponente from "./SegundosComponentes";
// import MouseExample from "./mouseEvento";
// import PointerExample from "./EventosPointer";
// import FocusExample from "./FocusExample";
// import KeyboardExample from "./KeyBordExample";
// import ContadorBotones from "./HookUseStateBoton"

// const apiKey = "tMyhZKb8CG7goaU6VVwjtbUDEcr6mJAY";
// const peticion = fetch(`http://api.giphy.com/v1/gifs/random?api_key=${apiKey}`);
// console.log("Petición realizada a la API de Giphy");
// peticion
//   .then((resp) => resp.json())
//   .then(({ data }) => {
//     const { url } = data.images.original;
//     const img = document.createElement("img");
//     img.src = url;
//     document.body.append(img);
//   })
//   .catch(console.warn);
    //funcion "Componente"
  // function App() {
  //   //document.createElement(h1);
  //   return(<h1>Hola Mundo</h1>);
  // }
  ReactDOM.createRoot(document.getElementById('root')).render(
    <React.StrictMode>
      <ComponenteProp title="Buen dia" subtitulo={123}/>
      {/* <Header/>
      <App />
      <SegundoComponente/>
      {/* <ContadorBotones/> */}
      {/* <MouseExample/>
      <PointerExample/>
      <FocusExample/>
      <KeyboardExample/> */}
      {/* <Footer/> */} 
    </React.StrictMode>
  );