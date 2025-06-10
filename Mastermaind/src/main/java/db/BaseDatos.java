package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mastermaind.modelo.Intento;
import com.mastermaind.modelo.Juego;

public class BaseDatos {
	private Connection conexion;

    // Constructor abre la conexión con la base de datos MySQL.
    public BaseDatos() {
        // Datos de conexión - adaptar a la configuración real
        String url = "jdbc:mysql://localhost:3306/mastermind_db";
        String usuario = "root";
        String password = "";
        try {
            // Cargar el driver JDBC de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");  // MySQL Connector/J 8+ :contentReference[oaicite:6]{index=6}
            // Establecer la conexión
            conexion = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexión a BD establecida correctamente.");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para guardar los datos de una partida en la base.
    public void guardarPartida(Juego juego) {
        if (conexion == null) return;
        try {
            // Desactivar auto-commit para ejecutar múltiples inserciones atómicamente
            conexion.setAutoCommit(false);

            // 1. Insertar la partida en tabla Partida (jugadores, intentos, ganador)
            String sqlPartida = "INSERT INTO Partida(jugador1, jugador2, intentos_max, ganador) VALUES (?, ?, ?, ?)";
            PreparedStatement stmtPartida = conexion.prepareStatement(sqlPartida, Statement.RETURN_GENERATED_KEYS);
            stmtPartida.setString(1, juego.getJugador1().getNombre());
            stmtPartida.setString(2, juego.getJugador2().getNombre());
            stmtPartida.setInt(3, juego.getIntentosMaximos());
            stmtPartida.setString(4, juego.getGanador().getNombre());
            stmtPartida.executeUpdate();
            // Obtener el ID generado de la partida insertada (clave primaria auto-incremental)
            ResultSet keys = stmtPartida.getGeneratedKeys();
            int idPartida = -1;
            if (keys.next()) {
                idPartida = keys.getInt(1);
            }
            stmtPartida.close();

            // 2. Insertar cada intento en tabla Intento, referenciando el id de Partida
            String sqlIntento = "INSERT INTO Intento(id_partida, numero_intento, combinacion, aciertos_color, aciertos_posicion) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmtIntento = conexion.prepareStatement(sqlIntento);
            int numero = 1;
            for (Intento intento : juego.getHistorialIntentos()) {
                stmtIntento.setInt(1, idPartida);
                stmtIntento.setInt(2, numero++);
                // Unir los colores con comas para almacenarlos como texto (ej: "Rojo,Verde,Azul,Amarillo")
                String combinacionTexto = String.join(",", intento.getCombinacionIntentada());
                stmtIntento.setString(3, combinacionTexto);
                stmtIntento.setInt(4, intento.getAciertosColor());
                stmtIntento.setInt(5, intento.getAciertosPosicion());
                stmtIntento.executeUpdate();
            }
            stmtIntento.close();

            // 3. Confirmar transacción
            conexion.commit();
            System.out.println("Datos de partida guardados en BD (Partida #" + idPartida + ").");
        } catch (SQLException e) {
            try {
                conexion.rollback();
            } catch (SQLException ex) { ex.printStackTrace(); }
            e.printStackTrace();
        } finally {
            try {
                conexion.setAutoCommit(true);
            } catch (SQLException ex) { /* ignorar */ }
        }
    }

    // Opcional: método para cerrar la conexión al finalizar la aplicación
    public void cerrarConexion() {
        if (conexion != null) {
            try { conexion.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }
}
