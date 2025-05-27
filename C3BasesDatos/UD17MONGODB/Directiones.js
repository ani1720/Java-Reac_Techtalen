// use directores
db.Despachos.insertMany([
  { _id: 1, capacidad: 2 },
  { _id: 2, capacidad: 4 },
  { _id: 3, capacidad: 1 },
  { _id: 4, capacidad: 3 }
])
db.Directores.insertMany([
  {
    _id: "12345678A",
    NomApels: "Laura Pérez",
    DNIJefe: null,
    despacho: 1
  },
  {
    _id: "87654321B",
    NomApels: "Carlos García",
    DNIJefe: "12345678A",
    despacho: 2
  },
  {
    _id: "11223344C",
    NomApels: "Ana López",
    DNIJefe: "12345678A",
    despacho: 3
  },
  {
    _id: "22334455D",
    NomApels: "Luis Ramírez",
    DNIJefe: "87654321B",
    despacho: 4
  }
])
