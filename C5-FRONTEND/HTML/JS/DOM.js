// function cambiarColor() {
// let items = document.getElementsByClassName('destacado');
// for(let i= 0; i< items.length; i++) {
//     items[i].style.border = '3px solid blue';
//     items[i].style.backgroundColor = 'black'
// }
// }
// function cambiarTamañoTitulo() {
//     let titulos = document.getElementsByClassName('titulo');
//     for(let i=0; i< titulos.length; i++) {
//         titulos[i].style.fontSize = '5rem';
//         titulos[i].style.color = 'red';
//     }
// }
function cambiaColor() {
    const parrafos = document.getElementsByTagName('p');
    for(let i= 0 ; i < parrafos.length; i++) {
        parrafos[i].style.color = 'green';
        // parrafos[i].style.fontSize = '2rem';
    }
}
    //COntador de imagenes
    const imagenes = document.getElementsByTagName('img');
    for(let i = 0; i < imagenes.length; i++) {
        console.log("Numero de imagenes: ", imagenes.length);
    }
    //cambiar texto de botones
    const botones = document.getElementsByTagName('button');
    for(let i = 0; i < botones.length; i ++) {
        botones[i].innerText = 'Haz click';
    }
