package UD05FlujoDatos.Ejercicios;

import javax.swing.JOptionPane;

public class Tarea04UD5App {

	public static void main(String[] args) {
		String radioStr = JOptionPane.showInputDialog("Introduce el radio del circulo ");
		double radio = Double.parseDouble(radioStr) ;
		double area = Math.PI * Math.pow(radio, 2) ;
		
				JOptionPane.showInternalMessageDialog(null, "El area del circulo es: " + area);
	}

}