package UD19SwingAwt;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class AplicacionGrafica extends JFrame {

	private JPanel contentPane;
	public AplicacionGrafica() {
		setTitle("Aplicacion Grafica");
		setBounds(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		
		
	}
	
}
