package UD09Ejercicios.Tarea06;

import java.util.Random;

import javax.swing.JOptionPane;

public class SubPeliculasUD09 extends SuperClassCine {

	protected int duracionPeli;
	protected int edadMinima;
	protected String directorPeli;
	
	
	public SubPeliculasUD09(String nombrePeli, double precioEntrada, int duracionPeli, int edadMinima, String directorPeli) {
		this.nombrePeli = nombrePeli;
		this.duracionPeli = duracionPeli;
		this.edadMinima = edadMinima;
		this.directorPeli = directorPeli;
	}
	public SubPeliculasUD09(String nombrePeli, int edadMinima) {
		this.nombrePeli = nombrePeli;
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
		System.out.println("Pelicula: " + pelicula);
		System.out.println("Director: " + directorPeli);
		System.out.println("Duracion: " + duracionPeli + " minutos");
		System.out.println("Edad minima: " + edadMinima + " años");
		System.out.println("Precio: €" + precioEntrada);
	}
	public void comprarEntrada(int edadMinima, double precioEntrada) {
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad:"));

        if (edad < edadMinima) {
            JOptionPane.showMessageDialog(null, "No puedes comprar la entrada. Edad mínima: " + edadMinima);
        } else {
            JOptionPane.showMessageDialog(null, "El precio de la entrada es: " + precioEntrada + "€");
            double dineroPersona = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de dinero que tienes:"));

            if (dineroPersona < precioEntrada) {
                JOptionPane.showMessageDialog(null, "Dinero insuficiente. Necesitas al menos: " + precioEntrada + "€");
            } else {
                double cambio = dineroPersona - precioEntrada;
                JOptionPane.showMessageDialog(null, "Compra realizada con éxito. Tu cambio es: " + cambio + "€");
            }
        }
    }
	
}
