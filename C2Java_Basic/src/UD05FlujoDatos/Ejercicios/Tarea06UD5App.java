package UD05FlujoDatos.Ejercicios;

import java.util.Scanner;

public class Tarea06UD5App {

	public static boolean main(String[] args) {
		 // Crear una instancia de Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.println("Por favor, ingresa un número:");

        // Leer el número ingresado por el usuario
        int numero = scanner.nextInt();

        // Verificar si el número es divisible entre 2
                   if ((numero % 2) == 0) {
            System.out.println("El número " + numero + " es divisible entre 2.");
            
        } else {
            System.out.println("El número " + numero + " no es divisible entre 2.");
        }

        // Cerrar el scanner
        scanner.close();
    }

 
    }