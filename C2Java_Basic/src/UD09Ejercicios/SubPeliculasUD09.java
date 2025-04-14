package UD09Ejercicios;

import java.util.Random;

public class SubPeliculasUD09 extends SuperClassCine {

	protected int duracionPeli;
	protected int edadMinima;
	protected String directorPeli;
	
	
	public SubPeliculasUD09(String nombrePeli, double precioEntrada, int duracionPeli, int edadMinima, String directorPeli) {
		super(nombrePeli, precioEntrada);
		this.duracionPeli = duracionPeli;
		this.edadMinima = edadMinima;
		this.directorPeli = directorPeli;
	}
	public SubPeliculasUD09(String nombrePeli, int edadMinima) {
		this.nombrePeli = nombrePeli;
		this.edadMinima = edadMinima;
	}
	public SubPeliculasUD09(String directorPeli, int duracionPeli, int edadMinima) {
		this.directorPeli = directorPeli;
		this.duracionPeli = duracionPeli;
		this.edadMinima = edadMinima;
	}
	public int getDuracionPeli() {
		return duracionPeli;
	}
	
	
	public void setDuracionPeli(int duracionPeli) {
		this.duracionPeli = duracionPeli;
	}
	
	
	public int getEdadMinima() {
		return edadMinima;
	}
	
	
	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}
	
	
	public String getDirectorPeli() {
		return directorPeli;
	}
	
	
	public void setDirectorPeli(String directorPeli) {
		this.directorPeli = directorPeli;
	}
	
	
	public void mostrarDatosPeli() {
		System.out.println("Pelicula: " + nombrePeli);
		System.out.println("Director: " + directorPeli);
		System.out.println("Duracion: " + duracionPeli + " minutos");
		System.out.println("Edad minima: " + edadMinima + " años");
		System.out.println("Precio: €" + precioEntrada);
	}
}
