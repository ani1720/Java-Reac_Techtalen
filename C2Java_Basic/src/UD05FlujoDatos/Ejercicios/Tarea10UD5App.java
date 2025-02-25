package UD05FlujoDatos.Ejercicios;

import javax.swing.JOptionPane;

public class Tarea10UD5App {

	public static void main(String[] args) {
		// usamos un inputDialog para pedir l usuario el numero de ventas
		String venta = JOptionPane.showInputDialog("Introduce el numero de ventas");
		// asignamos que el numero de ventas sea la variable numVen
		int numVen = Integer.parseInt(venta);

		double total= 0 ;
		for ( int a = 1; a <= numVen; a++)
			;
		{
			String ventas = JOptionPane.showInputDialog(null, "El total de cada venta: " + numVen + ":");
			double canVentas = Double.parseDouble(canVentas);
			total += ventas;
		}
	    JOptionPane.showMessageDialog(null, "La suma total de todas las ventas es: " + total);

	
	}

}
