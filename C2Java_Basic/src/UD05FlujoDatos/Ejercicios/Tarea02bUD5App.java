package UD05FlujoDatos.Ejercicios;
import java.util.Scanner;
public class Tarea02bUD5App {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
//     Declarando un objeto de la clase Scanner para poder leer los datos que el usuario introduzca por consola
		System.out.println("Introduce tu nombre:");
//	Pidiendo al usuario un valor de texto referente a su nombre
		String nombre = escaner.nextLine();
		escaner.close();
// Declara en consola un mensaje de bienvenida al usuario con su nombre en mayúsculas
		System.out.println("Bienvenido " + nombre.toUpperCase());

	}

}
