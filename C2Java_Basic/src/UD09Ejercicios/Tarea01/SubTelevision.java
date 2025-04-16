package UD09Ejercicios.Tarea01;

public class SubTelevision extends T1Electrodomestico {
	protected double resolucion;
	protected boolean sintonizadorTDT;

	private static final double RESO_DEFEC = 20;
	private static final boolean SINTONIZADOR_DEFE = false;

	public double getResolucion() {
		return resolucion;
	}

	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}

	public static double getResoDefec() {
		return RESO_DEFEC;
	}

	public static boolean isSintonizadorDefe() {
		return SINTONIZADOR_DEFE;
	}

	public SubTelevision() {
		this.precio = PRECIO_BASE;
		this.pesoBase = PESO_BASE;
		this.consumoEnergetico = CONSUMO_BASE;
		this.color = COLOR_BASE;
		this.resolucion = RESO_DEFEC;
		this.sintonizadorTDT = SINTONIZADOR_DEFE;
	}

	public SubTelevision(double precio, double peso) {
		this();
		this.precio = precio;
		this.pesoBase = peso;
	}

	public SubTelevision(double precio, double pesoBase, ConsumoEnum consumoEnergetico, ColorEnum color,
			double resolucion, boolean sintonizadorTDT) {

		this.pesoBase = pesoBase;
		this.consumoEnergetico = consumoEnergetico;
		this.color = color;
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
		this.precio = precioFinalTv();
	}

	private double precioFinalTv() {
		double precioF = 0;
		if (resolucion > 40) {
			precioF = precioF * 1.30;
		}
		if (sintonizadorTDT == true) {
			precioF += 50;
		}
		return precioF;
	}
}
