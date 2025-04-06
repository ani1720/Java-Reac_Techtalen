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
	protected Random randomPelicula() {
		Random random = new Random();
		String[] peli = mostrarPelicula();
		boolean peliAsignada = true;
		while (peli.length) {
			random.nextInt(peli.length);
			if (peliAsignada) {
				
			}
		}
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
