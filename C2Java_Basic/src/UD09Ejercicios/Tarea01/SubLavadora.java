package UD09Ejercicios.Tarea01;

public class SubLavadora extends T1Electrodomestico {
	protected double carga;

	private static final double CARGA_DEF = 5;

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}

	public static double getCargaDef() {
		return CARGA_DEF;
	}

	public SubLavadora() {
		this.precio = PRECIO_BASE;
		this.consumoEnergetico = CONSUMO_BASE;
		this.color = COLOR_BASE;
		this.pesoBase = PESO_BASE;
		this.carga = CARGA_DEF;
	}

	public SubLavadora(double precioBase, double peso) {
		this();
		this.precio = precioBase;
		this.pesoBase = peso;
	}

	public SubLavadora(double precio, double pesoBase, ColorEnum color,
						ConsumoEnum consumoEnergetico, double carga) {
		
		this.pesoBase = pesoBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.carga = carga;
		this.precio = precioFinalLav();
	}
	private double precioFinalLav() {
	
		double precioF = 0;
		switch (consumoEnergetico) {
		case A:
			precioF += 100;
			break;
		case B:
			precioF += 80;
			break;
		case C:
			precioF += 60;
			break;
		case D:
			precioF += 50;
			break;
		case E:
			precioF += 30;
			break;
		case F:
			precioF += 10;
			break;
		}
		if (pesoBase <= 80) {
			precio += 100;
		} else if (pesoBase >= 50 && pesoBase < 80) {
			precio += 80;
		} else if (pesoBase >= 20 && pesoBase < 50) {
			precio += 50;
		} else if (pesoBase > 5 && pesoBase < 20) {
			precio += 10;
		}
		if (pesoBase > 30) {
			precioF +=50 ;
		}
		return precioF;
	}
}
