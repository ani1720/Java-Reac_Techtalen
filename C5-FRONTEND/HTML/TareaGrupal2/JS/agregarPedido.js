 function agregarTazaAlCarrito() {
      const texto = document.getElementById("inputTexto").value || "Tu texto aquí";
      const precio = 9.99; // Precio de la taza personalizada
      const nombre = "Taza personalizada: " + texto;
  
      const datos = {
        nombre: nombre,
        precio: precio
      };
  
      fetch("guardar_carrito.php", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(datos)
      })
      .then(response => response.text())
      .then(msg => {
        alert(msg);
        fetchCarrito();
      })
      .catch(err => {
        console.error("Error al guardar la taza:", err);
      });
    }
     function agregarAlCarrito() {
      const texto = document.getElementById("inputTextoCustom").value || "Tu texto aquí";
      const precio = 14.99; // Define un precio por defecto o cámbialo dinámicamente si lo necesitas
      const nombre = "Camisa personalizada: " + texto;
  
      const datos = {
        nombre: nombre,
        precio: precio
      };
  
      fetch("guardar_carrito.php", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(datos)
      })
      .then(response => response.text())
      .then(msg => {
        alert(msg);
        fetchCarrito(); // Mensaje que viene desde PHP
      })
      .catch(err => {
        console.error(err);
        alert("Error al guardar en el carrito.");
      });
    }
     function borrarCarrito() {
  fetch("borrar_carrito.php", {
    method: "POST"
  })
    .then(res => res.text())
    .then(msg => {
      alert(msg);
      fetchCarrito(); // Actualiza la vista previa
    })
    .catch(err => {
      console.error("Error al borrar el carrito:", err);
    });
}