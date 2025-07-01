<?php
$conexion = new mysql("localhost", "root", "", "tienda");
if ($conexion->connect_error) {
    die("Error de conexión: " . $conexion->connect_error);
}
?>