package UD06Ejercicios;

import java.util.Random;

import javax.swing.JOptionPane;

public class Tarea12UD06App {

	public static void main(String[] args) {
		int dimension = Integer.parseInt(JOptionPane.showInputDialog("Introduce la dimensión de los arrays: "));
        int[] array1 = new int [dimension] ;

	}
	public static int[] randomArray1(int[] array1, int dimension) {
		 // Metodo de donde llamaremos al array
		array1 = new int[dimension] ;
	    	
	        for (int i = 0; i < dimension; i++) {
	            array1[i] = (int) (Math.random() * 1000);
	        }
	        return array1; 
	}
public static int comprobador (int[] array) {
	int ultimoNum = array[array.length - 1] ;
			//usar el foreach
}
for (int[]dimension ) {
	
}
}
	

