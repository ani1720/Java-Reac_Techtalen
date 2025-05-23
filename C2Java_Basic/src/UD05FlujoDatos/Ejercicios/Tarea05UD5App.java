package UD05FlujoDatos.Ejercicios;

import java.util.Scanner;

public class Tarea05UD5App {

	public static void main(String[] args) {
		// Trabajamos con un Scanner 
		Scanner scanner = new Scanner(System.in);

		// Solicita al usuario que ingrese un número
		System.out.println("Por favor, ingresa un número:");

		// Leer el número ingresado por el usuario
		int numero = scanner.nextInt();
		
		// Verificar si el número es divisible entre 2
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es divisible entre 2.");
            // Establece que si el numero no cumple con la condición anterior, se imprima el siguiente mensaje
        } else {
            System.out.println("El número " + numero + " no es divisible entre 2.");
        }
		// Se cierra el scanner
		scanner.close();
	}

}