package UD05FlujoDatos.Ejercicios;

import javax.swing.JOptionPane;

public class Tarea13UD5CalculadoraInversaApp {

	public static void main(String[] args) {
		 // Solicita al usuario que ingrese el primer operador
	String op1Str =JOptionPane.showInputDialog("Operador 1");
	// Solicita al usuario que ingrese el segundo operador
	String op2Str =JOptionPane.showInputDialog("Operador 2") ;
	
	 // Convierte los operadores ingresados de tipo String a tipo int
	int op1= Integer.parseInt(op1Str) ;
	int op2= Integer.parseInt(op2Str) ;
	
	 // Solicita al usuario que ingrese el signo de la operación
	String signo= JOptionPane.showInputDialog("Introduce el signo") ;
	
	// Variable para almacenar el resultado de la operación
	double result = 0 ;
	
	// Variable para verificar si la operación es válida
	boolean operacionVal = true ;
	

    // Estructura switch para determinar la operación según el signo ingresado
	switch (signo) {
	case "+" :
		result = op1 + op2 ;
		break;
	case "-" : 
		result = op1 - op2 ;
		break;
	case "*" : 
		result = op1 * op2 ;
		break;
	case "/" :  
		result = op1 / op2 ;
		// Verifica si el segundo operador no es cero para evitar división por cero
		if (op2 != 0) {
			result =op1 / (double) op2 ; //Se hace la division y se convierte en double el resultado por si lleva decimales
               
		} else { //Si el 2do operador es CERO lo marca como no valida la operacion
			operacionVal = false ;
			JOptionPane.showMessageDialog(null, "No se puede dividir por 0") ;
		}
		break;
	case "^" : 
		result = op1 ^ op2 ;
		break; 
	case "%" : // Repetimos la verificacion de la division para descartar un error con el CERO
		if (op2 != 0) {
			result =op1 % op2 ;
		} else {
			operacionVal = false ;
			JOptionPane.showMessageDialog(null, "No se puede calcular el modulo con un divisor de CERO") ;
		}
		
		break;
		default : 
			operacionVal = false ;
			JOptionPane.showMessageDialog(null, "Operacion no valida") ;
			break;
	}
	if (operacionVal) {
		JOptionPane.showMessageDialog(null, "El resultado es "+ result) ;
	}
	}

}
