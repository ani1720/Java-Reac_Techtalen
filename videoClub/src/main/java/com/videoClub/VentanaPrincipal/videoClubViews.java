package com.videoClub.VentanaPrincipal;

import java.awt.FlowLayout;

import javax.swing.*;

public class videoClubViews extends JFrame {

	public JTextField nombre = new JTextField(20);
	public JTextField apellido = new JTextField(20);
	public JTextField idEliminar = new JTextField(5);
	public JTextField id = new JTextField(5);
	public JTextField titulo = new JTextField(20);
	public JTextField director = new JTextField(20);
	public JButton btnInsertar = new JButton("Insertar");
	public JButton btnEliminar = new JButton("Eliminar");
	public JButton btnMostrar = new JButton("Mostrar");
	public JButton btnActualizar = new JButton("Actualizar");
	public JTextArea areaResultado = new JTextArea(10, 30);

	public videoClubViews() {
		super("Gestion de VideoClub");
		setLayout(new FlowLayout());

		add(new JLabel("ID:"));
		add(id);
		

		add(new JLabel("Nombre:"));
		add(nombre);

		add(new JLabel("Apellido: "));
		add(apellido);

		add(btnInsertar);
		add(btnActualizar);

		add(new JLabel("ID a eliminar: "));
		add(idEliminar);

		add(btnEliminar);
		add(btnMostrar);

		add(new JLabel("Pelicula: "));
		add(titulo);

		add(new JLabel("Director de la Pelicula:"));
		add(director);

		add(new JScrollPane(areaResultado));
		areaResultado.setEditable(false);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 500);
		setVisible(true);
	}
}