package UD06Ejercicios;

import javax.swing.JOptionPane;

public class Tarea01UD6App {

	public static void main(String[] args) {
		String figura = JOptionPane.showInputDialog
				("Introduce la figura ") ;
		
		figura = figura.toLowerCase() ;
		
		switch (figura) {
			case "circulo" : //Decimos que si el usuario ingresa circulo le pediremos que introduzca el radio del circulo
				double variable1 = Double.parseDouble(JOptionPane.showInputDialog
						("Introduce el radio: ")) ;
						double result = Math.round(circulo(variable1)) ; //Llamamos al metodo donde esta la operacion aritmetica
				JOptionPane.showInternalMessageDialog(null, "El resultado de "
				+ "area del circulo es: " + result);
			break; 
	
			case "triangulo" : // Decimos que si el usuario ingresa triangulo le pediremos al usuario
				//que ingrese los datos de la base y la altura
				double variable2= Double.parseDouble(JOptionPane.showInputDialog
														("Introduce la base: ")) ;
				double variable3= Double.parseDouble(JOptionPane.showInputDialog
														("Introduce la altura: ")) ;
			
				double result2=Math.round(triangulo(variable2,variable3)); //Llamamos al metodo con la operacion aritmetica
				JOptionPane.showMessageDialog
					(null, "El resultado de " + "area del triangulo es " + result2);
			break;
			
			case "cuadrado" : //Decimos que si el usuario ingresa cuadrado le pida los datos de uno de los lados
				double variable4= Double.parseDouble(JOptionPane.showInputDialog
														("Introduce un lado"));
				double result3= Math.round(cuadrado(variable4)) ; //Llamamos al metodo donde esta la operacion aritmetica
				JOptionPane.showMessageDialog(null, "El resultado de " + "area del cuadrado es " + result3);
			break;
			default : JOptionPane.showMessageDialog //Decimos que es caso de que no ingrese ninguna de las tres figuras 
			//le diga al usuario que no es una figura
						(null, "No es una figura");
		break;
		}
	}
public static double circulo (double radio) { //metodo con la operacion aritmetica para el area de circulo
	return (Math.pow(radio, 2))*Math.PI ;
}
public static double triangulo (double base, double altura) { //metodo con la operacion aritmetica para el area de triangulo
	return (base * altura) / 2 ;
}
public static double cuadrado (double lado) { //metodo con la operacion aritmetica para el area de cuadrado
	return (lado * lado);
}
}
