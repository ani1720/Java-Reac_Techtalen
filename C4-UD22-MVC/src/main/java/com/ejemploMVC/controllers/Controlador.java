package com.ejemploMVC.controllers;

	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.JFrame;

import com.ejemploMVC.models.Modelo;
import com.ejemploMVC.views.Vista;


	public class Controlador implements ActionListener{
		private Modelo modelo;
		private Vista vista;
		private Double cantidad;
		
		public Controlador(Modelo modelo, Vista vista) {
			this.modelo = modelo;
			this.vista = vista;
			this.vista.euros.addActionListener(this);
			this.vista.dolares.addActionListener(this);
		}
		
		public void iniciarVista() {
			vista.setTitle("Conversor");
			vista.pack();
			vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			vista.setLocationRelativeTo(null);
			vista.setVisible(true);
		}
		
		@Override
		public void actionPerformed(ActionEvent evento) {

			if (vista.euros == evento.getSource()) {
				
				if (!"".equals(vista.campoTexto.getText())) {
					try {
						
						cantidad = Double.parseDouble(vista.campoTexto.getText());
						modelo.setCantidad(cantidad);
						modelo.setMoneda(0.88); // 1 dolar = 0.88 euros 20250523
						modelo.convertirDolarEuro();
						vista.lResultado.setText(modelo.getResultado().toString());
						
					} catch (NumberFormatException e) {
						vista.lResultado.setText("Introduzca una cantidad válida...");
					}
				}
				
			} else if (vista.dolares == evento.getSource()){
				if (!"".equals(vista.campoTexto.getText())) {
					try {
						
						cantidad = Double.parseDouble(vista.campoTexto.getText());
						modelo.setCantidad(cantidad);
						modelo.setMoneda(1.13); // 1 euro = 1.13 dolares 20250523
						modelo.convertirEuroDolar();;
						vista.lResultado.setText(modelo.getResultado().toString());
						
					} catch (NumberFormatException e) {
						vista.lResultado.setText("Introduzca una cantidad válida...");
					}
				}
				
				
			}
			
		}
	}