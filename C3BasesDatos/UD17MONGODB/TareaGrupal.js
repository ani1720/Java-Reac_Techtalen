// use TIENDACA;

db.createCollection ('USUARIOS');

db.USUARIOS.insertOne({
    _IdUsuario: 1,
    DNI: "67394856G",
    Nombre: "Pepa",
    Correo: "pepita@gmail.com", // Corrección de "Coreo" a "Correo"
    Telefono: "467988360",
    Direccion: "Calle Verdadera 123",
    Tipo: "P"
  });
  
  db.USUARIOS.insertOne({
    _IdUsuario: 2,
    DNI: "57893455L",
    Nombre: "Pepe",
    Correo: "pepito789@gmail.com", // Corrección de "Coreo" a "Correo"
    Telefono: "956654377",
    Direccion: "Calle Falsa 321",
    Tipo: "C"
  });
  
  db.USUARIOS.insertOne({
    _IdUsuario: 3,
    DNI: "88889997AL",
    Nombre: "Marcos",
    Correo: "marquitos123@gmail.com", // Corrección de "Coreo" a "Correo"
    Telefono: "123123123",
    Direccion: "Calle de los pringados 112",
    Tipo: "C"
  });

db.createCollection('PRODUCTOS');
db.PRODUCTOS.insertMany([
    {
        "_IdProducto": 1001,
        "nombre": "Croissant de mantequilla",
        "inventario": 35,
        "precio": 1.5
      },
      {
        "_IdProducto": 1002,
        "nombre": "Alfajor de maicena",
        "inventario": 50,
        "precio": 0.8
      },
      {
        "_IdProducto": 1003,
        "nombre": "Tarta de frutilla",
        "inventario": 12,
        "precio": 3.2
      },
      {
        "_IdProducto": 1005,
        "nombre": "Bizcochuelo marmolado",
        "inventario": 18,
        "precio": 4
      }
]);

db.createCollection('FACTURA');

db.FACTURA.insertMany([{
  _IdFactura: "F1001",
  Fecha: "2025-05-16",
  _IdUsuario: "1",
  Importe_total: 1.50,
},
{
  _IdFactura: "F1002",
  Fecha: "2025-05-16",
  _IdUsuario: "2",
  Importe_total: 0.80,
},
{
  _IdFactura: "F1003",
  Fecha: "2025-05-16",
  _IdUsuario: "3",
  Importe_total: 3.20,
},
{
  _IdFactura: "F1004",
  Fecha: "2025-05-16",
  _IdUsuario: "2",
  Importe_total: 2.50,
},
{
  _IdFactura: "F1005",
  Fecha: "2025-05-16",
  _IdUsuario: "3",
  Importe_total: 4.00,
}]);

db.createCollection('Compra_Venta');

db.Compra_Venta.insertMany([
  {
    _IdPedido: "PED001",
    _IdUsuario: "1",
    _IdFactura: "F1001",
  },
  {
    _IdPedido: "PED002",
    _IdUsuario: "2",
    _IdFactura: "F1002",
  },
  {
    _IdPedido: "PED003",
    _IdUsuario: "3",
    _IdFactura: "F1003",
  },
  {
    _IdPedido: "PED004",
    _IdUsuario: "2",
    _IdFactura: "F1004",
  },
  {
    _IdPedido: "PED005",
    _IdUsuario: "3",
    _IdFactura: "F1005",
  }
]);

db.createCollection('SE_COMPONE');

db.SE_COMPONE.insertMany([
  {
    _IdPedido: "PED001",
    _IdProducto: "1001",
    Cantidad: 2,
  },
  {
    _IdPedido: "PED002",
    _IdProducto: "1002",
    Cantidad: 3,
  },
  {
    _IdPedido: "PED003",
    _IdProducto: "1003",
    Cantidad: 2,
  }
]);
db.DETALLE_FACTURA.find(
  { id_Pedido: "PED001" },
  { _id: 0, _IdSerie: 1, cantidad: 1 }
);
db.PRODUCTOS.find( 
  {"inventario": { "$lt": 20}
    }
    )
db.FACTURA.find(
  { "id_Pedido": "PED002" }
)
