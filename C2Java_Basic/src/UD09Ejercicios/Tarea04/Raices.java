package UD09Ejercicios.Tarea04;

import javax.swing.JOptionPane;

public class Raices {
	// Atributos
protected double a;
protected double b;
protected double c;

// Constructores
public Raices(double a, double b, double c) {
	this.a = a;
	this.b = b;
	this.c = c;
}
//
public double getDiscriminante() {
	return (b * b) - (4 * a * c);
}
public boolean tieneRaices() {
	return getDiscriminante() > 0;
}
public boolean tieneRaiz() {
	return getDiscriminante() == 0;
}
public void calcular() {
	if (tieneRaices()) {
		obtenerRaices();
	} else if (tieneRaiz()) {
		obtenerRaiz();
	}else {
		JOptionPane.showMessageDialog(null, "La ecuacion no tiene reales");
		System.out.println("La ecuacion no tiene reales\n");
	}
}
private void obtenerRaices() {
	double discriminante = Math.sqrt(getDiscriminante());
	double solucion1 = (-b + discriminante) / (2 * a);
	double solucion2 = (-b - discriminante) / (2 * a);
	
	JOptionPane.showMessageDialog(null, "Solucion 1: " + solucion1 + "\n" + "Solucion 2: " + solucion2);
	System.out.println("Solucion 1: " + solucion1 + "\n");
	System.out.println("Solucion 2: " + solucion2 + "\n");
}
private void obtenerRaiz() {
	double solucion = -b / (2 * a);
	JOptionPane.showMessageDialog(null, "Unica solucion: " + solucion);
	System.out.println("Unica solucion: " + solucion);
}
}
