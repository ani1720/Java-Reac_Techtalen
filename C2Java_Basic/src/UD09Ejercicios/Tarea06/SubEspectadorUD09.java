package UD09Ejercicios.Tarea06;

import javax.swing.JOptionPane;

public class SubEspectadorUD09 extends SuperClassCine {
	protected String nombrePersona;
	protected int edad;
	protected double dineroPersona;
	protected boolean asiento;

	public SubEspectadorUD09(String nombrePersona, int edad, double dineroPersona) {
		// super(null,0);
		this.nombrePersona = nombrePersona;
		this.edad = edad;
		this.dineroPersona = dineroPersona;
	}

	public SubEspectadorUD09(String espectador) {
		this.nombrePersona =  espectador;
				//JOptionPane.showInputDialog("Ingresa el nombre del espectador: ");
				
	}
	public static void comprobarNombres () {
		
		int entradas=0, entradasCheck = 0;
		for (int i = 0; i < entradas; i++) {
			if(entradasCheck < 0) {
				String [] nombres = new String[entradasCheck];
				for (int n = 0; n < entradasCheck; i++) {
					nombres[i] = JOptionPane.showInputDialog("Introduce el nombre del espectador " + (n + 1) + ":");
		}
		
			}
	}
	}
//public void metodoPago() {
//	double precioEntrada = 12.99;
//	String metodo = JOptionPane.showInputDialog("¿Deseas pagar con tarjeta o en efectivo?");
	// if (metodo.equalsIgnoreCase("tarjeta")) {
	// JOptionPane.showMessageDialog(null, "El monto a pagar es de " +
	// precioEntrada);
	// }else if (metodo.equalsIgnoreCase("efectivo")) {
	// double dinUsua = Double.parseDouble(JOptionPane.showInputDialog(dineroPersona
	// + " ¿Cuanto dinero tienes?"));
	// if (dinUsua = precioEntrada) {
// JOptionPane.showMessageDialog(null, "Pago exitoso");
//{else if (dinUsua > precioEntrada) {
// double cambio = dinUsua - precioENtrada;
// JOptionPane.showMessageDialog(null, "Pago exitoso, su cambio es de " + cambio);
	// }

//}
	// @Override
	public String getNombrePersona() {
		return nombrePersona;
	}

	// @Override
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	// @Override
	public int getEdad() {
		return edad;
	}

	// @Override
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getDineroPersona() {
		return dineroPersona;
	}

	public void setDineroPersona(double dineroPersona) {
		this.dineroPersona = dineroPersona;
	}
}
