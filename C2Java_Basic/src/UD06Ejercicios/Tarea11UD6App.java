package UD06Ejercicios;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Tarea11UD6App {

	public static void main(String[] args) {
	
		//Variables
		        int dimension = Integer.parseInt(JOptionPane.showInputDialog("Introduce la dimensión de los arrays: "));
		        int[] array1 = new int [dimension] ;
		        int[]array2 = new int[dimension];
		        int[] array3= new int [dimension] ;
		        
		        //Asignacion de array
		        array1 = randomArray1(array1,dimension);
		        array2 = array1 ;
		        
		        //Impresion de los array 1 y 2 
		        System.out.println("En el primer paso, los valores del Array 1 son: "+Arrays.toString(array1));
		        System.out.println("En el primer paso, los valores del Array 2 son: "+Arrays.toString(array2));
		        
		      //reasignamos array2
		        array2 = randomArray1(array2, dimension);
		  
		        //Reasignamos el array 3
		      //Reasignacion del array 3
		        array3 = multiplicacionArrays(array1,array2,dimension);
		       
		        //Impresion de los arrays
		        System.out.println("En el tercer paso, los valores del Array 1 son: " + Arrays.toString(array1));
		        System.out.println("En el tercer paso, los valores del Array 2 son: " + Arrays.toString(array2));
		        System.out.println("En el tercer paso, los valores del Array 3 son: " + Arrays.toString(array3));
	}
		public static int[] randomArray1(int[] array1, int dimension) {
			 // Metodo de donde llamaremos al array
			array1 = new int[dimension] ;
		    	
		        for (int i = 0; i < dimension; i++) {
		            array1[i] = (int) (Math.random() * 1000);
		        }
		        return array1; 
		}
		        public static int[] multiplicacionArrays(int[] array1, int[] array2, int dimension) {
		        	int[] array3 = new int[dimension];
		        	for (int i = 0; i < dimension; i++) {
		        	array3[i] = array1[i] * array2[i];
		        	}
		        	return array3;
		      }
		}

 
		
