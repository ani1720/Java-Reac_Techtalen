package UD05FlujoDatos.Ejercicios;

import javax.swing.JOptionPane;

public class Tarea06UD5App {

	public static void main(String[] args) {
		// creamos una constante que guarda el valor de IVA
		final double IVA = 0.21;
		// Mediante un cuadro de dialogo le pedimos al usuario que ingrese el precio
		String precioProducto = JOptionPane.showInputDialog (null, "Ingrese el precio del producto ") ;
		// Convertimos el valor del usuario en double y la variable se guarda en precio
		double precio = Double.parseDouble(precioProducto) ;
		// Mostramos un cuadro de dialogo con el precio del producto con IVA
		JOptionPane.showMessageDialog(null, "El producto con IVA "+ (precio + (precio*IVA)));
		
	}

}
