// use almacenes
db.createCollection("almacenes");
db.createCollection("cajas");

db.almacenes.insertMany([
  { _id: 1, lugar: "Madrid", capacidad: 1000 },
  { _id: 2, lugar: "Barcelona", capacidad: 800 },
  { _id: 3, lugar: "Valencia", capacidad: 600 },
  { _id: 4, lugar: "Sevilla", capacidad: 750 },
  { _id: 5, lugar: "Bilbao", capacidad: 500 }
])
db.cajas.insertMany([
  { _id: "A0001", contenido: "Libros", valor: 120.50, almacen_id: 1 },
  { _id: "A0002", contenido: "Electrónica", valor: 950.00, almacen_id: 2 },
  { _id: "A0003", contenido: "Ropa", valor: 350.75, almacen_id: 3 },
  { _id: "A0004", contenido: "Juguetes", valor: 210.40, almacen_id: 4 },
  { _id: "A0005", contenido: "Papelería", valor: 85.00, almacen_id: 1 }
])

db.cajas.aggregate([
  {
    $lookup: {
      from: "almacenes",
      localField: "almacen_id",
      foreignField: "_id",
      as: "almacen"
    }
  },
  { $unwind: "$almacen" }
])

