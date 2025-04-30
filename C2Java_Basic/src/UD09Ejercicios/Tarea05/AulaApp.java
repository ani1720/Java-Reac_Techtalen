package UD09Ejercicios.Tarea05;

import javax.swing.JOptionPane;

public class AulaApp {

	public static void main(String[] args) {
		// Crear profesor
		Profesor profesor = new Profesor("Tom", 40, 'M', "Matematicas");
		String nom = JOptionPane.showInputDialog("Ingrese el nombre del profesor");
		String mater = JOptionPane.showInputDialog("Ingresa la materia del profesor");
		Profesor profesor2 = new Profesor(nom, mater);
		 //Crear estudiantes
		
		Estudiante estudi1= new Estudiante("Ana", 20, 'F', 8.5);
		String nomEs= JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
		int edadEs = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del estudiante"));
		char sexEs = JOptionPane.showInputDialog("Ingresa el sexo del estudiante. Ejemplo: M o F").charAt(0);
		Estudiante estudi2 = new Estudiante(nomEs, edadEs,sexEs, 7.5);
		
		

	}

}
