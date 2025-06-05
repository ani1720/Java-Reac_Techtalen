package com.ejemplo;

import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class Conversor extends JFrame {

	private static final double TASA_CAMBIO = 166.386;

	private JTextField campoCantidad;
	private JTextField campoResultado;
	private JRadioButton euroAPeseta;
	private JRadioButton pesetaAEuro;
	private JButton btnConvertir;
	private JButton btnLimpiar;
	private JButton btnSalir;

	public Conversor() {
		setTitle("Conversor Pesetas ↔ Euros");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 200);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(5, 1));

		// Panel de entrada
		JPanel panelEntrada = new JPanel();
		panelEntrada.add(new JLabel("Cantidad:"));
		campoCantidad = new JTextField(15);
		panelEntrada.add(campoCantidad);
		add(panelEntrada);

		// Panel de selección
		JPanel panelOpciones = new JPanel();
		euroAPeseta = new JRadioButton("Euros → Pesetas", true);
		pesetaAEuro = new JRadioButton("Pesetas → Euros");
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(euroAPeseta);
		grupo.add(pesetaAEuro);
		panelOpciones.add(euroAPeseta);
		panelOpciones.add(pesetaAEuro);
		add(panelOpciones);

		// Panel resultado
		JPanel panelResultado = new JPanel();
		panelResultado.add(new JLabel("Resultado:"));
		campoResultado = new JTextField(15);
		campoResultado.setEditable(false);
		panelResultado.add(campoResultado);
		add(panelResultado);

		// Panel de botones
		JPanel panelBotones = new JPanel();
		btnConvertir = new JButton("Convertir");
		btnLimpiar = new JButton("Limpiar");
		btnSalir = new JButton("Salir");
		panelBotones.add(btnConvertir);
		panelBotones.add(btnLimpiar);
		panelBotones.add(btnSalir);
		add(panelBotones);

		// Eventos de botón
		btnConvertir.addActionListener(e -> convertir());
		btnLimpiar.addActionListener(e -> limpiarCampos());
		btnSalir.addActionListener(e -> System.exit(0));

		// Soporte para teclado
		campoCantidad.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					convertir();
				} else if (e.getKeyCode() == KeyEvent.VK_DELETE) {
					limpiarCampos();
				}
			}
		});

		setVisible(true);
	}

	private void convertir() {
		try {
			double cantidad = Double.parseDouble(campoCantidad.getText());
			double resultado;
			if (euroAPeseta.isSelected()) {
				resultado = cantidad * TASA_CAMBIO;
				campoResultado.setText(String.format("%.2f pesetas", resultado));
			} else {
				resultado = cantidad / TASA_CAMBIO;
				campoResultado.setText(String.format("%.2f euros", resultado));
			}
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(this, "Por favor, introduce una cantidad válida.", "Error de formato",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	private void limpiarCampos() {
		campoCantidad.setText("");
		campoResultado.setText("");
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(Conversor::new);
	}
}
