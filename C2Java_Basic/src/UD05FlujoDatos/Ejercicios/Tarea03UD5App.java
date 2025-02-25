package UD05FlujoDatos.Ejercicios;

import javax.swing.JOptionPane;
public class Tarea03UD5App {

	public static void main(String[] args) {
		// Usamos JOptionPane para mostrar un mensaje y recoger un valor
		String nombre = JOptionPane.showInputDialog(null, "Bienvenido");
		// MOstramos mediante ventana emergente el mensaje 
		JOptionPane.showMessageDialog(null, "Bienvenido "+ nombre);
	}

}