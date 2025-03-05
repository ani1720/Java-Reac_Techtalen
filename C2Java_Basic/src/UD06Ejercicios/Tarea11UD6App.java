package UD06Ejercicios;

import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.random.*;

public class Tarea11UD6App {

	public static void main(String[] args) {
		int dimension= Integer.parseInt(JOptionPane.showInputDialog("Introduce la dimension del array ")); 
		
		int[] array1ro= new int [dimension];
		
        int[] array2do = array1ro;
        
        

        // Crear un objeto Random para generar números aleatorios
        Random random = new Random();
        // Llenar el primer array con números aleatorios
        for (int i = 0; i < dimension; i++) {
            array1[i] = random.nextInt(100); // Números aleatorios entre 0 y 99
        }

        // Reasignar el segundo array a un nuevo array con la misma dimensión
        array2 = new int[dimension];
        // Llenar el segundo array con números aleatorios
        for (int i = 0; i < dimension; i++) {
            array2[i] = random.nextInt(100); // Números aleatorios entre 0 y 99
        }

        // Llamar al método multiplyArrays para obtener el array resultante
        int[] resultArray = multiplyArrays(array1, array2);

        // Mostrar el contenido de los tres arrays
        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Result Array: " + Arrays.toString(resultArray));
    }

    // Método que multiplica los elementos de dos arrays y devuelve un nuevo array
    public static int[] multiplyArrays(int[] array1, int[] array2) {
        // Crear un nuevo array para almacenar los resultados
        int[] resultArray = new int[array1.length];
        // Multiplicar los elementos de los dos arrays
        for (int i = 0; i < array1.length; i++) {
            resultArray[i] = array1[i] * array2[i];
        }
        // Devolver el array resultante
        return resultArray;
    }
		

	}

}
