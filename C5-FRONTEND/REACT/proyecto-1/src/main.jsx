//Promesas
const getImagen = async () => {
  try {
    const apiKey = "C1khQe3Z7R1W2lfTO9myKeuShdqFYSGC";
    const resp = await fetch(
      `http://api.giphy.com/v1/gifs/random?api_key=${apiKey}`
    );
    const { data } = await resp.json();

    const { url } = data.images.original;

    const img = document.createElement("img");
    img.src = url;
    document.body.append(img);
  } catch (error) {
    // manejo del error
    console.error(error);
    // Puedes mostrar un mensaje al usuario o realizar alguna acción específica
  }
};

getImagen();


// console.log("Hola, mundo desde main.jsx");

// const name = "Ani";
// const subname = "Bueno";

// console.log(`Hola, ${name} ${subname}`);

// // Funciones en JS

// //Función normal
// function sumar( a, b ) {
//     return a + b;
// }

// // Función de flecha
// const saludar1 = ( nombre ) => {
//     return `Hola, ${ nombre }`;
// }

// // Función de flecha simplificada
// const saludar2 = ( nombre, apellido ) => `Hola, ${ nombre, apellido }`;

// // Función de flecha sin parámetros con retorno implícito
// const saludar3 = () => `Hola Mundo`;

// // Función de flecha simplificada con un solo parámetro
// // const saludar = nombre => `Hola, ${ nombre }`;

// // console.log( saludar('Marc') )

// console.log( saludar2("Pedro","Jiménez") );
// console.log( saludar3("Andreu") );


// const getUser = () => ({
//         uid: 'ABC123',
//         username: 'El_Papi1502'
// });


// const user = getUser();
// console.log(user);

// // Tarea
// const getUsuarioActivo = ( nombre ) =>({
//     uid: 'ABC567',
//     username: nombre
// })

// const usuarioActivo = getUsuarioActivo('Fernando');
// console.log( usuarioActivo );
// const persona = {
//     nombre: 'Peter',
//     edad: 18,
//     clave: 'Spiderman'
// };

// // Desestructuración del objeto persona
// const { nombre, edad, clave } = persona;

// console.log(nombre); // 'Peter'
// console.log(edad);   // 18
// console.log(clave);  // 'Spiderman'


// const usarContexto = ({ clave, nombre, edad, rango = 'Vecino amigable' }) => {

//     // Aquí podrías hacer cualquier lógica adicional
//     return {
//         nombreClave: clave,
//         anys: edad,
//         latlng: {
//             lat: 40.7128,   // Coordenadas de Nueva York 🗽
//             lng: -74.0060
//         }
//     }
// };

// // Desestructuración al llamar la función
// const { nombreClave, anys, latlng: { lat, lng } } = usarContexto(persona);

// console.log(nombreClave, anys);  // 'Spiderman', 18
// console.log(lat, lng);            // 40.7128, -74.0060