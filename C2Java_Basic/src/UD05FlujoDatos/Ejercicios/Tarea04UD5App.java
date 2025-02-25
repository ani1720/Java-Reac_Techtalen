package UD05FlujoDatos.Ejercicios;

import javax.swing.JOptionPane;

public class Tarea04UD5App {
	// Usamos JOptionPane
	public static void main(String[] args) {
		// Le pedimos mediante una ventana emergente que introduzca el radio
		String radioStr = JOptionPane.showInputDialog("Introduce el radio del circulo ");
		// convertiremos la variable en double para obtener los decimales 
		double radio = Double.parseDouble(radioStr) ;
		// Usamos metodos de clase Math para obtener el area
		double area = Math.PI * Math.pow(radio, 2) ;
		// Mostramos el resultado en una ventana emergente
				JOptionPane.showInternalMessageDialog(null, "El area del circulo es: " + area);
	}

}