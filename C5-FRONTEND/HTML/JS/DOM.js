function cambiarColor() {
let items = document.getElementsByClassName('destacado');
for(let i= 0; i< items.length; i++) {
    items[i].style.border = '3px solid blue';
    items[i].style.backgroundColor = 'black'
}
}
function cambiarTamañoTitulo() {
    let titulos = document.getElementsByClassName('titulo');
    for(let i=0; i< titulos.length; i++) {
        titulos[i].style.fontSize = '5rem';
        titulos[i].style.color = 'red';
    }
}
