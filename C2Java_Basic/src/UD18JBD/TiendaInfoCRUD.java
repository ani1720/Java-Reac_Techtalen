package UD18JBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TiendaInfoCRUD {
	static final String URL = "jdbc:mysql://localhost:3306/tiendainfo";
	static final String USER = "root";
	static final String PASSWORD = "";

	public static void main(String[] args) {

		String createTable = "CREATE TABLE IF NOT EXISTS fabricante (" + "id INT AUTO_INCREMENT PRIMARY KEY, "
				+ "nombre VARCHAR(100) " + ");";

		String createTable2 = "CREATE TABLE IF NOT EXISTS producto (" + "codi INT AUTO_INCREMENT PRIMARY KEY ,"
				+ "nombre VARCHAR(100), " + "precio DECIMAL(10, 2), " + "id_fabricante INT, "
				+ "FOREIGN KEY (id_fabricante) REFERENCES fabricante(id)" + ");";

		String insertFabri = "INSERT INTO fabricante (nombre) VALUES (?);";
		String insertProd = "INSERT INTO producto (nombre, precio, id_fabricante) VALUES (?, ?, ?)";
//		String insert2 = "INSERT INTO fabricante (nombre) VALUES ('Microsoft');";
//		String insert3 = "INSERT INTO producto (nombre, precio, id_fabricante) VALUES ('Iphone 14 Pro', 999.99, 1);";
//		String insert4 = "INSERT INTO producto (nombre, precio, id_fabricante) VALUES ('Microsoft 365', 79.90, 3);";
		try {
			Connection conexion = DriverManager.getConnection(URL, USER, PASSWORD);
			Statement statement = conexion.createStatement();

			PreparedStatement psInsertFabri = conexion.prepareStatement(insertFabri, Statement.RETURN_GENERATED_KEYS);

			PreparedStatement psInsertProd = conexion.prepareStatement(insertProd);
			// Creacion de la tabla
			statement.executeUpdate(createTable); // Ejecuta la sentencia SQL para crear la tabla
			statement.executeUpdate(createTable2);

			System.out.println("Tabla creada correctamente");

			String[] fabricante = { "Apple", "Microsoft", "HP", "Asus", "Lenovo" };
			for (String fab : fabricante) {
				psInsertFabri.setString(1, fab);
				psInsertFabri.executeUpdate();
			}
			System.out.println("Fabricantes insertados correctamente");

			Object[][] producto = {
					{"Teclado", 25.50, 1},
	                {"Impresora", 150.00, 2},
	                {"Monitor", 200.00, 3},
	                {"Laptop", 850.00, 4},
	                {"iPhone", 999.99, 5}
	            };
			for (Object prod : producto) {
				Object[] prodAr = (Object[]) prod;
				psInsertProd.setString(1, (String) prodAr[0]);
				psInsertProd.setDouble(2, (Double) prodAr[1]);
				psInsertProd.setInt(3, (Integer) prodAr[2]);
			psInsertProd.executeUpdate();
			}
			System.out.println("Productos insertados correctamente");
		
		} catch (SQLException e) {
			System.err.println("Error en la base de datos");

			e.printStackTrace(); // Imprime el error detallado
		}

	}
}
