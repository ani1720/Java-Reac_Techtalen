package UD09Ejercicios;

import java.util.Random;

import javax.swing.JOptionPane;

public class SuperClassCine {
	protected static final double PRECIO_DEFA = 12.99;
	protected String nombrePeli;
	protected double precioEntrada;

	protected String[] pelicula;

	private String[][] asientos;
	private boolean[][] asientosOcupados;

	public SuperClassCine(double precioEntrada) {
		this.precioEntrada = PRECIO_DEFA;
	}
	public SuperClassCine(String[] pelicula) {
	pelicula = new String[] {
			"1.Super Mario Bros. La película", 
			"2.Capitán América: Un nuevo mundo",
			"3.Misión: Imposible 8" };
	}
	

	public String[] getPelicula() {
		return pelicula;
	}
	public void setPelicula(String[] pelicula) {
		this.pelicula = pelicula;
	}
	public String[][] getAsientos() {
		return asientos;
	}
	public void setAsientos(String[][] asientos) {
		this.asientos = asientos;
	}
	public boolean[][] getAsientosOcupados() {
		return asientosOcupados;
	}
	public void setAsientosOcupados(boolean[][] asientosOcupados) {
		this.asientosOcupados = asientosOcupados;
	}
	public static double getPrecioDefa() {
		return PRECIO_DEFA;
	}
	public SuperClassCine() {
		this.asientos = new String[8][9];
		this.asientosOcupados = new boolean[8][9];
		inicializarAsientos();
	}

	protected void inicializarAsientos() {
		char[] columnas = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I' };
		for (int n = 0; n < asientos.length; n++) {
			for (int l = 0; l < asientos[n].length; l++) {
				asientos[n][l] = (8 - n) + String.valueOf(columnas[l]);
				asientosOcupados[n][l] = false;
			}
		}
	}

	public void mostrarAsientos() {
		StringBuilder salaVisual = new StringBuilder("Asientos disponibles\n");
		for (int i = 0; i < asientos.length; i++) {
			for (int j = 0; j < asientos[i].length; j++) {
				salaVisual.append(asientos[i][j]).append(asientosOcupados[i][j] ? "(O)" : "(X)" + " ");
			}
			salaVisual.append("\n");
		}
		JOptionPane.showMessageDialog(null, salaVisual.toString());
	}

	public boolean asignarAsiento(SubEspectadorUD09 espectador) {
		Random random = new Random();
		boolean asignado = false;

		while (!asignado) {
			int fila = random.nextInt(8);
			int columna = random.nextInt(9);
			if (!asientosOcupados[fila][columna]) {
				asientosOcupados[fila][columna] = true;
				JOptionPane.showMessageDialog(null, "Espectador " + espectador.getNombrePersona()
						+ " asignado el asiento " + asientos[fila][columna]);
				asignado = true;
			}
		}
		return asignado;
	}

	public String[] mostrarPelicula() {
		String[] pelicula = { "1.Super Mario Bros. La película", "2.Capitán América: Un nuevo mundo",
				"3.Misión: Imposible 8" };

		System.out.println("Peliculas disponibles en el cine: " + pelicula);
		for (String movie : pelicula) {
			System.out.println("- " + pelicula);
		}
		return pelicula;
	}

}
