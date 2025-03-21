package UD06Ejercicios;

import javax.swing.JOptionPane;

public class Tarea10UD06App {

	public static void main(String[] args) {
		int[] numeros = new int[dimensionArray()];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

		int maximo = 0;
		maximo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor maximo del Array"));
		System.out.println(maximo);
		int minimo = 0;
		minimo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor minimo del Array"));
		System.out.println(minimo);
		valorRandomPrimos(numeros, minimo, maximo);
		

		for (int i = 0; i < numeros.length; i++) {
			if (i == 0) {
				System.out.print( "Los numeros primos son: {[" + i + "] =" + numeros[i] + ", ");
			} else if (i == numeros.length - 1) {
				System.out.print( "[" + i + "] = " + numeros[i] + "}");
			} else {
				System.out.print( "[" + i + "] =" + numeros[i]+ ", ");
			}
		}
		
		//mayo(numeros))
	}
	

	private static int dimensionArray() { // Metodo para ingresar el tamaño del array
		int dimension = 0;
		dimension = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del que quieres el Array"));
		return dimension;
	}
	private static void valorRandomPrimos(int[] numeros, int minimo, int maximo) {
		for (int i = 0; i < numeros.length; i++) { //El error estaba en que se ponia <= y era < que length
			numeros[i] = numPrimo(minimo, maximo);

		}
	}
	
	private static int numPrimo(int minimo, int maximo) { // En este metodo sacaremos el numero primo
		int num = 0;
		boolean esPrimo = false;
		while (!esPrimo) { //Se crea un bucle ya que el condicional no aplicaria las iteraciones que necesitamos
			//para que me de el random en solo numeros primos 
			num = (int) (Math.random() * (maximo - minimo + 1) + minimo);
			esPrimo = esPrimo(num); //true o false
		}
		return num;
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

	private static int buscarMayor(int[] numeros) {
		int mayor = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}
		}
		return mayor;
	}
}
