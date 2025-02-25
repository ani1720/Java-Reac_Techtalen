package UD05FlujoDatos.Ejercicios;
import java.util.Scanner;

public class Tarea09bUD5App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Por favor, ingresa un número:");
		
		int num = scanner.nextInt();
		
		if (num % 2 ==0) {
			System.out.println("El número " + num + " se divide entre 2.");
		}
		else if (num % 3 ==0) {
			System.out.println("El numero "+ num + " se divide entre 3.");
		}
		else {
			System.out.println("El numero no es divisible entre 2 ni entre 3.");
		}
	}

}
