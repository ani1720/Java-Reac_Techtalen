package UD06Ejercicios;

import javax.swing.JOptionPane;
import java.util.Arrays;
public class Tarea10UD06App {

	public static void main(String[] args) {
		int[] numeros = new int[dimensionArray()];

		int maximo = 0;
		maximo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor maximo del Array"));

		int minimo = 0;
		minimo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor minimo del Array"));
	
	valorRandomPrimos(numeros, minimo, maximo);
	
		for (int i = 0; i < numeros.length; i++) {
			if (i==0) {
				JOptionPane.showMessageDialog(null, "Los numeros primos son: {[" + i + "] ="+ numeros[i] + ", ");
			} else if (i == numeros.length - 1) {
				JOptionPane.showMessageDialog(null, "[" + i + "] = "+numeros[i] + "}");
			}else if (i == numeros.length - 2) {
				JOptionPane.showMessageDialog(null, "[" + i + "] ="+numeros[i] + ",");
			}else {
				JOptionPane.showMessageDialog(null, "[" + i + "] ="+numeros[i]);
			}
		}
	}

	private static int dimensionArray() { // MEtodo para ingresar el tamaño del array
		int dimension = 0;
		dimension = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del que quieres el Array"));
		return dimension;
	}

	private static int numPrimo(int minimo, int maximo) { // En este metodo sacaremos el numero primo
		int num = 0;
		boolean esPrimo = false;
		if (!esPrimo) {
			num = (int) (Math.random() * (maximo - minimo + 1) + minimo);
			esPrimo = esPrimo(num);
		}
		return num;
	}

	private static void valorRandomPrimos(int[] numeros, int minimo, int maximo) {
		for (int i = 0; i <= numeros.length; i++) {
			numeros[i] = numPrimo(minimo, maximo);

		}
	}

	public static boolean esPrimo(int valorPrimo) {
		boolean primoSiNo = true;
		if (valorPrimo <= 1) {
			primoSiNo = false;
			return primoSiNo;
		}
		for (int i = 2; i <= Math.sqrt(valorPrimo); i++) {
			if (valorPrimo % i == 0) {
				primoSiNo = false;
				return primoSiNo;
			}
		}
		return primoSiNo;
	}
private static int buscarMayor (int[] numeros) {
	int mayor = 0;
	for (int i = 0; i < numeros.length; i++) {
		if (numeros[i] > mayor) {
			mayor = numeros[i] ;
		}
	}
	return mayor;
}
}
