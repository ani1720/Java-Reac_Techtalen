package UD18JBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Directores {
	public static void main(String[] args) {

//		// Nombre de la base de datos
		String losDirectores = "director";
//		// Sentencia SQL para crear la base de datos
		String sql = "CREATE DATABASE IF NOT EXISTS " + losDirectores;

		try {
			
			Connection conexion = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306", "root", "");
			
			Statement statement = conexion.createStatement();

			statement.executeUpdate(sql);
			System.out.print("Conectado a servidor correctamente\n");
            System.out.println("Base de datos " + losDirectores + "  Creada correctamente");
		} catch (SQLException e) {
			System.out.println("No se ha podido conectar con mi base de datos");
			// System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}


