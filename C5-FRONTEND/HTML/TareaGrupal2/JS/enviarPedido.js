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
    precio
  };

  // Recupera o crea el array de productos
  const carrito = JSON.parse(localStorage.getItem("carritoGeneral")) || [];

  carrito.push(item);

  localStorage.setItem("carritoGeneral", JSON.stringify(carrito));
  alert(`¡${producto} añadido al carrito!`);
}
function fetchCarrito() {
    const texto = document.getElementById('inputTextoCustom').value.trim();
    const color = document.getElementById('inputColorCustom').value;
    const tamanio = document.getElementById('tamanioFuenteCustom').value;
    const fuente = document.getElementById('fuenteCustom').value;
    const estilo = document.getElementById('estiloCustom').value;

    if (!texto) {
      alert('Por favor escribe un texto para tu camisa.');
      return;
    }

    const datosCamisa = {
      producto: 'Camisa personalizada',
      texto: texto,
      color: color,
      tamanioFuente: tamanio + 'px',
      fuente: fuente,
      estilo: estilo
      precio: 14.99 // Precio de la camisa personalizada
    };

    localStorage.setItem('carritoCamisa', JSON.stringify(datosCamisa));
    alert('Camisa añadida al carrito 🧺');
  }
