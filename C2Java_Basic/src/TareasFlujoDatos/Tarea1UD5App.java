package TareasFlujoDatos;

import java.util.Scanner;

public class Tarea1UD5App {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);

		System.out.println("Introduce tu nombre:");
//	Pidiendo al usuario un valor de texto referente a su nombre
		String nombre = escaner.nextLine();
		escaner.close();

		System.out.println("Bienvenido " + nombre.toUpperCase());
	}

}
