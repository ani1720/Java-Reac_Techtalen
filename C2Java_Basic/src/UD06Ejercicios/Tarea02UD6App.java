package UD06Ejercicios;

import java.util.Random;

import javax.swing.JOptionPane;

public class Tarea02UD6App {

	public static void main(String[] args) {
		// System.out.println(Math.random()*100);
		int numRandoms = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero "));
		int numMaxi;
		int numMini ;
	if (numRandoms <= 0) {
JOptionPane.showMessageDialog(null, "No puede ser 0");
return; }
			for (int i = numRandoms; i>0; i++) {
				numMaxi = Integer.parseInt(JOptionPane.showInputDialog("introduce el rango maximo "));

				numMini = Integer.parseInt(JOptionPane.showInputDialog("Introduce el rango minimo "));
			if (numMini>=numMaxi) {
				JOptionPane.showMessageDialog(null, "El rango minimo debe ser mayor que el rango maximo");
			}
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