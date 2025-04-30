package UD09Ejercicios.Tarea05;

import java.util.List;

public class Aula {
 
	// Atributos
	protected int identificador;
	protected int maxEstudiantes;
	protected String materia;
	protected Profesor profesor;
	protected List<Estudiante> estudiantes;
	
	//Constructor
	public Aula(int identificador, int maxEstudiantes, String materia,
			    Profesor profesor, List<Estudiante> estudiantes) {
		
		this.identificador = identificador;
		this.maxEstudiantes = maxEstudiantes;
		this.materia = materia;
		this.profesor = profesor;
		this.estudiantes = estudiantes;

	}
	//Metodos
	public boolean puedeDarClase() {
		if (!profesor.estaDisponible()) {
			System.out.println("El profesor no esta disponibles");
			return false;
		}
		if (!profesor.getMateria().equalsIgnoreCase(materia)) {
			System.out.println("El profesor no da la materia correspondiente");
			return false;
		}
		long estudiantesPresentes = estudiantes.stream().filter(Estudiante::haceNovillos).count();
		if (estudiantesPresentes < maxEstudiantes / 2) {
			System.out.println("No hay suficiente asistencia de estudiante.");
			return false;
		}
		return true;
	}
	public void mostrarAprobados() {
		long aprobadosH = estudiantes.stream()
				.filter(e -> e.getCalificacion() >= 5 && e.getSexo() == 'M')
				.count();
		long aprobadosM = estudiantes.stream()
				.filter(e -> e.getCalificacion() >= 5 && e.getSexo() == 'F')
				.count();
		System.out.println("Aprobados masculinos: " + aprobadosH);
		System.out.println("Aprobados femeninos: " + aprobadosM);
	}
}

