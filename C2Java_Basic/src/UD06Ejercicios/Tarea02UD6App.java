package UD06Ejercicios;

import java.util.Random;

import javax.swing.JOptionPane;

public class Tarea02UD6App {

	public static void main(String[] args) {
		// System.out.println(Math.random()*100); operacion de aritmetica para hacer random
		// asignamos los enteros donde uno lo introduce el usuario
		int numRandoms = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero "));
		int numMaxi;
		int numMini ;
		/* Hacemos un bucle donde dice si el numero introducido es menor o igual a 0 
		 * donde diga al usuario que el numero introducido no puede ser 0 
		 */
	if (numRandoms <= 0) {
JOptionPane.showMessageDialog(null, "No puede ser 0");
return; }
	/* creamos un bucle FOR donde le asignamos que el entero i es igual a numero random 
	 * ingresado por el usuario
	 * decimos que i es mayor a 0
	 * y que i se incremente
	 */
			for (int i = numRandoms; i>0; i++) {
				numMaxi = Integer.parseInt(JOptionPane.showInputDialog("introduce el rango maximo "));

				numMini = Integer.parseInt(JOptionPane.showInputDialog("Introduce el rango minimo "));
		
		/* Luego haremos un IF donde decimos que SI el minimo es mayor o igual al mayor
		 * le diremos al usuario que debe ingresar un rango menor al maximo
		 */
				if (numMini>=numMaxi) {
				JOptionPane.showMessageDialog(null, "El rango minimo debe ser menor que el rango maximo");
			}
				// declaramos un entero donde se llama al metodo hecho para el valor random
			int randomValor= valorRandom(numMaxi, numMini);
			JOptionPane.showMessageDialog(null, "Numero aleatorio generado: " + randomValor);
			}
		} 
			
	public static int valorRandom(int numMaxi, int numMini) {
		Random random = new Random();
		int result = random.nextInt(numMaxi - numMini + 1) + numMini;
		return result;
	}

}