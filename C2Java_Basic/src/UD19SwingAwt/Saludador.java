package UD19SwingAwt;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Saludador extends JFrame{
	 
	public static void main(String[] args) {
		
		JFrame window = new JFrame("Saludador Personalizado");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,200);
		window.setLayout(new FlowLayout());
		
		JTextField campoTexto = new JTextField(20);
		JButton btnSaludar = new JButton("Saludar");
		
		btnSaludar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = campoTexto.getText();
				JOptionPane.showMessageDialog(null, "¡Hola, " + name + "!");
				
			}
			
	});
		window.add(new JLabel("Introduce tu nombre:"));
		window.add(campoTexto);
		window.add(btnSaludar);
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}
}


