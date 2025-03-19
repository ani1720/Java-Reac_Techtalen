package UD06Ejercicios;

import javax.swing.JOptionPane;

public class Tarea03UD06App {

	public static void main(String[] args) {
		// Creamos el entero que no es primo
		int numPrimo = 0;
		// Hacemos la conversion con parseInt para introducir un string y pase a entero
		numPrimo = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero primo: "));
		// usamos un bucle if donde le decimos que si el numero inrresado es menor o
		// igual 1
		// if (numPrimo <= 1) {
		// JOptionPane.showMessageDialog(null, String.format("El %d es primo es <=1",
		// numPrimo));
		// decimos que si no es menor o igual a 1. Entonces es un numero primo
		if (esPrimo(numPrimo)) {
			JOptionPane.showMessageDialog(null, String.format("El %d es primo", numPrimo));
			// En caso que no cumpla ninguna de las 2 anteriores decimos que no es primo
			// y le damos fin al bucle
		} else {
			JOptionPane.showMessageDialog(null, String.format("El %d no es primo ", numPrimo));
		}

	}

	public static boolean esPrimo(int valorPrimo) {
		boolean primosNo = true;
		// Verificamos mediante un bucle SI el valor es menor o igual a 1 nos devuelve
		// FALSE
		if (valorPrimo <= 1) {
			return false;
		}
		/*
		 * Utilizamos el bucle for para comprobar si el numero tiene divisores distintos
		 * a 1 y de el mismo. Entonces recorrera desde 2 hasta la raiz cuadrada del
		 * numero Asi que si encuentra divisor donde de 0 devuelve FALSE y sino es
		 * munero primo y devuelve TRUE
		 **/
		for (int i = 2; i <= Math.sqrt(valorPrimo); i++) {
			if (valorPrimo % i == 0) {
				primosNo = false;
				return primosNo;
			}
		}
		return primosNo;

	}
}
