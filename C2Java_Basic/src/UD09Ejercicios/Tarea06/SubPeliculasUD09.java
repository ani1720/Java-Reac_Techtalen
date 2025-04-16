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
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad:"));

		if (edad < edadMinima) {
			JOptionPane.showMessageDialog(null, "No puedes comprar la entrada. Edad mínima: " + edadMinima);
			return 0;
		}

		int entradas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos boletos quiere comprar?"));
		double totalPr = precioEntrada * entradas;
		JOptionPane.showMessageDialog(null, "El precio total es: " + totalPr + "€");
		
		
		String[] opciones = { "Tarjeta", "Efectivo" };
		int metodo = JOptionPane.showOptionDialog(null, "Selecciona una metodo de pago", "Selecciona una opcion",
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, 
				opciones, opciones[0]);
		
		if (metodo == 0) {
			JOptionPane.showMessageDialog(null, "Pago con tarjeta realizado. Total: " + totalPr + "€");
		} else if (metodo == 1) {
			
			double dineroPersona = Double
					.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de dinero que tienes:"));

			if (dineroPersona < totalPr) {
				JOptionPane.showMessageDialog(null, "Dinero insuficiente. Necesitas al menos: " + String.format("%2.f", totalPr) + "€");
			} else {
				double cambio = dineroPersona - totalPr;
				JOptionPane.showMessageDialog(null, "Compra realizada con éxito. Tu cambio es: " + String.format("%.2f", cambio) + "€");
			}
		
		}else {
			JOptionPane.showMessageDialog(null, "No seleccionaste un metodo de pago");
			return 0;
		}
		return entradas;
	}
	}

//	public void metodoPago(double totalPr) {
		

