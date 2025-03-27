package UD06Ejercicios;


import javax.swing.JOptionPane;

public class Tarea08UD06App {

	public static void main(String[] args) {
		// Asignamos a la variable una nueva instancia
		int[] array = new int[3]; //ÍNdices del 0 al 9
		// Idia inicial pedir al usuario que nos ingrese un valor
		// JOptionPane.showInputDialog("Introduce un valor a asignar");
		System.out.println("Tamaño del array:" + array.length);

		rellenaValores(array);
		muestraValores(array);
	}

	private static void rellenaValores(int[] array) {
		for (int i = 0; i <= array.length - 1; i++) {
			array[i] = Integer.parseInt(JOptionPane.showInputDialog
					(null, "Ingrese los valores"));
		}
	}

	private static void muestraValores(int[] array) {
		for (int i = 0; i < array.length; i++) {
			JOptionPane.showMessageDialog(null, "Indice: " + i + " - Valor: " + array[i]);
		}
	}

	/*
	 * posible metodo inicio de la idea public static int[] valores () { int[] valor
	 * = new valor[10]; int relleno =
	 * Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese los valores"));
	 * for (int i = 0; i < relleno; i++) { array[i] = relleno.nextInt(); }
	 */
}
