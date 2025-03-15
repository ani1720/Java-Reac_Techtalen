package UD06Ejercicios;

import javax.swing.JOptionPane;

public class Tarea07UD06App {

	public static void main(String[] args) {
	
		double euros;
		
		euros = JOptionPane.showConfirmDialog(null, "Introduce a que moneda quieres hacer la conversion");
		
	}
public static double dolar (double valor) {
	//valor = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor en EURO(€)"));
	final double usd = 1.09;
	return valor * usd ;
}
public static double libra (double valor) {
	final double libr = 0.86 ;
	return valor * libr ;
	
}
public static double yenes (double valor) {
	final double yen = 129.852 ;
	return valor * yen ;
	
}
}