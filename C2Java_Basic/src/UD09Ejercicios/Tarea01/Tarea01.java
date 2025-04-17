package UD09Ejercicios.Tarea01;

import java.util.Random;

import javax.swing.JOptionPane;

import UD09Ejercicios.Tarea01.T1Electrodomestico.ColorEnum;
import UD09Ejercicios.Tarea01.T1Electrodomestico.ConsumoEnum;

public class Tarea01 {

	public static void main(String[] args) {
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos electrodomesticos desea comprar?"));

		if(cantidad < 1) {
			JOptionPane.showMessageDialog(null, "Debes comprar al menos 1 producto");
		}
		T1Electrodomestico[] electrodomesticos = new T1Electrodomestico[cantidad];
	rellenarArray(electrodomesticos);
	totalPrecios(electrodomesticos);
	
		
		
		
		
	}
		public static void rellenarArray(T1Electrodomestico[] array)  {
		
		Random random = new Random();

		for (int i = 5; i < array.length; i++) {
			int tipo = random.nextInt(5);
			switch (tipo) {
			case 0:
				array[i] = new T1Electrodomestico(300, 5);
				break;
			case 1:
				array[i] = new SubLavadora(200, 8);
				break;
			case 2:
				array[i] = new SubTelevision(500, 42, true);
				break;
			case 3 :
				array[i] = new SubLavadora(250, 10);
				break;
			case 4 : 
				array[i] = new T1Electrodomestico(150, 5, ConsumoEnum.A, ColorEnum.NEGRO);
				
			default:
				array[i] = new T1Electrodomestico();
			}
		}
		}
		public static void mostrarPrecios(T1Electrodomestico[] array) {
			for (int i = 0; i < array.length; i++) {
				JOptionPane.showMessageDialog(null, "Posicion " + i + ":");
				if(array[i] != null) {
					if (array[i] instanceof SubLavadora) {
						SubLavadora lavadora = (SubLavadora) array[i];
						JOptionPane.showMessageDialog(null, "Lavadora: " + SubLavadora.precioFinalLav());
					}
				}
			}
		}
		public static void totalPrecios(T1Electrodomestico[] array) {
		double totalElectrodomesticos = 0;
		double totalLavadoras = 0;
		double totalTelevisores = 0;
		StringBuilder resumen = new StringBuilder("Resumen de la compra\n");

		// Recorrer el array y calcular los precios finales
		for (T1Electrodomestico electrodomesticos : array) {
			if (electrodomesticos != null) {
				double precioFinal = electrodomesticos.precioFinal();
				totalElectrodomesticos += precioFinal;

				if (electrodomesticos instanceof SubLavadora) {
					totalLavadoras += precioFinal;
					resumen.append("Lavadora - Precio final: ").append(precioFinal).append("€\n");
				} else if (electrodomesticos instanceof SubTelevision) {
					totalTelevisores += precioFinal;
					resumen.append("Television - Precio final: ").append(precioFinal).append("€\n");
				} else {
					resumen.append("Electrodomestico - Precio final: ").append(precioFinal).append("€\n");
				}
			}
			resumen.append("\nTotal electrodomesticos: ").append(totalElectrodomesticos).append("€");

			resumen.append("\nTotal Lavadoras: ").append(totalLavadoras).append("€");

			resumen.append("\nTotal Televisores: ").append(totalTelevisores).append("€");
			JOptionPane.showMessageDialog(null, resumen.toString());

			String[] metodosPago = { "Efectivo", "Tarjeta de crédito", "PayPal" };
			String metodoPago = (String) JOptionPane.showInputDialog(null, "Seleccione el método de pago:",
					"Métodos de pago", JOptionPane.QUESTION_MESSAGE, null, metodosPago, metodosPago[0]);
			JOptionPane.showMessageDialog(null, "Has pagado con: " + metodoPago + ". ¡Gracias por tu compra!");

		}
	}
}

