package UD09Ejercicios.Tarea05;

public class Estudiante {

	// Atributos
	protected String nombre;
	protected int edad;
	protected char sexo;
	protected double calificacion;
//	protected boolean asistencia;

	// Constructor
	public Estudiante(String nombre, int edad, char sexo, int calificacion) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.calificacion = calificacion;
	}

	public boolean haceNovillos() {
		return Math.random() > 0.5;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public char getSexo() {
		return sexo;
	}
}
