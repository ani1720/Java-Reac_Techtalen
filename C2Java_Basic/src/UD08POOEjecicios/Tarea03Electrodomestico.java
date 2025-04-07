package UD08POOEjecicios;

public class Tarea03Electrodomestico {
//Constantes
	protected static final double PESO_BASE = 5;
	protected static final ColorEnum CONSUMO_BASE = ConsumoEnum.F ;
	protected static final ColorEnum COLOR_BASE = ColorEnum.BLANCO;
	protected static final double PRECIO_BASE = 100;

	
	//Atributos
		protected double pesoBase;
		protected ColorEnum consumoEnergetico;
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
		this.pesoBase = PESO_BASE;
		this.consumoEnergetico = CONSUMO_BASE;
		this.color = COLOR_BASE;
		this.precio = PRECIO_BASE;
	}
public Tarea03Electrodomestico() {
	this();
	this.precioB
}
}



