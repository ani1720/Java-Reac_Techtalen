package UD09Ejercicios.Tarea05;

public class Profesor {
// Atributos
	protected String nombre;
	protected int edad;
	protected char sexo;
	protected String materia;
	
	//Contructor
	public Profesor(String nombre, int edad, char sexo, String materia) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.materia = materia;
	}
	public Profesor(String nombre, String materia) {
		this.nombre = nombre;
		this.materia = materia;
	}
	public boolean estaDisponible() {
		return Math.random() > 0.2;
	}
	public String getMateria() {
		return materia;
	}
}
