package UD05FlujoDatos.Ejercicios;

import javax.swing.JOptionPane;

public class Tarea10UD5App {

	public static void main(String[] args) {
		// usamos un inputDialog para pedir l usuario el numero de ventas
		String ventaStr = JOptionPane.showInputDialog("Introduce el numero de ventas");
		// asignamos que el numero de ventas sea la variable numVen
		int numVen = Integer.parseInt(ventaStr);
//asigno una variable double por si una venta es con decimales 
		double suma = 0;
		// Se usa un bucle for para recoorres las ventas que ingraremos
		for (int a = 1; a <= numVen; a++) // no termina en ; continua con la {
		{
			//CReamos la ventana emergente para que el usuario ingrese el total de cada venta
			String ventas = JOptionPane.showInputDialog("El total de cada venta :" + a + ":");
			double sumas = Double.parseDouble(ventas); //Pasamos el String ventas a double a traves de parseDouble
			suma += sumas; //Hacemos una simplificacion con += en vez de "suma = suma + sumas" 
		}
//MOstramos en ventana el total en todas las ventanas
		JOptionPane.showMessageDialog(null, "La suma total de todas las ventas es: " + suma);

	}

}
