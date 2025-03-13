package UD06Ejercicios;

import javax.swing.JOptionPane;

public class Tarea05UD06App {

	public static void main(String[] args) {
		double numero = 0.0;
		numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el decimal"));
		
	}
public double binario(int divisor) {
	String resultado="";
	int resto;
	do {
		resto = divisor % 2;
		divisor = resto / 2;
		resultado =resto + resultado ;
		
	}while (divisor > 0);
}
}
