// use TiendaInfor
db.createCollection("Fabricante")
db.createCollection("Articulos")

db.Fabricante.insertMany([
  { _id: 1, nombre: "Intel" },
  { _id: 2, nombre: "AMD" },
  { _id: 3, nombre: "NVIDIA" },
  { _id: 4, nombre: "ASUS" },
  { _id: 5, nombre: "Kingston" },
  { _id: 6, nombre: "Samsung" },
  { _id: 7, nombre: "Corsair" },
  { _id: 8, nombre: "Gigabyte" },
  { _id: 9, nombre: "MSI" },
  { _id: 10, nombre: "Western Digital" }
])

db.articulos.insertMany([
  { _id: "A100", nombre: "Intel Core i7 13700K", precio: 420.00, fabricante: 1 },
  { _id: "A101", nombre: "AMD Ryzen 9 7900X", precio: 480.00, fabricante: 2 },
  { _id: "A102", nombre: "NVIDIA RTX 4070 Ti", precio: 799.00, fabricante: 3 },
  { _id: "A103", nombre: "ASUS ROG STRIX B550-F", precio: 180.00, fabricante: 4 },
  { _id: "A104", nombre: "Kingston Fury 16GB DDR4", precio: 75.00, fabricante: 5 },
  { _id: "A105", nombre: "Procesador Intel i9", precio: 550.00, fabricante: 1 },
  { _id: "A106", nombre: "Tarjeta gráfica NVIDIA RTX 4070", precio: 680.00, fabricante: 3 },
  { _id: "A107", nombre: "Memoria RAM Kingston 16GB", precio: 75.00, fabricante: 4 },
  { _id: "A108", nombre: "Disco SSD Samsung 1TB", precio: 120.00, fabricante: 5 },
  { _id: "A109", nombre: "Procesador AMD Ryzen 7", precio: 430.00, fabricante: 2 }
])

