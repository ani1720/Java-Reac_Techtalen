package UD08POOEjecicios;

public class Tarea01Persona {
	// atributos
	private String nombre;
	private int edad;
	private String Dni;
	private final char sexo;
	private double peso;
	private double altura;

//constantes
private final char SEXO_HOMBRE = 'H';

public Tarea01Persona () {
	this.nombre = "";
	this.edad = 0;
	this.Dni= "";
	this.sexo = SEXO_HOMBRE;
	this.peso =0;
	this.altura = 0;
}
public Tarea01Persona (String nombre, int edad) {
	this();
	this.nombre = nombre;
	this.edad = edad;
}
public Tarea01Persona (String nombre, int edad, String Dni, 
							char sexo, double peso, double altura) {
	this.nombre = nombre;
	this.edad = edad;
	this.Dni = Dni;
	this.sexo = SEXO_HOMBRE;
	this.peso = peso;
	this.altura = altura;
	
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public String getDni() {
	return Dni;
}
public void setDni(String dni) {
	Dni = dni;
}
public double getPeso() {
	return peso;
}
public void setPeso(double peso) {
	this.peso = peso;
}
public double getAltura() {
	return altura;
}
public void setAltura(double altura) {
	this.altura = altura;
}
public char getSexo() {
	return sexo;
}
public char getSEXO_HOMBRE() {
	return SEXO_HOMBRE;
}
}
