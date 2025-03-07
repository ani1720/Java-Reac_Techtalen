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
	/* java
	import java.util.ArrayList;
	import javax.swing.JOptionPane;

	public class Tarea12UD06App {

	    public static void main(String[] args) {
	        // 1. Solicitar la dimensión del array
	        int dimension = Integer.parseInt(JOptionPane.showInputDialog("Introduce la dimensión del array: "));
	        if (dimension <= 0) {
	            JOptionPane.showMessageDialog(null, "La dimensión debe ser mayor que 0.");
	            return;
	        }

	        // 2. Generar el array de números aleatorios
	        int[] array1 = randomArray1(dimension);

	        // 3. Solicitar al usuario el dígito que quiere filtrar
	        int digito = Integer.parseInt(JOptionPane.showInputDialog("Introduce un dígito entre 0 y 9: "));
	        if (digito < 0 || digito > 9) {
	            JOptionPane.showMessageDialog(null, "El dígito debe estar entre 0 y 9.");
	            return;
	        }

	        // 4. Filtrar los números que terminan con el dígito indicado
	        int[] numerosFiltrados = filtrarPorUltimoDigito(array1, digito);

	        // 5. Mostrar resultados
	        StringBuilder resultados = new StringBuilder("Array original:\n");
	        for (int numero : array1) {
	            resultados.append(numero).append(" ");
	        }
	        resultados.append("\n\nNúmeros que terminan en ").append(digito).append(":\n");
	        for (int numero : numerosFiltrados) {
	            resultados.append(numero).append(" ");
	        }

	        JOptionPane.showMessageDialog(null, resultados.toString());
	    }

	    // Método para generar un array de números aleatorios
	    public static int[] randomArray1(int dimension) {
	        int[] array = new int[dimension];
	        for (int i = 0; i < dimension; i++) {
	            array[i] = (int) (Math.random() * 300) + 1; // Números aleatorios entre 1 y 300
	        }
	        return array;
	    }

	    // Método para filtrar números por el último dígito
	    public static int[] filtrarPorUltimoDigito(int[] array, int digito) {
	        ArrayList<Integer> listaFiltrada = new ArrayList<>();

	        for (int numero : array) {
	            if (numero % 10 == digito) { // Verificar si el último dígito coincide
	                listaFiltrada.add(numero);
	            }
	        }

	        // Convertir la lista a un array
	        int[] resultado = new int[listaFiltrada.size()];
	        for (int i = 0; i < listaFiltrada.size(); i++) {
	            resultado[i] = listaFiltrada.get(i);
	        }

	        return resultado;
	    }/*

