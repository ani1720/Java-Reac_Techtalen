package UD09Ejercicios;

import java.util.ArrayList;

public class SuperClassCine {
	
		protected String nombrePeli;
		protected double precioEntrada;
		
		private ArrayList<String> pelicula;
		
		public SuperClassCine(String nombrePeli, double precioEntrada) {
			this.nombrePeli= nombrePeli;
			this.precioEntrada= 12.99;
		}
		public void mostrarPelicula() {
			ArrayList<String> pelicula = new ArrayList<>();
			pelicula.add("Super Mario Bros. La película");
			pelicula.add("Capitán América: Un nuevo mundo");
			pelicula.add("Misión: Imposible 8");
			pelicula.add("Jurassic World: El renacer");
			pelicula.add("Kraven the Hunter");
			pelicula.add("Lilo & Stitch (2025)");
			System.out.println("Peliculas disponibles en el cine: " + pelicula);
			for (String peliculas : pelicula) {
				System.out.println("- "+ pelicula);
			}
		}
		//public void asientos() {
		//	ArrayList<Integer, Character> asiento = new ArrayList<>();
		//}

		
		public String getNombrePeli() {
			return nombrePeli;
		}
		
		
		public void setNombrePeli(String nombrePeli) {
			this.nombrePeli = nombrePeli;
		}
		
		
		public double getPrecioEntrada() {
			return precioEntrada;
		}
		
		
		public void setPrecioEntrada(double precioEntrada) {
			this.precioEntrada = precioEntrada;
		}
}
