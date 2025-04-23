package UD09Ejercicios.Tarea06;

import javax.swing.JOptionPane;

public class SubPeliculasUD09 extends SuperClassCine {

	protected int duracionPeli;
	protected int edadMinima;
	protected String directorPeli;

	public SubPeliculasUD09(String nombrePeli, double precioEntrada, int duracionPeli, int edadMinima,
			String directorPeli) {

		super(nombrePeli, precioEntrada);
		this.duracionPeli = duracionPeli;
		this.edadMinima = edadMinima;
		this.directorPeli = directorPeli;
	}
//	public SubPeliculasUD09(String nombrePeli, int edadMinima) {
	// this.nombrePeli = nombrePeli;
	// this.edadMinima = edadMinima;
	// }

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

	public int comprarEntrada(int edadMinima, double precioEntrada) {

		int entradas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos boletos quiere comprar?"));
		int entradasCheck = 0;
		String[] nombres = new String[entradas];
		for (int i = 0; i < entradas; i++) {
			int edad = Integer
					.parseInt(JOptionPane.showInputDialog("Introduce la edad del espectador" + (i + 1) + ":"));
			if (edad >= edadMinima) {
				String nombre = JOptionPane
						.showInputDialog("Introduce el nombre del espectador " + (entradasCheck + 1) + ":");
				nombres[entradasCheck] = nombre;
				entradasCheck++;
				
				//SubEspectadorUD09 espectador = new SubEspectadorUD09(nombre);
				//elegirAsiento(espectador, 1);	
			} else {
					JOptionPane.showMessageDialog(null,
							"El espectador " + (i + 1) + " no cumple con la edad minima de " + edadMinima + " años");
			}
			// if (entradasCheck > 0) {
			// String[] nombres = new String[entradasCheck];
			// for (int n = 0; n < entradasCheck; n++) {
			// nombres[n] = JOptionPane.showInputDialog("Introduce el nombre del espectador
			// " + (n + 1) + ":");
		}
		double totalPr = precioEntrada * entradasCheck;
		String[] opciones = { "Tarjeta", "Efectivo" };
		int metodo = JOptionPane.showOptionDialog(null, "Selecciona una metodo de pago", "Selecciona una opcion",
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

		if (metodo == 0) {
			JOptionPane.showMessageDialog(null, "Pago con tarjeta realizado. Total: " + totalPr + "€");
		} else if (metodo == 1) {
			JOptionPane.showMessageDialog(null, "Total a pagar: " + totalPr);
			double dineroPersona = Double
					.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de dinero que tienes:"));

			if (dineroPersona < totalPr) {
				JOptionPane.showMessageDialog(null,
						"Dinero insuficiente. Necesitas al menos: " + String.format("%.2f", totalPr) + "€");
			} else {
				double cambio = dineroPersona - totalPr;
				JOptionPane.showMessageDialog(null,
						"Compra realizada con éxito. Tu cambio es: " + String.format("%.2f", cambio) + "€");
			}

		} else {
			JOptionPane.showMessageDialog(null, "No seleccionaste un metodo de pago");
			// return 0;
		}
		return entradasCheck;
	}
}

//	public void metodoPago(double totalPr) {
