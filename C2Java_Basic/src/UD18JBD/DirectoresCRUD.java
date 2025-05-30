package UD18JBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class DirectoresCRUD {
	static final String URL = "jdbc:mysql://localhost:3306/director";
	static final String USER = "root";
	static final String PASSWORD = "";

	public static void main(String[] args) {
		
		String createTable = "CREATE TABLE despacho (" +
			    "numero INT AUTO_INCREMENT PRIMARY KEY, " + 
			    "capacidad INT NOT NULL" + 
			    ")";

		String createTable2 = "CREATE TABLE directores (" + "DNI VARCHAR(9) PRIMARY KEY, "
				+ "nomapel VARCHAR(200) NOT NULL, " + "DNIjefe VARCHAR(9), " + "numero INT,"
				+ "FOREIGN KEY (numero) REFERENCES despacho(numero) ON DELETE SET NULL, "
				+ "FOREIGN KEY (DNIjefe) REFERENCES directores(DNI) ON DELETE SET NULL " + ")";

		String insertDespacho = "INSERT INTO despacho (capacidad) VALUES (?)";
		String insertDirectores = "INSERT INTO directores (DNI, nomapel, DNIjefe, numero ) VALUES (?, ?, ?, ?)";

		try {
			Connection conexion = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Conexion establecida correctamente");

			Statement statement = conexion.createStatement();
			statement.executeUpdate(createTable);
			statement.executeUpdate(createTable2);

			PreparedStatement psInsertDespacho = conexion.prepareStatement(insertDespacho);

			int[] capacidades = { 10, 8, 12, 9, 5 };
			for (int capacidad : capacidades) {
				psInsertDespacho.setInt(1, capacidad);
				psInsertDespacho.executeUpdate();
			}
			System.out.println("Datos insertados en la tabla DESPACHO");

			PreparedStatement psInsertDirectores = conexion.prepareStatement(insertDirectores);

			String[][] directores = { { "11111111A", "Ana Martínez", null, "1" },
					{ "22222222B", "Luis Gómez", "11111111A", "2" },
					{ "33333333C", "María Torres", "22222222B", "3" },
					{ "44444444D", "Carlos Ruiz", null, "4" }, 
					{ "55555555E", "Isabel Romero", "11111111A", "5" } };

			for (String[] dir : directores) {
				psInsertDirectores.setString(1, dir[0]); // DNI
				psInsertDirectores.setString(2, dir[1]); // nomapel
				if (dir[2] == null) {
				    psInsertDirectores.setNull(3, Types.VARCHAR);
				} else {
				    psInsertDirectores.setString(3, dir[2]);
				}
				psInsertDirectores.setInt(4,Integer.parseInt(dir[3])); // numero
				psInsertDirectores.executeUpdate();
			}
			System.out.println("Datos insertados en la tabla DIRECTORES");
			conexion.close();
		} catch (SQLException e) {
			System.out.println("Error en la base de datos");
			e.printStackTrace();
		}

	}

}
