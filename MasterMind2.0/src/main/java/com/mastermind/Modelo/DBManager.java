package com.mastermind.Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {
	 private Connection conn;
	    public DBManager() throws SQLException {
	        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/masterminddb2", "usuario", "contraseña");
	    }

	    public int registrarUsuario(String nombre) throws SQLException {
	        PreparedStatement ps = conn.prepareStatement("INSERT IGNORE INTO usuarios(nombre) VALUES (?)", Statement.RETURN_GENERATED_KEYS);
	        ps.setString(1, nombre);
	        ps.executeUpdate();
	        ResultSet rs = ps.getGeneratedKeys();
	        if (rs.next()) return rs.getInt(1);
	        // Si ya existe, obtener su id
	        ps = conn.prepareStatement("SELECT id FROM usuarios WHERE nombre = ?");
	        ps.setString(1, nombre);
	        rs = ps.executeQuery();
	        if (rs.next()) return rs.getInt(1);
	        return -1;
	    }

	    public void guardarPartida(int usuarioId, String combinacion, int intentos, int tiempo) throws SQLException {
	        PreparedStatement ps = conn.prepareStatement("INSERT INTO partidas(usuario_id, combinacion, intentos, tiempo_segundos) VALUES (?, ?, ?, ?)");
	        ps.setInt(1, usuarioId);
	        ps.setString(2, combinacion);
	        ps.setInt(3, intentos);
	        ps.setInt(4, tiempo);
	        ps.executeUpdate();
	    }

	    public ResultSet obtenerRanking() throws SQLException {
	        return conn.createStatement().executeQuery(
	            "SELECT u.nombre, MIN(p.intentos) AS mejor_intentos, MIN(p.tiempo_segundos) AS mejor_tiempo " +
	            "FROM partidas p JOIN usuarios u ON p.usuario_id = u.id GROUP BY usuario_id ORDER BY mejor_intentos ASC, mejor_tiempo ASC LIMIT 10"
	        );
	    }
	}

