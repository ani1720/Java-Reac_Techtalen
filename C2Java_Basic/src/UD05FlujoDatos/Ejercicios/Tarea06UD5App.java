package UD05FlujoDatos.Ejercicios;

import javax.swing.JOptionPane;

public class Tarea06UD5App {

	public static void main(String[] args) {

		final double IVA = 0.21;
		String precioProducto = JOptionPane.showInputDialog (null, "Ingrese el precio del producto ") ;
		
		double precio = Double.parseDouble(precioProducto) ;
		JOptionPane.showMessageDialog(null, "El producto con IVA "+ (precio + (precio*IVA)));
		
	}

}
