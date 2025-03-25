package UD06Ejercicios;

import javax.swing.JOptionPane;

public class Tarea09UD06App {

	public static void main(String[] args) {
		//Inicializacion de variable entero que contendra la dimension ingresada por teclado
		int[] numArray = new int[dimensionArray()]; 
		//Traemos el metodo con el valor random
		valorRandom(numArray);
		/*Debido a un error de repeticion donde se mostraba 2 veces el mensaje con el indice
		 * se creo la varibale entera sumar para alli asignar y llamar al metodo
		 * muestraValor 
		 */
		int sumar = muestraValor(numArray);
		JOptionPane.showMessageDialog(null, "La suma de los valores es " 
										+ sumar);
	}

	private static int dimensionArray() { //Metodo para ingresar el tamaño del array
		int dimension;
		dimension = Integer.parseInt(JOptionPane.showInputDialog
				("Ingrese el tamaño del array"));
		return dimension;
	}

	private static void valorRandom(int[] numArray) { //Metodo para el random
		for (int i = 0; i < numArray.length; i++) { //bucle FOR encerramos el array donde sacaremos el random del 0 al 9
			numArray[i] = (int) (Math.random() * 10);
		}
	}

	private static int muestraValor(int[] numArray) { //Metodo para mostrar el valor 
		int suma = 0; //Variable para realizar la suma
		for (int i = 0; i < numArray.length; i++) { 
			suma += numArray[i];
			JOptionPane.showMessageDialog(null, "Indice; " + i 
					+ " - Valor: " + numArray[i]); /* Mostramos el indice y el valor
			random asignado
			*/
		}

		return suma;
	}
}
