package UD06Ejercicios;

import java.util.Random;

import javax.swing.JOptionPane;

public class Tarea12UD06App {

	public static void main(String[] args) {
		int dimension = Integer.parseInt(JOptionPane.showInputDialog("Introduce la dimensión de los arrays: "));
       
		int[] array1 = new int [dimension] ;
 
		array1 = randomArray1(array1, dimension) ;
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el ultimo valor que quieres"));
	}
	public static int[] randomArray1(int[] array1, int dimension) {
		 // Metodo de donde llamaremos al array
		array1 = new int[dimension] ;
		
		if (dimension <= 0) {
			 JOptionPane.showMessageDialog(null,"La dimension introducida no es valida"); 
		} else {
	        for (int i = 0; i < dimension; i++) {
	            array1[i] = (int) (Math.random() * 300) + 1;
	        }
		}
	        return array1; 
	}
public static int comparador (int[] array1, int numero) {
	int numero = 0 ;
	for (int resultados : array1) {
		if (resultados % 10 == numero) {
			numero++;
		}
	}
}
}
	