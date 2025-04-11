package UD08POOEjecicios;

public class Tarea03Electrodomestico {
//Constantes
	protected static final double PESO_BASE = 5;
	protected static final ConsumoEnum CONSUMO_BASE = ConsumoEnum.F ;
	protected static final ColorEnum COLOR_BASE = ColorEnum.BLANCO;
	protected static final double PRECIO_BASE = 100;

	
	//Atributos
		protected double peso;
		protected ConsumoEnum consumoEnergetico;
		protected ColorEnum color;
		protected double precio;
		//Enum
		public enum ColorEnum {
			BLANCO, NEGRO, ROJO, AZUL, GRIS;
		}
		public enum ConsumoEnum {
			A, B, C, D, E, F ;
		}
//Constructores
public Tarea03Electrodomestico() {
		this.peso = PESO_BASE;
		this.consumoEnergetico = CONSUMO_BASE;
		this.color = COLOR_BASE;
		this.precio = PRECIO_BASE;
	}
public Tarea03Electrodomestico(double precio, double pesoBase) {
	this.precio = precio;
	this.peso = pesoBase ;
	
}
public Tarea03Electrodomestico (double precio, double pesoBase, ColorEnum color,
									ConsumoEnum consumoEnergetico) {
this.precio = precio;
this.peso = pesoBase;
this.color = color;
this.consumoEnergetico = consumoEnergetico;
}
public double getPeso() {
	return peso;
}
public void setPeso(double peso) {
	this.peso = peso;
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
}



