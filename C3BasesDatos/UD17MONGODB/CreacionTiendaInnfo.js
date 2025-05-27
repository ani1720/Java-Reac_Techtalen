// use TiendaInfor
db.createCollection("Fabricante")
db.createCollection("Articulos")

db.Fabricante.insertMany([
  { _id: 1, nombre: "Intel" },
  { _id: 2, nombre: "AMD" },
  { _id: 3, nombre: "NVIDIA" },
  { _id: 4, nombre: "ASUS" },
  { _id: 5, nombre: "Kingston" },
])

db.articulos.insertMany([
  { _id: "A100", nombre: "Intel Core i7 13700K", precio: 420.00, fabricante: 1 },
  { _id: "A101", nombre: "AMD Ryzen 9 7900X", precio: 480.00, fabricante: 2 },
  { _id: "A102", nombre: "NVIDIA RTX 4070 Ti", precio: 799.00, fabricante: 3 },
  { _id: "A103", nombre: "ASUS ROG STRIX B550-F", precio: 180.00, fabricante: 4 },
  { _id: "A104", nombre: "Kingston Fury 16GB DDR4", precio: 75.00, fabricante: 5 },
])

