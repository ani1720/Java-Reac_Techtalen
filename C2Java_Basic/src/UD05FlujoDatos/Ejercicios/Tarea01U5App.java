package UD05FlujoDatos.Ejercicios;

public class Tarea01U5App {

	public static void main(String[] args) {
		// Declaracion de variables
		int op = 12;
		int op2 = 69;

		// Se utiliza una estructura condicional (if-else) para comparar los valores de
		// las dos variables

		// SI el valor de "op" es mayor que el valor op2
		if (op > op2) {
			// si op es mayor, imprime que op es mayor que op2
			System.out.println(op + " es mayor que " + op2);
		}
		// si op no es mayor que op2, entonces verifica si op es menor que op2
		else if (op < op2) {
			System.out.println(op2 + " es mayor que " + op);
		}
		// Si ninguna de las condiciones anteriores es verdadera, significa que los dos
		// numeros son iguales
		else {
			// Imprime que los dos numeros son iguales
			System.out.println(op + " y " + op2 + "son iguales");
		}
//int num1 = 5;
//		int num2 = 13;

		// boolean esMayor = num1 > num2;
		// boolean esMenor = num1 < num2;
		// boolean sonIguales = num1 == num2;
	}

}
