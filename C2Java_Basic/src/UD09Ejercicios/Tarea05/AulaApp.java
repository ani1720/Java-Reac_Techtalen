package UD09Ejercicios.Tarea05;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class AulaApp {

	public static void main(String[] args) {
		// Crear profesor
		Profesor profesor = new Profesor("Tom", 40, 'M', "Matematicas");
		String nom = JOptionPane.showInputDialog("Ingrese el nombre del profesor");
		String mater = JOptionPane.showInputDialog("Ingresa la materia del profesor");
		Profesor profesor2 = new Profesor(nom, mater);
		// Crear estudiantes

		String nomEs = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
		int edadEs = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del estudiante"));
		char sexEs = JOptionPane.showInputDialog("Ingresa el sexo del estudiante. Ejemplo: M o F").charAt(0);
		double califEs = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota del estudiante"));

		List<Estudiante> estudiantes = new ArrayList<>();
		estudiantes.add(new Estudiante("Ana", 20, 'F', 8.5));
		estudiantes.add(new Estudiante("Luis", 22, 'M', 6.0));
		estudiantes.add(new Estudiante("Pedro", 18, 'M', 4.5));
		estudiantes.add(new Estudiante(nomEs, edadEs, sexEs, califEs));

		Aula aula = new Aula(102, 3, "Matematicas", profesor, estudiantes);
		if (aula.puedeDarClase()) {
			JOptionPane.showMessageDialog(null, "Se puede dar clase");
			System.out.println("Se puede dar clase");
			aula.mostrarAprobados();
		} else {
			JOptionPane.showMessageDialog(null, "No se puede dar clase");
			System.out.println("No se puede dar clases");
		}

	}

}
