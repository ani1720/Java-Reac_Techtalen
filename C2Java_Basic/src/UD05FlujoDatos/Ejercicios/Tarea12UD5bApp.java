package UD05FlujoDatos.Ejercicios;

import java.util.Scanner;

public class Tarea12UD5bApp {

	public static void main(String[] args) {
		String contrasena = "789456cd";

		int max = 3;
		int inicio = 0;

		Scanner scanner = new Scanner(System.in);

		while (inicio < max) { 
			System.out.println("Introduce la contraseña");
			String intro = scanner.nextLine() ;
			if (intro.equals(contrasena)) { 
			System.out.println("Enhorabuena");
			break;
		} else {
			inicio++;
			System.out.println("Contraseña incorrecta");
		}
		if (inicio == max) {
			System.out.println("Numero de intento agotados");
		}

	}
	scanner.close(); 
	}
}