package UD06Ejercicios;

import javax.swing.JOptionPane;

public class Tarea05UD06App {

	public static void main(String[] args) {
		//inicializamos el valor double para los decimales 
		String numero = "";
		//Pedimos al usuario que nos ingrese el numero con el cual operaremos 
		numero = JOptionPane.showInputDialog("Ingrese un numero ");
		int num = Integer.parseInt(numero); 
		
		JOptionPane.showMessageDialog(null, binario(num));
	}
public static String binario(int divisor) { //Metodo para resolver el binario 
	/*Creamos una variable String ya que asi nos pide el ejercicio que devolvamos 
	 * el resultado 
	 */
	String resultado= "";
	int resto; //este sera el entero con el se operara 
	do { //con Do While asignamos al entero resto que ahora sera divisor resto de 2
		resto = divisor % 2;
		divisor = divisor / 2; // Y como ahora divisor sera el resto de 2 diremos que ese resto se dividira entre 2
		resultado = resto + resultado ; //Y el resultado sera la iniciacion del resto + el resultado
		
	}while (divisor > 0);
	return resultado ;
}
public static String deciBina (int decimal) {
	if (decimal == 0) {
		return "0" ;
	}
	/*
	 * Inicializamos un StringBuilder que sera
	 * objeto mutable que permite construir la cadena del número binario
	 *  de forma eficiente mediante modificaciones directas, evitando 
	 *  las limitaciones de concatenar strings tradicionalmente
	 */
	StringBuilder binario= new StringBuilder() ; 
	/* Creamos un String Builder vacio para alli generar el binario
	/*Por un bucle DO WHILE hacemos la operacion donde convertiremos en binario la operacion
	 */
	
	do {
		int res = decimal % 2 ; 
		/*Calcula el residuo de dividir el decimal entre 2. 
		este sera 0 o 1 ya que representa el digito menos significativo
		*/
		binario.insert(0, res) ;
		/*se inserta el digito binario que se obtuvo del res y al iniciar representa el binario
		 * aso se asegura que los digitos del numero binario se agreguen en orden
		*/ 
		decimal = decimal / 2 ; //aqui divide en valor actual entre 2 eliminando el binario
		// mostrando la iteracion de la division entre 2 
		JOptionPane.showMessageDialog(null, res + " " + decimal) ;
	} while (decimal > 0) ; // cuando el decimal se haya reducido a 0 se acaba el bucle
	return binario.toString();
	}

}
