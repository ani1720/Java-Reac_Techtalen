package UD06Ejercicios;

import javax.swing.JOptionPane;

public class Tarea07UD06App {

	public static void main(String[] args) {
		// Inicializamos las variables 
	String moneda = "";
		double euros = 0.0; // asignamos valor 0 para poder ejecutar
		String input = JOptionPane.showInputDialog(null, "Ingresa un valor en EURO (€)");
		//Aplicamos un Try Catch para evitar un error al introducir un numero o algun error
		try {
			euros = Double.parseDouble(input);
			JOptionPane.showMessageDialog(null, "Has introducido: "+ euros + " euro");
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Por favor, introduce un numero valido.", "Error", JOptionPane.ERROR_MESSAGE);
		}
		// realizamos un bucle en el que utilizamos un EQUALSIGNORECASE para evitar errores en las cadenas
		moneda = JOptionPane.showInputDialog(null, "Introduce el tipo de moneda que quieres cambiar ");
		if (moneda.equalsIgnoreCase("dolar")) {
			
		} else if (moneda.equalsIgnoreCase("libras")) {
			
		} else if (moneda.equalsIgnoreCase("yenn")) {
			
		} else {
			JOptionPane.showMessageDialog(null, "Divisa no reconocida");
		}
		double result = 0.0 ;
switch (moneda.toLowerCase()) {
case "dolar" : 
	result = convertirDolar(euros);
	JOptionPane.showMessageDialog(null, "Seleccionaste Dolar");
	break;
case "libras" : 
	result = convertirLibra(euros);
	JOptionPane.showMessageDialog(null, "Has seleccionado Libras");
	break;
case "yenn" :
	result = convertirYenes(euros);
	JOptionPane.showMessageDialog(null, "Seleccionaste yenes");
	break;
default :
		JOptionPane.showMessageDialog(null, "Moneda no reconocida", "Error", JOptionPane.ERROR_MESSAGE);
	System.exit(0);
}
JOptionPane.showMessageDialog(null, "El valor convertido es: "+ result);
	}
public static double convertirDolar (double valor) {
	//valor = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor en EURO(€)"));
	final double usd = 1.09;
	return valor * usd ;
}
public static double convertirLibra (double valor) {
	final double libr = 0.86 ;
	return valor * libr ;
	
}
public static double convertirYenes (double valor) {
	final double yen = 129.852 ;
	return valor * yen ;
	
}
}