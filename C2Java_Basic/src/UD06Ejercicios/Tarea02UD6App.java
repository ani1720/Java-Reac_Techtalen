package UD06Ejercicios;

import java.util.Random;

import javax.swing.JOptionPane;

public class Tarea02UD6App {

	public static void main(String[] args) {
		// System.out.println(Math.random()*100);
		int numIngresado = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero "));

		int numMaxi = Integer.parseInt(JOptionPane.showInputDialog("introduce el rango maximo "));

		int numMini = Integer.parseInt(JOptionPane.showInputDialog("Introduce el rango minimo "));
			if (numMini <= 0) {
		JOptionPane.showMessageDialog(null, "No puede ser 0");
		return;	}
			
			}
			
				//System.out.println(valorRandom(numMaxi,numMini));


	public static int valorRandom(int numMaxi, int numMini) {
		Random random = new Random();
		 int result = random.nextInt(numMaxi-numMini+1) + numMini ;
		 return result; 
	}

}