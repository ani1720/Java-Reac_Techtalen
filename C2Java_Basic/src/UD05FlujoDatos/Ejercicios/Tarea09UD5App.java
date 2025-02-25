package UD05FlujoDatos.Ejercicios;

public class Tarea09UD5App {

	public static void main(String[] args) {
		// Usamos un bucle for para recorrer los números del 1 al 100
		for (int a = 1; a <= 100; a++) {
			// Asignamos un bloque condicional para verificar si los numeros son divisibles
			if (a % 2 == 0) {
				//Le decimos que nos muestre los numeros y nos diga si son divisibles entre 2
				System.out.println("El numero " + a + " es divisible entre 2.");
			} else if (a % 3 == 0);
			{
				// Le decimos que nos muestre los numeros y nos diga si son divisibles entre 3
				System.out.println("El numero " + a + " es divisible entre 3.");
			}

		}
	}
}
