package UD09Ejercicios;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Tarea06UD09App  {
	public static void main(String[] args) {
		
		SubPeliculasUD09 pelicula1 = new SubPeliculasUD09("Super Mario Bros. La pelicula", 12.99, 92, 7,
				"Aaron Horvarth");
		pelicula1.mostrarDatosPeli();
		
	}
	protected  pedirDatos() {
		//boolean datosValidos = true;
		do {
			String nombrePersona = JOptionPane.showInputDialog("Introduce tu nombre");
			int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
			double dineroPersona = Double.parseDouble(JOptionPane.showInputDialog("Introduce el monto con el que pagaras"));
		} while(dineroPersona < 12.99); {
			 JOptionPane.showMessageDialog(null, "No tienes suficiente dinero para pagar la entrada");
		 }
		//	if (edad < edadMinima) {
				
			//}
}
