package UD04JavaBasic;

public class EntradaYSalidaApp {

	public static void main(String[] args) {
		int precioProducto=300;
		
		final double IVA=0.21;
		System.out.println("Informacion del producto");
		
		System.out.println("El precio del producto es "+precioProducto);
		
		System.out.println("El precio del producto, incluye el IVA, es "+(precioProducto+(precioProducto*IVA)));

	}

}
