package com.videoClub.VideoClubController;

import java.util.List;

import javax.swing.JOptionPane;

import com.videoClub.GestorDB.GestorDB;
import com.videoClub.VentanaPrincipal.videoClubViews;
import com.videoClub.VideoClubModelo.ClienteModelo;
import com.videoClub.VideoClubModelo.VideoModel;

public class videoClubControlador {
	private GestorDB db = new GestorDB();
	private videoClubViews vista;

	public videoClubControlador(videoClubViews vista) {
		this.vista = vista;

		vista.btnInsertar.addActionListener(e -> insertarCliente());
		vista.btnActualizar.addActionListener(e -> actualizarRegistro());
		vista.btnEliminar.addActionListener(e -> eliminarCliente());
		vista.btnMostrar.addActionListener(e -> mostrarCliente());

	}

	private void insertarCliente() {
		String nombre = vista.nombre.getText().trim();
		String apellido = vista.apellido.getText().trim();
		String titulo = vista.titulo.getText().trim();
		String director = vista.director.getText().trim();

		if (nombre.isEmpty() || apellido.isEmpty() || titulo.isEmpty() || director.isEmpty()) {
			JOptionPane.showMessageDialog(vista, "Completa los datos");
			return;
		}
		int idCliente = db.insertarClienteYDevolverId(nombre, apellido);
		if (idCliente != -1) {
			boolean okVideo = db.insertarVideo(titulo, director, idCliente);
			JOptionPane.showMessageDialog(vista,
					okVideo ? "Cliente y video insertados con éxito" : "Cliente insertado, pero falló el video");
		} else {
			JOptionPane.showMessageDialog(vista, "Error al insertar el cliente");
		}
	}

	private void eliminarCliente() {
        String textoId = vista.idEliminar.getText().trim();
        System.out.println("Contenido del campo ID: [" + textoId + "]");
        textoId = textoId.trim();
        
        if(!textoId.matches("\\d+")) {
        	System.out.println("ID invalido");
        	return;
        	//(vista, "ID invalido");
        }
		try {
			int id = Integer.parseInt(textoId);
			boolean ok = db.eliminarRegistroSeguro("clientes", "id", id);
			
			JOptionPane.showMessageDialog(vista, ok ? "Eliminado con exito" : "No se encontró ID");

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(vista, "ID invalido");
		e.printStackTrace();
		}
	}

	private void actualizarRegistro() {
		String id = vista.id.getText().trim(); // columnaCondicion
		String nuevoNombre = vista.nombre.getText().trim(); // nuevoValor

		if (id.isEmpty() || nuevoNombre.isEmpty()) {
			JOptionPane.showMessageDialog(vista, "Completa todos los campos");
			return;
		}

		boolean ok = db.actualizarRegistro("clientes", // tabla
				"nombre", // columnaActualizar
				nuevoNombre, // nuevoValor
				"id", // columnaCondicion
				id // valorCondicion
		);

		JOptionPane.showMessageDialog(vista, ok ? "Cliente actualizado con éxito" : "No se pudo actualizar el cliente");
	}

	private void mostrarCliente() {
		List<ClienteModelo> clientes = db.listar();
		vista.areaResultado.setText("");

		for (ClienteModelo cliente : clientes) {
			vista.areaResultado.append("ID: " + cliente.getId() + " - Nombre: " + cliente.getNombre() + " - Apellido: "
					+ cliente.getApellido() + "\n");
			List<VideoModel> videos = db.listarVideosPorCliente(cliente.getId());
			for (VideoModel video : videos) {
				vista.areaResultado
						.append("  Pelicula: " + video.getTitulo() + " - Director: " + video.getDirector() + "\n");
			}
		}
	}
}
