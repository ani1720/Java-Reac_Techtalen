package UD04JavaBasic.Ejercicios;

public class Ejercicio5App {

	public static void main(String[] args) {
		//Variables
		int A = 33 ; int B = 45 ; int C = 78 ; int D = 17 ;
		
// Muestra de los valores originales
		System.out.println("Valores originales");
		System.out.println("Valor de A "+A);
		System.out.println("Valor de B "+B);
		System.out.println("Valor de C "+C);
		System.out.println("Valor de D "+D);
		
		// Cambio de valores
		B = C ; // B toma el valor de C
		int temp = C ; 
		C = A ; // C toma el valor de A
		A = D ; // A toma el valor de D
		D = temp ; // D toma el valor que estaba en C ahora hecho en temp
		
		//Nuevos Valores
		System.out.println("Valores reasignados");
		System.out.println("Valor de A ahora es "+A);
		System.out.println("Valor de B ahora es "+B);
		System.out.println("Valor de C ahora es "+C);
		System.out.println("Valor de D ahora es "+D); 
		
	}

}
