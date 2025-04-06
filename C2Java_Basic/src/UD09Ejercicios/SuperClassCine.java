package UD09Ejercicios;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class SuperClassCine {
	
		protected String nombrePeli;
		protected double precioEntrada;
		
		private ArrayList<String> pelicula;
		
		private String[] [] asientos;
		private boolean [] [] asientosOcupados;
		
		public SuperClassCine(String nombrePeli, double precioEntrada) {
			this.nombrePeli= nombrePeli;
			this.precioEntrada= 12.99;
			this.asientos = new String [8] [9];
			this.asientosOcupados = new boolean [8] [9];
			inicializarAsientos();
			
		}
		protected void inicializarAsientos() {
			char[] columnas = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H','I'};	
			for (int l = 0; l <asientos.length; l++) {
				for (int j = 0; asientos[l].length; l++) {
					asientos[l][j] = columnas[j] + String.valueOf(columnas[j]);
					asientosOcupados[l][j]= false;
				}
			}
			}
		public void mostrarAsientos() {
			for (int k = 0; k <asientos.length; k++) {
				for (int i = 0 ; i < asientos.length; i++) {
					for (int j = 0; j < asientos[i].length; j++) {
						System.out.println(asientos[i][j] + (asientosOcupados[i][j] ? "(O)" : "(X") + " ");	
					}
					System.out.println();
				}
			}
		
		}
		public boolean asignarAsiento(SubEspectadorUD09 espectador) {
			Random random = new Random();
			boolean asignado = false;
			
			while (!asignado) {
				int fila = random.nextInt(8);
				int columna = random.nextInt(9);
				if(!asientosOcupados[fila][columna]) {
					asientosOcupados[fila][columna] = true;
					JOptionPane.showMessageDialog(null, "Espectador "+ espectador.getNombrePersona() 
													+ " asignado el asineto " + asientos[fila][columna]);
					asignado = true;
				}
			}
			return asignado;
		}
		public String[] mostrarPelicula() {
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
