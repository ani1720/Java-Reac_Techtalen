package UD06Ejercicios;

import javax.swing.JOptionPane;

public class Tarea10UD06App {

	public static void main(String[] args) {
		int[] numeros = new int [dimensionArray()] ;
		
		int maximo = 0;
		maximo= Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor maximo del Array"));
		
		int minimo = 0;
		minimo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor minimo del Array"));
	}
private static int dimensionArray () { //MEtodo para ingresar el tamaño del array
	int dimension = 0;
	dimension= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del que quieres el Array")) ;
	return dimension;
}
private static int numPrimo (int min, int maxi) { //En este metodo
	int num = 0;
	boolean esPrimo = false;
	if (!esPrimo) {
		num = (int) (Math.random() * (maxi - min + 1) + min);
		esPrimo = esPrimo(num);
	}
	return num;
}
private static void valorRandomPrimos (int[] numeroPrimo, int min, int max) {
	for (int i = 0 ; i <= numeroPrimo.length ; i++) {
		numeroPrimo[i] = numPrimo(min, max) ;
		
	}
}
public static boolean esPrimo(int valorPrimo) {
	boolean primoSiNo = true ;
	if (valorPrimo <= 1) {
		primoSiNo = false;
		return primoSiNo;
	}
	for (int i = 2; i <=Math.sqrt(valorPrimo); i++) {
		if (valorPrimo % i ==0) {
			primoSiNo = false;
			return primoSiNo;
		}
	}
	return primoSiNo;
}

}
