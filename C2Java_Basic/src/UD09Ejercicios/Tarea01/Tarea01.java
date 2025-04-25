package UD09Ejercicios.Tarea01;

import javax.swing.JOptionPane;

import UD09Ejercicios.Tarea01.Electrodomestico.ColorEnum;
import UD09Ejercicios.Tarea01.Electrodomestico.ConsumoEnum;

public class Tarea01 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Bienvenido a la tienda de electrodomesticos");
			int cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos electrodomesticos desea comprar?"));
	for(int i = 0 ; i < cantidad; i++) {
			Electrodomestico[] array = new Electrodomestico[cantidad];
		int tipo = Integer.parseInt(JOptionPane.showInputDialog("¿Que tipo de electrodomestico desea?\n "
				+ "1. Electrodomestico\n"
				+ "2. Lavadora\n"
				+ "3. Television\n"
				+ "4. Lavadora\n"
				+ "5. Electrodomestico\n"));
		for (int e = 0; e < array.length; e++) {
			switch (tipo) {
			case 1:
				array[e] = new Electrodomestico(300, 5);
				double precioFinalElectro = array[e].precioFinal();
				JOptionPane.showMessageDialog(null, "Electrodoméstico Básico\n" +
		                "Precio Base: 300€\n" +
		                "Peso: 5kg " + precioFinalElectro + " €");
				break;
			case 2:
				array[e] = new SubLavadora(200, 8);
			
				JOptionPane.showMessageDialog(null, "Lavadora\n" +
		                "Precio Base: 200€\n" +
		                "Carga: 8kg " + array[e].precioFinal() + " €");
				break;
			case 3:
				array[e] = new SubTelevision(500, 42, true);
				 JOptionPane.showMessageDialog(null, "Televisión\n" +
			                "Precio Base: 500€\n" +
			                "Pulgadas: 42\n" +
			                "Sintonizador TDT: Sí " + array[e].precioFinal() + " €");
				break;
			case 4 :
				array[e] = new SubLavadora(250, 10);
				JOptionPane.showMessageDialog(null, "Lavadora\n" +
		                "Precio Base: 250€\n" +
		                "Carga: 10kg " + array[e].precioFinal() + " €");
				break;
			case 5 : 
				array[e] = new Electrodomestico(150, 5, ConsumoEnum.A, ColorEnum.NEGRO);
				JOptionPane.showMessageDialog(null, "Electrodoméstico Personalizado\n" +
		                "Precio Base: 150€\n" +
		                "Peso: 5kg\n " +
		                "Consumo Energético: A\n" +
		                "Color: Negro" + array[e].precioFinal() + " €");
				break;
			default:
				array[e] = new Electrodomestico();
				JOptionPane.showMessageDialog(null, "Electrodoméstico por Defecto\n" +
		                "Precio Base: 100€\n" +
		                "Peso: 10kg " + array[e].precioFinal() + " €");
			}
		}
		precioTotal(array);
	}
		
	}
	public static void precioTotal(Electrodomestico[] array1) {
	    double precioFinal = 0;

	    for (Electrodomestico array : array1) {
	        if (array != null) {
	            if (array instanceof SubLavadora) {
	                SubLavadora lavadora = (SubLavadora) array;
	                precioFinal = lavadora.precio + lavadora.precioFinalLav();
	            } else if (array instanceof SubTelevision) {
	                SubTelevision television = (SubTelevision) array;
	                precioFinal = television.precio + television.precioFinalTv();
	            } else {
	                precioFinal = array.precio + array.precioFinal();
	            }
	        }
	    }

	    System.out.println("El precio de todos los electrodomesticos: " + precioFinal);
	}
 }
	