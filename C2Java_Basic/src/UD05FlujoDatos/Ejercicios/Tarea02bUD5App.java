package UD05FlujoDatos.Ejercicios;
import java.util.Scanner;
public class Tarea02bUD5App {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);

		System.out.println("Introduce tu nombre:");
//	Pidiendo al usuario un valor de texto referente a su nombre
		String nombre = escaner.nextLine();
		escaner.close();

		System.out.println("Bienvenido " + nombre.toUpperCase());

	}

}
