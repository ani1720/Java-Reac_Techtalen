package UD19SwingAwt;

import java.sql.*;
import javax.swing.*;

public class HistorialDB {

    private static final String URL = "jdbc:mysql://localhost:3306/calculadoradb";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = ""; // Cambia si tienes clave

    public static void guardarOperacion(String operacion, double resultado) {
    	
        try (Connection conn = DriverManager.getConnection(URL, USUARIO, CONTRASENA)) {
            String sql = "INSERT INTO Historico (operacion, resultado) VALUES (?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, operacion);
                stmt.setDouble(2, resultado);
                stmt.executeUpdate();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar en BD: " + e.getMessage());
        }
    }
    public static String obtenerHistorial() {
        StringBuilder historial = new StringBuilder();

        try (Connection conn = DriverManager.getConnection(URL, USUARIO, CONTRASENA)) {
            String sql = "SELECT * FROM Historico ORDER BY id DESC";
            try (PreparedStatement stmt = conn.prepareStatement(sql);
                 ResultSet rs = stmt.executeQuery()) {

                while (rs.next()) {
                    String operacion = rs.getString("operacion");
                    double resultado = rs.getDouble("resultado");
                    historial.append(operacion).append(" = ").append(resultado).append("\n");
                }
            }
        } catch (SQLException e) {
            return "Error al obtener historial: " + e.getMessage();
        }

        if (historial.length() == 0) {
            return "No hay operaciones guardadas.";
        }

        return historial.toString();
    }

}
