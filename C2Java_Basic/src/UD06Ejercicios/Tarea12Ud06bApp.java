package UD06Ejercicios;

import java.util.Scanner;

public class Tarea12Ud06bApp {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        // 1. Pedir al usuario el tamaño del array
	        System.out.print("Introduce el tamaño del array: ");
	        int tamano = scanner.nextInt();

	        if (tamano <= 0) {
	            System.out.println("El tamaño del array debe ser mayor que 0.");
	            return;
	        }

	        // 2. Crear el array con números aleatorios entre 1 y 300
	        int[] numeros = new int[tamano];
	        for (int i = 0; i < tamano; i++) {
	            numeros[i] = (int) (Math.random() * 300) + 1;
	        }

	        // 3. Pedir al usuario el dígito deseado
	        System.out.print("Introduce un dígito entre 0 y 299: ");
	        int digito = scanner.nextInt();

	        if (digito < 0 || digito > 9) {
	            System.out.println("Debes introducir un número entre 0 y 299.");
	            return;
	        }

	        // 4. Filtrar los números que terminan en el dígito indicado
	        int[] numerosFiltrados = filtrarNumerosPorDigito(numeros, digito);

	        // 5. Mostrar el resultado
	        System.out.println("Números originales:");
	        for (int numero : numeros) {
	            System.out.print(numero + " ");
	        }
	        System.out.println();

	        System.out.println("Números que terminan en " + digito + ":");
	        for (int numero : numerosFiltrados) {
	            System.out.print(numero + " ");
	        }
	    }

	    // Método para filtrar los números que terminan en un dígito específico
	    public static int[] filtrarNumerosPorDigito(int[] numeros, int digito) {
	        int contador = 0;

	        // Contar los números que cumplen la condición
	        for (int numero : numeros) {
	            if (numero % 10 == digito) {
	                contador++;
	            }
	        }

	        // Crear un nuevo array para almacenar los números que cumplen la condición
	        int[] resultado = new int[contador];
	        int indice = 0;
	        for (int numero : numeros) {
	            if (numero % 10 == digito) {
	                resultado[indice++] = numero;
	            }
	        }

	        return resultado;
	    }
	}