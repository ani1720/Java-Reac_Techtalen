package UD05FlujoDatos.Ejercicios;
import java.util.Scanner;

public class Tarea10UD5bApp {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Introduce el numero de ventas");
	
	int numVen = scanner.nextInt() ;
	double suma = 0 ;
	
	for (int a = 1; a <= numVen; a++) {
		 System.out.println("El total de cada venta " + a + ":") ;
		double sumas = scanner.nextInt() ;
		suma += sumas ;
	}
	System.out.println("La suma total de todas las ventas es: " + suma);
	scanner.close();
	}


}
