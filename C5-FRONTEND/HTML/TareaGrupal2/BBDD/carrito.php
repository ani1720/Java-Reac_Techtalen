<?php
header('Content-Type: application/json');

// Obtener el cuerpo de la petición (puede ser un array de productos)
$productos = json_decode(file_get_contents("php://input"), true);

// Conexión a la base de datos
$conn = new mysqli("localhost", "root", "", "tienda");

if ($conn->connect_error) {
    http_response_code(500);
    echo json_encode(["error" => "Error de conexión"]);
    exit();
}

// Verificamos que lo recibido sea un arreglo
if (!is_array($productos)) {
    http_response_code(400);
    echo json_encode(["error" => "El formato del pedido es incorrecto"]);
    exit();
}

// Recorremos cada producto
foreach ($productos as $data) {
    $producto = $conn->real_escape_string($data['producto']);
    $texto    = $conn->real_escape_string($data['texto']);
    $color    = $conn->real_escape_string($data['color']);
    $fuente   = $conn->real_escape_string($data['fuente']);
    $estilo   = $conn->real_escape_string($data['estilo']);
    $tamanio  = isset($data['tamanio']) ? $conn->real_escape_string($data['tamanio']) : "N/A";

    $sql = "INSERT INTO pedidos (producto, texto, color, fuente, estilo, tamanio)
            VALUES ('$producto', '$texto', '$color', '$fuente', '$estilo', '$tamanio')";

    if (!$conn->query($sql)) {
        http_response_code(500);
        echo json_encode(["error" => "Error al guardar pedido"]);
        $conn->close();
        exit();
    }
}

$conn->close();
echo json_encode(["mensaje" => "Todos los productos fueron guardados correctamente"]);
?>
