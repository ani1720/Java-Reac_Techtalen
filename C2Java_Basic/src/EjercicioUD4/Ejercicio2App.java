package EjercicioUD4;

public class Ejercicio2App {

	public static void main(String[] args) {
		
		// Variables
		int N = 1702 ;
		double A = 2.5 ;
		char C = 'Z' ; //Al ser caracter char no se debe ejecutar con "" sino con comillas simples '' porque se trata de un caracter especial
		
		//Valor de cada variable
		System.out.println("Valor de N "+N);
		System.out.println("Valor de A "+A);
		System.out.println("Valor de C "+C);
		
		//Suma de variable N+A
		double suma = N + A;
		System.out.println("La suma de N + A es "+suma);
		
		// Diferencia de variable 
		double diferencia = A - N ;
		System.out.println("La diferencia de A - N es "+ diferencia);
		
		// Valor numerico de C
		int valorC = (int) C ;
			System.out.println("El valor numerico de C es "+ valorC);

	}

}
