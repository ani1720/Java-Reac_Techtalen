package UD09Ejercicios.Tarea06;

import java.util.Random;

import javax.swing.JOptionPane;

public class SuperClassCine {
	// protected static final double PRECIO_DEFA = 12.99;
	protected String nombrePeli;
	protected double precioEntrada;

//	protected String[] pelicula;

	private String[][] asientos;
	private boolean[][] asientosOcupados;

	public SuperClassCine(String nombrePeli, double precioEntrada) {
		this.nombrePeli = nombrePeli;
		this.precioEntrada = 12.99;
	}
	//public SuperClassCine(String[] pelicula) {
	//	pelicula = new String[] { "1.Super Mario Bros. La película", "2.Capitán América: Un nuevo mundo",
		//		"3.Misión: Imposible 8" };
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
		asignarAsientos();
		StringBuilder salaVisual = new StringBuilder("Asientos disponibles\n Los X estan ocupados\n");
		for (int i = 0; i < asientos.length; i++) {
			for (int j = 0; j < asientos[i].length; j++) {
				salaVisual.append(asientos[i][j]).append(asientosOcupados[i][j] ? "(X)" : "(O)" + " ");
			}
			salaVisual.append("\n");
		}
		JOptionPane.showMessageDialog(null, salaVisual.toString());
	}
	public void elegirAsiento(SubEspectadorUD09 espectador, int entradas) {
		mostrarAsientos();
		
		for (int i = 1; i <= entradas; i++) {
			boolean asientoValido = false;
			while (!asientoValido) {
				String eleccion = JOptionPane.showInputDialog("Introduce el asiento deseado (Ejemplo: 5B):");
				if (eleccion != null && marcarAsiento(eleccion)) {
					JOptionPane.showMessageDialog(null, "Espectador " + espectador.nombrePersona + 
							" asignado al asiento " + eleccion);
					asientoValido = true;
				}else  {
					JOptionPane.showMessageDialog(null, "El asiento seleccionado no esta disponible. Por favor elige otro");
			}
		}
			
		
		
		}
		}
//}
private boolean marcarAsiento(String asiento) {
	for (int f = 0; f < asientos.length; f ++) {
		for (int c = 0; c < asientos[f].length; c++) {
			if (asientos[f][c].equals(asiento) && !asientosOcupados[f][c]) {
				asientosOcupados[f][c] = true;
				return true;
			}
		}
	}
	return false;
}
	public void asignarAsientos() {
		Random random = new Random();
		int cantidadAsiento = random.nextInt(30) + 5;

		for (int i = 0; i < cantidadAsiento; i++) {
			int fila, columna;
			do {
				 fila = random.nextInt(8);
				 columna = random.nextInt(9);
			} while (asientosOcupados[fila][columna]) ;
			asientosOcupados[fila][columna] = true;
		}	
			}
	}

