package UD06MetodosArrays;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ArraysApp {

	/*
	 * public static void main(String[] args) { //Creamos nuestro arreglo o array
	 * dandole un valor int[] numero = new int [3]; //int[] numeros = {1, 2, 5, 4}
	 * //Le asignamos un valor a cada arreglo generado en este caso 3 numero [0] =
	 * 7; numero [1] = 10; numero [2] = 13;
	 * 
	 * for (int i=0; i<3; i++) { System.out.println(numero[i]); }
	 * 
	 * }
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int elementos;
		elementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo"));
		if (elementos <= 0) {
			System.out.println("La cantidad de elementos debe ser mayor que 0");
			return;
		}
		char[] letras = new char[elementos];

		System.out.println("Digite los elementos del arreglo");
		for (int i = 0; i < elementos; i++) {
			System.out.println(i + ". Digite un caracter: ");
			letras[i] = entrada.next().charAt(0);
		}

		System.out.println("\nLos caracteres del arreglo son: ");
		for (int i = 0; i < elementos; i++) {
			System.out.println(letras[i]);
		}
	}
}
