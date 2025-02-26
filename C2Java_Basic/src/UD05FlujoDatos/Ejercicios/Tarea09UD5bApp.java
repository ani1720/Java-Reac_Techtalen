package UD05FlujoDatos.Ejercicios;
import java.util.Scanner;

public class Tarea09UD5bApp {

	public static void main(String[] args) {
		// Usamos un Scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);
		// Pedimos al usuario que ingrese un número
		System.out.println("Por favor, ingresa un número:");
		// asignamos el valor que ingresa el usuario a la variable num
		int num = scanner.nextInt();
		// Abrimmos un bloque condicional para verificar si el numero es divisible entre 2 o 3
		if (num % 2 ==0) {
			System.out.println("El número " + num + " se divide entre 2.");
		}
		else if (num % 3 ==0) {
			System.out.println("El numero "+ num + " se divide entre 3.");
		}
		else {
			System.out.println("El numero no es divisible entre 2 ni entre 3.");
		}
		scanner.close();
	}

}
