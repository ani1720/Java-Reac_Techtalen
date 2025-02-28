package UD05FlujoDatos.Ejercicios;

import javax.swing.JOptionPane;

public class Tarea13UD5CalculadoraInversaApp {

	public static void main(String[] args) {
	String op1Str =JOptionPane.showInputDialog("Operador 1");
	String op2Str =JOptionPane.showInputDialog("Operador 2") ;
	
	int op1= Integer.parseInt(op1Str) ;
	int op2= Integer.parseInt(op2Str) ;
	
	String signo= JOptionPane.showInputDialog("Introduce el signo") ;
	
	double result = 0 ;
	boolean operacionVal = true ;
	}

}
