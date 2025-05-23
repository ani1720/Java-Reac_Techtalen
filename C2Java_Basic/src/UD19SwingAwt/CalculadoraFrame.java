package UD19SwingAwt;

import javax.swing.*;
import java.awt.*;

public class CalculadoraFrame extends JFrame {

	private JTextField txtPantalla;
	private double n1, n2;
	private String operador;
	private boolean nuevoNumero = true;

	public CalculadoraFrame() {
		setTitle("Calculadora");
		setSize(300, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		// Pantalla
		txtPantalla = new JTextField();
		txtPantalla.setEditable(false);
		txtPantalla.setFont(new Font("Arial", Font.BOLD, 24));
		txtPantalla.setHorizontalAlignment(JTextField.RIGHT);
		add(txtPantalla, BorderLayout.NORTH);

		// Panel de números
		JPanel panelNumeros = new JPanel(new GridLayout(5, 3, 5, 5));
	//	panelNumeros.setBackground(new Color(230,230,250));
		String[] botones = { "7", "8", "9", 
							 "4", "5", "6",
							 "1", "2", "3", 
							 "0", ".", "=", "C" };

		for (String texto : botones) {
			
			JButton btn = new JButton(texto);
			
			btn.setFont(new Font("Arial", Font.BOLD, 18));
			 if (texto.equals("=")) {
			      //  btn.setBackground(new Color(255, 204, 204));  // botton rosa pastel
			        btn.setForeground(Color.GREEN);
			    } else if (texto.equals("C")) {
			     //   btn.setBackground(new Color(220, 53, 69)); // rojo
			        btn.setForeground(Color.ORANGE);
			    }else if (texto.equals("+")) {
			    	btn.setForeground(Color.MAGENTA);
			    }else if (texto.equals("-")) {
			    	btn.setForeground(Color.MAGENTA);
			    }else if (texto.equals("*")) {
			    	btn.setForeground(Color.MAGENTA);
			    }else if (texto.equals("/")) {
			    	btn.setForeground(Color.MAGENTA);
			    }else {
			        btn.setBackground(Color.WHITE);
			        btn.setForeground(Color.BLACK);
			    }

			    btn.addActionListener(e -> procesarEntrada(texto));
			    panelNumeros.add(btn);
			}
			add(panelNumeros, BorderLayout.CENTER);

			//			btn.setBackground(Color.BLUE);
			//			btn.addActionListener(e -> procesarEntrada(texto));
			//			panelNumeros.add(btn);
			//			getContentPane().setBackground(Color.GREEN);
						// btn.setBackground(Color.PINK);

		// Panel de operaciones
		JPanel panelOperaciones = new JPanel(new GridLayout(4, 1, 5, 5));
		String[] operaciones = { "+", "-", "*", "/" };
		for (String op : operaciones) {
			JButton btnOp = new JButton(op);
			btnOp.setFont(new Font("Arial", Font.BOLD, 18));
			//btnOp.setBackground(new Color(204, 229, 255));
			btnOp.setBackground(Color.WHITE);
			btnOp.addActionListener(e -> seleccionarOperacion(op));
			panelOperaciones.add(btnOp);

		}

		add(panelOperaciones, BorderLayout.EAST);
		// Menú superior
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Opciones");

		// Elementos del menú
		JMenuItem itemHistorial = new JMenuItem("Historial");
		JMenuItem itemAbout = new JMenuItem("About");
		JMenuItem itemSalir = new JMenuItem("Salir");

		// Eventos del menú
		itemHistorial.addActionListener(e -> mostrarHistorial());
		itemAbout.addActionListener(e -> JOptionPane.showMessageDialog(this,
				"Mini Calculadora Clásica\nVersión 1.0\nCreado en Java con Swing y JDBC.", "Acerca de",
				JOptionPane.INFORMATION_MESSAGE));
		itemSalir.addActionListener(e -> System.exit(0));

		// Añadir items al menú
		menu.add(itemHistorial);
		menu.add(itemAbout);
		menu.add(itemSalir);
		menuBar.add(menu);
		setJMenuBar(menuBar);

		// Mostrar la ventana
		setVisible(true);

	}

	private void mostrarHistorial() {
		    String textoHistorial = HistorialDB.obtenerHistorial();

		    JTextArea area = new JTextArea(textoHistorial);
		    area.setEditable(false);
		    JScrollPane scroll = new JScrollPane(area);

		    JOptionPane.showMessageDialog(this, scroll, "Historial de Operaciones", JOptionPane.INFORMATION_MESSAGE);
		}

	private void procesarEntrada(String texto) {
		if (texto.equals("C")) {
			txtPantalla.setText("");
			nuevoNumero = true;
			n1 = 0;
			n2 = 0;
			operador = null;
		}else if (texto.equals("=")) {
			calcular();
		} else {
			if (nuevoNumero) {
				txtPantalla.setText(texto);
				nuevoNumero = false;
			} else {
				txtPantalla.setText(txtPantalla.getText() + texto);
			}
		}
	}

	private void seleccionarOperacion(String op) {
		try {
			n1 = Double.parseDouble(txtPantalla.getText());
			operador = op;
			nuevoNumero = true;
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Número inválido");
		}
	}

	private void calcular() {
		try {
			n2 = Double.parseDouble(txtPantalla.getText());
			double resultado = switch (operador) {
			case "+" -> n1 + n2;
			case "-" -> n1 - n2;
			case "*" -> n1 * n2;
			case "/" -> {
				if (n2 == 0)
					throw new ArithmeticException("División por cero");
				yield n1 / n2;
			}
			default -> throw new IllegalArgumentException("Operación desconocida");
			};
			txtPantalla.setText(String.valueOf(resultado));
			HistorialDB.guardarOperacion(n1 + " " + operador + " " + n2, resultado);
			nuevoNumero = true;
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Número inválido");
		} catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
		}
	}
}
