package UD19SwingAwt;

import java.awt.EventQueue;
import java.sql.Connection;

import javax.swing.*;
//import javax.awt.*;

public class Calculadora extends JFrame {

	private JTextField txtOperando1, txtOperando2, txtResultado;
    private JButton btnSuma, btnResta, btnMultiplicacion, btnDivision, btnPunto, btnIgual;
    private JLabel lblResultado, lblTitulo;
    private Connection conexion;
    
   public void calculadora2 () {
	   setTitle("La Calculator");
	   setBounds(400,200,600,500);
	   setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
//		JTextField txtOperando1 = new JTJTextField();
//		txtOperando1.setBounds();
//		JTextField txtOperando2 = new JTJTextField();
//		JTextField txtResultado = new JTJTextField();
		
   }
}
