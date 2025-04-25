package UD09Ejercicios.Tarea01;

public class Electrodomestico {
	protected static final double PESO_BASE = 5;
	protected static final ConsumoEnum CONSUMO_BASE = ConsumoEnum.F;
	protected static final ColorEnum COLOR_BASE = ColorEnum.BLANCO;
	protected static final double PRECIO_BASE = 100;

	// Atributos
	protected double precio;
	protected double pesoBase;
	protected ConsumoEnum consumoEnergetico;
	protected ColorEnum color;


	// Enum
	public enum ColorEnum {
		BLANCO, NEGRO, ROJO, AZUL, GRIS;
	}

	public enum ConsumoEnum {
		A, B, C, D, E, F;
	}

	public double getPeso() {
		return pesoBase;
	}

	public void setPeso(double peso) {
		this.pesoBase = peso;
	}

	public ConsumoEnum getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(ConsumoEnum consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public ColorEnum getColor() {
		return color;
	}

	public void setColor(ColorEnum color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public static double getPesoBase() {
		return PESO_BASE;
	}

	public static ConsumoEnum getConsumoBase() {
		return CONSUMO_BASE;
	}

	public static ColorEnum getColorBase() {
		return COLOR_BASE;
	}

	public static double getPrecioBase() {
		return PRECIO_BASE;
	}

//Constructores
	public Electrodomestico() {
		this.precio = PRECIO_BASE;
		this.pesoBase = PESO_BASE;
		this.consumoEnergetico = CONSUMO_BASE;
		this.color = COLOR_BASE;
		
	}

	public Electrodomestico(double precio, double pesoBase) {
		this();
		this.precio = precio;
		this.pesoBase = pesoBase;

	}

	public Electrodomestico(double precio, double pesoBase, ConsumoEnum consumoEnergetico, ColorEnum color) {
		this.precio = precio;
		this.pesoBase = pesoBase;
		this.consumoEnergetico = consumoEnergetico;
		this.color = color;
	}

	public Electrodomestico(ConsumoEnum consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
		this.precio = precioFinal();
	}

	 double precioFinal() {
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
		return precioF;
	}
}
