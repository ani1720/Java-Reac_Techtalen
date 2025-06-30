function guardarEnCarrito() {
  const texto = document.getElementById("inputTexto").value || "Tu texto aquí";
  const color = document.getElementById("inputColor").value;
  const fuente = document.getElementById("fuente").value;
  const estilo = document.getElementById("estilo").value;

  const item = {
    producto: "Taza personalizada",
    texto,
    color,
    fuente,
    estilo,
    tamanio,
  };

  localStorage.setItem("carritoPersonalizado", JSON.stringify(item));
  alert("¡Producto añadido al carrito!");
}
function fetchCarrito() {
  const texto =
    document.getElementById("inputTextoCustom").value || "Tu texto aquí";
  const color = document.getElementById("inputColorCustom").value;
  const fuente = document.getElementById("fuenteCustom").value;
  const estilo = document.getElementById("estiloCustom").value;
  const tamanio = document.getElementById("tamanioFuenteCustom").value;

  agregarProductoAlCarrito("Camisa personalizada", {
    texto: "inputTextoCamisa",
    color: "inputColorCamisa",
    fuente: "fuenteCamisa",
    estilo: "estiloCamisa",
  });

  localStorage.setItem("carritoCamisa", JSON.stringify(item));
  alert("¡Producto añadido al carrito!");
}
