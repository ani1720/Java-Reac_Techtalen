// import { Fragment } from "react" //con esto no obligamos a que se aniden con div
// const SegundoComponente = () => {
//     return (
//         <Fragment>
//         <div>Segundo Componente</div>
//         <p>Esto es un parrafo</p>
//         </Fragment>
//     )
// }
import Louis from "./Louis";
import Lauren from "./Lauren";
import MyButton from "./Button";

const nombre = 'Anileth';
const nuevoMensaje = {
    mensaje: 'Mamahuevo',
    nombre: 'Glu Glu'
};
// const boleano = true;
// let content ;
// if (boleano) {
//     content = <Louis/>
// } else {
//     conten = <Lauren/>
// }

const SegundoComponente = () => {
  // const nombre = 'Ani'; //Es mas eficiente generarlo fuera
    return (
        //Para no usar Fragment se puede anidar con solo los signos <>
        <>
        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Sapiente ex velit provident cumque delectus autem rem, hic doloremque nesciunt suscipit tenetur. Est sequi fugiat provident maiores quis. Fugit, quo repudiandae!</p>
        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Eos deleniti dolores incidunt repudiandae dolor minima, doloremque reprehenderit veritatis quidem nam ipsum corrupti eum, illo dolorem inventore consequatur eveniet, laboriosam sapiente!</p>
        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Consequuntur modi repudiandae ad quidem. Adipisci, ipsa alias laborum perspiciatis, ipsam possimus quae mollitia dolore officiis, repudiandae quisquam cumque ex deleniti neque.</p>
        {/* <p>{50+60}</p>
        <p>{nombre}</p> */}
        <p>{nuevoMensaje.mensaje}</p>
        <p>{boleano}</p>
        <p>{nuevoMensaje.nombre}</p>
        <MyButton/>
        <button>Otro boton</button>
        <div>{content}</div>
        <div>{boleano ? <Louis /> : <Lauren />}</div>
        <code>{JSON.stringify(nuevoMensaje)}</code>
        </>
    )
}


export default SegundoComponente