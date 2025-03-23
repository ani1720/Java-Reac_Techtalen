package UD06Ejercicios;

import javax.swing.JOptionPane;

public class Tarea04UD06App {

	public static void main(String[] args) {
		// Incializamos un entero que tendra valor de 0
		int factorial = 0;
		// Decimos que la variable factorial la ingresa el usuario por JOP
		factorial = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));
		// declaramos que resultado final es lo que es el metodo
		// DEl calculoFactorial
		int resulTotal = calculoFactorial(factorial);
		// Llamamos un cuadro de mensaje donde nos dice cuanto es el total
		// del factorial
		JOptionPane.showMessageDialog(null, "El factorial es " + resulTotal);
	}

	public static int calculoFactorial(int n) { // Metodo creado para calcular el factorial
		// Si n (numero ingresado por el usuario) es menor o igual a 1
		// Nos muestre un mensaje que nos diga que el factorial es 1
		if (n <= 1) {
			JOptionPane.showMessageDialog(null, "EL factorial es 1");
			return 1;
			// Sino le decimos que se itere o multiplique con el resultado
		} else {
			int resultado = 1;
			/*
			 * Decimos que i es igual a 2 ya que debe ser mayor a 1 para ejecutarse 
			 * y que i es menor o igual que el numero ingresado
			 */
			for (int i = 2; i <= n; i++) {
				resultado *= i;
			}
			return resultado;
		}
	}

	public static int factorial2(int n2) { // Metodo Math para calcular el factorial
		// Aqui repetimos el si n2 es menor o igual a 1 nos devuelve 1
		n2 = Math.abs(n2);
		if (n2 <= 1) {
			return 1;
			// Si no nos devolvera el numero multiplicado por el entero -1
		} else {
			return n2 *= factorial2(n2 - 1);

		}
	}
}
