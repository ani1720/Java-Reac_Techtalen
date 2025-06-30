function enviarPedido() {
  const carrito = JSON.parse(localStorage.getItem('carritoPersonalizado')) || [];

  for (let i = 0; i < carrito.length; i++) {
    fetch('guardar_pedido.php', {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify(carrito[i])
    })
    .then(res => res.json())
    .then(data => {
      console.log(`Producto ${i + 1}: ${data.mensaje || 'Guardado'}`);
    })
    .catch(err => {
      console.error(`Error en producto ${i + 1}:`, err);
    });
  }

  alert('Todos los pedidos han sido enviados');
  localStorage.removeItem('carritoPersonalizado');
}
function agregarProductoAlCarrito(producto, ids) {
  const texto = document.getElementById(ids.texto).value || "Tu texto aquí";
  const color = document.getElementById(ids.color).value;
  const fuente = document.getElementById(ids.fuente).value;
  const estilo = document.getElementById(ids.estilo).value;

  const item = {
    producto,
    texto,
    color,
    fuente,
    estilo,
  };

  // Recupera o crea el array de productos
  const carrito = JSON.parse(localStorage.getItem("carritoGeneral")) || [];

  carrito.push(item);

  localStorage.setItem("carritoGeneral", JSON.stringify(carrito));
  alert(`¡${producto} añadido al carrito!`);
}
