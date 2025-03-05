package UD06Ejercicios;

import javax.swing.JOptionPane;

public class Tarea01UD6App {

	public static void main(String[] args) {
		String figura = JOptionPane.showInputDialog
				("Introduce la figura ") ;
		figura = figura.toLowerCase() ;
		
		switch (figura) {
		case "circulo" :
		double variable1 = Double.parseDouble(JOptionPane.showInputDialog
				("Introduce el radio: ")) ;
		double result = Math.round(circulo(variable1)) ;
		JOptionPane.showInternalMessageDialog(null, "EL resultado de "
				+ "area del circulo es: " + result);
		break; 
	
		case "triangulo" :
			double variable2= Double.parseDouble(JOptionPane.showInputDialog
					("Introduce la base: ")) ;
			double variable3= Double.parseDouble(JOptionPane.showInputDialog
					("Introduce la altura: ")) ;
			
			double result2=Math.round(triangulo(variable2,variable3));
			JOptionPane.showMessageDialog
			(null, "El resultado de " + "area del triangulo es " + result2);
			break;
			
		case "cuadrado" :
			double variable4= Double.parseDouble(JOptionPane.showInputDialog
					("Introduce un lado"));
			double result3= Math.round(cuadrado(variable4)) ;
			JOptionPane.showMessageDialog(null, "El resultado de " + "area del cuadrado es " + result3);
			break;
		default : JOptionPane.showMessageDialog
		(null, "No es una figura");
		break;
		}
	}
public static double circulo (double radio) {
	return (Math.pow(radio, 2))*Math.PI ;
}
public static double triangulo (double base, double altura) {
	return (base * altura) / 2 ;
}
public static double cuadrado (double lado) {
	return (lado * lado);
}
}
