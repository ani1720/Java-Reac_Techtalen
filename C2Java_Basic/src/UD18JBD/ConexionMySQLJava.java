package UD18JBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQLJava {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Establece la conexion con el servidor MySQL no a una
			// DATABASE especifica
			Connection conexion=DriverManager.getConnection(
					// URL, usuario y contraseña
					"jdbc:mysql://localhost:3306","root","");
			System.out.print("Conectado a servidor correctamente");
			
		} catch (SQLException | ClassNotFoundException e) {
            System.out.println("No se ha podido conectar con mi base de datos");
            System.out.println(e.getMessage());
		}
		
	}
	}


