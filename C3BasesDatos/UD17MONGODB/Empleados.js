// use Empleados
db.createCollection("Departamentos")
db.createCollection("Empleados")

db.Departamentos.insertMany([
  {_id: "DP01", nombre: "Matenimiento", presupuesto: 20.000},
  {_id: "DP02", nombre: "Secretaria", presupuesto: 15.000},
  {_id: "DP03", nombre: "RRHH", presupuesto: 200.000},
  {_id: "DP04", nombre: "Logistica", presupuesto: 50.000}
])

db.Departamentos.insertMany([
  {_id: "DP01", nombre: "Matenimiento", presupuesto: 20.000},
  {_id: "DP02", nombre: "Secretaria", presupuesto: 15.000},
  {_id: "DP03", nombre: "RRHH", presupuesto: 200.000},
  {_id: "DP04", nombre: "Logistica", presupuesto: 50.000}
])
