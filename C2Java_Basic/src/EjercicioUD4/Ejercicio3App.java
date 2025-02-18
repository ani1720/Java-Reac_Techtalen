package EjercicioUD4;

public class Ejercicio3App {

	public static void main(String[] args) {
		
		// Variables 
		int X = 30; int Y = 64 ;
		
		double N = 12.25 ; double M = 5.32 ;
		
		// Valor de cada variable
		System.out.println("El valor de X es "+ X);
		System.out.println("El valor de Y es "+ Y);
		System.out.println("El valor de N es "+ N);
		System.out.println("El valor de M es "+ M);
		
		// Operaciones de las variables X e Y
		System.out.println("La suma es igual a "+(X+Y));
			//Diferecia
    	System.out.println("La diferencia es "+(X-Y));
    		//Producto
		System.out.println("El producto es igual a "+ (X*Y));
			//Conciente
		System.out.println("El conciente es "+ (X/Y));
			//Resto 
		System.out.println("El resto es "+ (X%Y));
		
		// Operaciones de las variables N y M
		System.out.println("La suma es igual a "+(N+M));
		System.out.println("La suma es igual a "+(X+N));
			//Diferencia
		System.out.println("La diferencia es "+(N-M));
			// Producto
		System.out.println("El producto es igual a "+ (N*M));
			//Conciente 
		System.out.println("El conciente es "+ (N/M));
		System.out.println("El conciente es "+ (Y/M));
			//Resto
		System.out.println("El resto es "+ (N%M));
		System.out.println("El resto es "+ (Y%M));
		
		//Doble de las variables
		int dobleX = X * 2; 
		int dobleY = Y * 2;
		double dobleN = N * 2;
		double dobleM = M * 2;
		
		// Como se muestra en la consola 
		System.out.println("Doble de X: " + dobleX);
		System.out.println("Doble de X: " + dobleY);
		System.out.println("Doble de X: " + dobleN);
		System.out.println("Doble de X: " + dobleM);

		//Calculo de todas las variables 
		double calculo = X + Y + N + M;
		
			System.out.println("La suma de todo es "+ calculo);
		
		//Producto de TODAS LAS VARIABLES
		double producto = X * Y * N * M ;
			System.out.println("El producto es igual a "+ producto);

	}

}
