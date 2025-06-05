package com.ejercicio;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VentanaInteractiva extends JFrame {
     
	private int contador1 = 0;
	private int contador2 = 0;
	
	private JLabel etiqueta1;
	private JLabel etiqueta2;
	private JButton btn1;
	private JButton btn2;
	
	/**
	 * 
	 */
	public VentanaInteractiva() {
		super("Ventana Interactiva");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 300);
		setLayout(new GridLayout(2, 2));
		setLocationRelativeTo(null);
			etiqueta1 = new JLabel("Botón 1: 0 clics");
			etiqueta2 = new JLabel("Botón 2: 0 clics");

			btn1 = new JButton("Clic Botón 1");
			btn2 = new JButton("Clic Botón 2");

			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					contador1++;
					etiqueta1.setText("Boton 1: " + contador1 + "clics");
				}
			});
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					contador2++;
					etiqueta2.setText("Boton 1: " + contador2 + "clics");
				}
			});
			add(etiqueta1);
			add(btn1);
			add(etiqueta2);
			add(btn2);

			setVisible(true);
	}
	public static void main(String[] args) {
		
		new VentanaInteractiva();
	}
}
