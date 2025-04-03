package UD07Ejercicios;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Tarea03UD07App {
	public static void main(String[] args) {

	}

	private static void mostrarStock(HashMap<String, Integer> stock) {
		// HashMap<String, Integer> stock = new HashMap<>();

		stock.put("Huevos", 10);
		stock.put("Leche", 20);
		stock.put("Pan", 50);
		stock.put("Azucar", 10);
		stock.put("Harina de avena", 10);
		stock.put("Mantequilla", 5);
		stock.put("Coca Cola", 10);
		stock.put("Arroz", 20);
		stock.put("Sprite", 10);
		stock.put("Lentejas", 10);
		stock.put("Queso", 6);

		JOptionPane.showMessageDialog(null, "Stock disponible: " + stock);
	}

	private static void gestionStock(HashMap<String, Integer> stock) {
		boolean continuarGestion = true;
		while (continuarGestion) {
			String decision = JOptionPane.showInputDialog("¿Desea ver el stock disponible? (SI/NO)");
			
			if (decision.equalsIgnoreCase("Si")) {
				for (String producto : stock.keySet()) {
					double cant = stock.get(producto);
				}
				
			} else if (decision.equalsIgnoreCase("No")) {
				String geStock = JOptionPane.showInputDialog("¿Desea gestionar el stock? (SI/NO)");

				switch (geStock.toLowerCase()) {

				case "si":
					String producto = JOptionPane.showInputDialog("Ingresa el articulo que deseas añadir");
					String cantStr = JOptionPane.showInputDialog("Ingresa la cantidad que de articulos que añadiras");
					int cant = Integer.parseInt(cantStr);
					stock.put(producto, stock.getOrDefault(producto, 0) + cant);
					JOptionPane.showMessageDialog(null,
							"Has añadido al Stock " + producto + " con una cantidad de: " + cant + " unidades");
					break;
				case "no":
					int verLista = JOptionPane.showConfirmDialog(null,
							"¿Quieres ver la lista de productos actualizada?", "Confirmar", JOptionPane.YES_NO_OPTION);
					
					if (verLista == JOptionPane.YES_OPTION) {
						StringBuilder lista = new StringBuilder("Lista actualizada de productos:\n");
						for (String key : stock.keySet()) {
							lista.append(key).append(": ").append(stock.get(key)).append(" unidades\n");
						}
						JOptionPane.showMessageDialog(null, lista.toString());
					}
					continuarGestion = false;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opcion no valida, por favor escribe 'si' o 'no'.");
				}
			} else {
				 int out = JOptionPane.showConfirmDialog(null, "¿Desea salir de la aplicacion?", "Salir", JOptionPane.YES_NO_OPTION);
				if(out == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "Gracias por usar la aplicacion. ¡Hasta pronto!");
				System.exit(0);
				}else {
					JOptionPane.showMessageDialog(null, "Continuas en la aplicacion");
				}
			}
		}

	}

}
