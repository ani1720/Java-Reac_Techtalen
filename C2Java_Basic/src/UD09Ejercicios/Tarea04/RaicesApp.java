package UD09Ejercicios.Tarea04;

import javax.swing.JOptionPane;

public class RaicesApp {

	public static void main(String[] args) {
		int raiz = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a: "));
		int raiz2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de b:"));
		int raiz3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de c:"));

		Raices eq4 = new Raices(raiz, raiz2, raiz3);
		eq4.calcular();
		
		Raices eq1 = new Raices(1, -4, 2);
		eq1.calcular();

		Raices eq2 = new Raices(2, 3, 5);
		eq2.calcular();

		Raices eq3 = new Raices(8, 3, 6);
		eq3.calcular();
		
	}

}
