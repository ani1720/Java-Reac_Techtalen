package UD04JavaBasic.Ejercicios;

public class Ejercicio1App {

	public static void main(String[] args) {
		// Declaracion de variables
		int a = 25;
		int b = 145;
		
		// Operaciones
		int suma = a + b;
			
		int resta = a - b;
		
		int multiplicacion = a * b;
		
		double division = (double) a / b; // Converti en double para obtener decimales en la division		
		
		int modulo = a % b;
		
		// Muestra de resultados en consola 
		System.out.println("Suma: "+ suma);
		System.out.println("Resta: "+ resta);
		System.out.println("Multiplicacion: "+ multiplicacion);
		System.out.println("Division: "+ division);
		System.out.println("Modulo: "+ modulo);

		
	}

}
