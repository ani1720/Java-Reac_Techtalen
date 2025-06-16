package com.videoClub.GestorDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.videoClub.VideoClubModelo.ClienteModelo;
import com.videoClub.VideoClubModelo.VideoModel;

public class GestorDB {
    static final String URL = "jdbc:mysql://localhost:3306/videoclub";
    static final String USER = "root";
    static final String PASSWORD = "";
    
    public void insertarRegistro(String nombre, String apellido) {
        Connection conexion = null;
        Statement statement = null;
        try {
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Ha conectado");
            statement = conexion.createStatement();
            String consulta = "INSERT INTO " + nombre + " (" + apellido + ") "
            		+ "VALUES (?, ?)";
            statement.executeUpdate(consulta);
            System.out.println("Registro insertado en la tabla '" + nombre + "' en el campo " + apellido);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (statement != null) statement.close();
                if (conexion != null) conexion.close();
                System.out.println("Conexión cerrada");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    public boolean actualizarRegistro(String tabla, String columnaActualizar, String nuevoValor, String columnaCondicion, String valorCondicion) {
        Connection conexion = null;
        Statement statement = null;
        String query = "UPDATE " + tabla + " SET " + columnaActualizar 
        		+ " = ? WHERE " + columnaCondicion 
        		+ " = ?";
        try {
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, nuevoValor);
            ps.setString(2, valorCondicion);
            
            int filasAfectadas = ps.executeUpdate();
            //statement.executeUpdate(query);
            System.out.println("Registro actualizados: " + filasAfectadas);
            return filasAfectadas > 0;
            
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminarRegistroSeguro(String tabla, String columnaCondicion, int valorCondicion) {
        String query = "DELETE FROM " + tabla + " WHERE " + columnaCondicion + " = ?";
        try (Connection conexion = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = conexion.prepareStatement(query)) {

            ps.setInt(1, valorCondicion);  // usamos int directamente

            int filas = ps.executeUpdate();
            System.out.println("Registros eliminados: " + filas);
            return filas > 0;

        } catch (SQLException e) {
            System.out.println("Error al eliminar: " + e.getMessage());
            return false;
        }
    }


    public void mostrarRegistros(String tabla) {
        Connection conexion = null;
        Statement statement = null;
        try {
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM " + tabla);
            System.out.println("Registros en la tabla '" + tabla + "':");
            while (resultSet.next()) {
                System.out.println("Código: " + resultSet.getInt("codigo") 
                + ", Nombre: " + resultSet.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (statement != null) statement.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
    public boolean insertarCliente(String nombre, String apellido) {
        String sql = "INSERT INTO clientes (nombre, apellido) VALUES (?, ?)";

        try (Connection conexion = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setString(1, nombre);
            ps.setString(2, apellido);

            int filas = ps.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            System.out.println("Error al insertar cliente: " + e.getMessage());
            return false;
        }
      
        }
    public boolean insertarVideo(String title, String director, int cliID) {
    	String sql = "INSERT INTO videos (title, director, cli_id) VALUES (?, ?, ?)";
    	
    	try (Connection conexion = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement ps = conexion.prepareStatement(sql)) {
                	
    		ps.setString(1, title);
    		ps.setString(2, director);
    		ps.setInt(3, cliID);
    		return ps.executeUpdate() > 0;
    		
                }catch(SQLException e) {
                	System.out.println("Error al insertar video:" + e.getMessage());
                return false;
                }
    }
    public int insertarClienteYDevolverId(String nombre, String apellido) {
        String sql = "INSERT INTO clientes (nombre, apellido) VALUES (?, ?)";
        try (Connection conexion = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, nombre);
            ps.setString(2, apellido);
            int filas = ps.executeUpdate();

            if (filas > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    return rs.getInt(1); // ID generado
                }
            }

        } catch (SQLException e) {
            System.out.println("Error al insertar cliente: " + e.getMessage());
        }
        return -1; // error
    }
 

    public List<ClienteModelo> listar() {
        List<ClienteModelo> lista = new ArrayList<>();
        String sql = "SELECT * FROM clientes";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            
        	while (rs.next()) {
        		ClienteModelo cliente = new ClienteModelo(
        			rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("apellido")
                );
        				lista.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
}
    public List<VideoModel> listarVideosPorCliente(int idCliente) {
        List<VideoModel> lista = new ArrayList<>();
        String sql = "SELECT * FROM videos WHERE cli_id = ?";

        try (Connection conexion = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, idCliente);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                lista.add(new VideoModel(
                    rs.getInt("id"),
                    rs.getString("title"),
                    rs.getString("director"),
                    rs.getInt("cli_id")
                ));
            }

        } catch (SQLException e) {
            System.out.println("Error al listar videos: " + e.getMessage());
        }

        return lista;
    }

}