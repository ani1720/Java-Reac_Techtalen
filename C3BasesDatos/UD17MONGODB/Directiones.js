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

db.Despachos.updateOne({ _id: 1 }, { $set: { capacidad: 5 } })
db.Despachos.updateOne({ _id: 2 }, { $set: { capacidad: 6 } })

db.Despachos.insertMany([
  { _id: 5, capacidad: 2 },
  { _id: 6, capacidad: 3 },
  { _id: 7, capacidad: 4 },
  { _id: 8, capacidad: 5 },
  { _id: 9, capacidad: 6 }
])
db.Directores.insertMany([
  {
    _id: "33445566E",
    NomApels: "Marina Torres",
    DNIJefe: "22334455D",
    despacho: 5
  },
  {
    _id: "44556677F",
    NomApels: "José Ortega",
    DNIJefe: "11223344C",
    despacho: 6
  },
  {
    _id: "55667788G",
    NomApels: "Claudia Vidal",
    DNIJefe: "33445566E",
    despacho: 7
  },
  {
    _id: "66778899H",
    NomApels: "David Morales",
    DNIJefe: "33445566E",
    despacho: 8
  },
  {
    _id: "77889900J",
    NomApels: "Nuria Salas",
    DNIJefe: "44556677F",
    despacho: 9
  }
])

