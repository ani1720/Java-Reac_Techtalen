package UD06Ejercicios;

import javax.swing.JOptionPane;

public class Tarea06UD06App {

	public static void main(String[] args) {
		int numeros = 0;
		do {
		numeros = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		} while (numeros < 0) ;
		
		int contarNume = cantidadNumeros(numeros) ;
		JOptionPane.showMessageDialog(null, "El numero de cifras de " 
										+ numeros + " es " + contarNume);
	}
public static int cantidadNumeros (int numeros) {
 if (numeros == 0) {
	 return 1;
 }
 int cant;
 for (cant = 0; numeros != 0; cant++) {
	 numeros /= 10 ;
 }
 return cant; 
}
}