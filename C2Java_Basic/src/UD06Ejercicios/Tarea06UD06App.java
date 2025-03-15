package UD06Ejercicios;

import javax.swing.JOptionPane;

public class Tarea06UD06App {

	public static void main(String[] args) {
		//iniciamos una varibale teipo entero donde le asignamos valor 0
		int numeros = 0;
		do { // y con un DOWHILE le decimos que ingrese el numero 
		numeros = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero del que quieres contar sus cifras"));
		} while (numeros < 0) ; // le decimos que el numero ingresado debe ser mayor que 0
		
		int contarNume = cantidadNumeros(numeros) ;
		JOptionPane.showMessageDialog(null, "El numero de cifras de " 
										+ numeros + " es " + contarNume);
	}
public static int cantidadNumeros (int numeros) { //MEtodo dpara calcular el numero de cifras
 if (numeros == 0) { //DEcimos que SI numeros es igual que 0 nos devuelva 1 
	 return 1;
 } // Inicializamos una varible entero sin valor asignado
 int cant;
 for (cant = 0; numeros != 0; cant++) { //y mediante un bucle for le decimos que
	 // el entero cant es igual a 0, y que numeros es distinto que 0, aplicado esto cant se itera 
	 //las veces necesarias
	 numeros /= 10 ; //dividimos la variable numeros entre 10 para poder sacar el resto y asi obtener
	 //las cifras
 }
 return cant;  // le decimos que nos devuelva la variable cant
}
}