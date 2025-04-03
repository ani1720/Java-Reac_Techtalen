package UD07Ejercicios;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Tarea03UD07App {
	public static void main(String[] args) {
		HashMap<String, Integer> stock = new HashMap<>();
		mostrarStock(stock);
		JOptionPane.showMessageDialog(null, "Bienvenido al Sistema de Inventario");
		gestionStock(stock);
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

		// JOptionPane.showMessageDialog(null, "Stock disponible: " + stock);
	}
	 private static void gestionStock(HashMap<String, Integer> stock) {
	        boolean continuarGestion = true;

	        while (continuarGestion) {
	            String decision = JOptionPane.showInputDialog("¿Desea ver el stock disponible? (SI/NO)");

	            if (decision != null && decision.equalsIgnoreCase("Si")) {
	                // Mostrar el stock
	                StringBuilder listaStock = new StringBuilder("Stock disponible:\n");
	                for (String producto : stock.keySet()) {
	                    int cantidad = stock.get(producto);
	                    listaStock.append("- Producto: ").append(producto)
	                              .append(", Cantidad: ").append(cantidad).append("\n");
	                }
	                JOptionPane.showMessageDialog(null, listaStock.toString());

	                // Preguntar si desea continuar o salir
	                int continuar = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra gestión?", "Continuar", JOptionPane.YES_NO_OPTION);
	                if (continuar == JOptionPane.NO_OPTION) {
	                    continuarGestion = false;
	                }

	            } else if (decision != null && decision.equalsIgnoreCase("No")) {
	                // Gestionar el stock
	                String geStock = JOptionPane.showInputDialog("¿Desea gestionar el stock? (SI/NO)");
	                if (geStock != null && geStock.equalsIgnoreCase("si")) {
	                    String producto = JOptionPane.showInputDialog("Ingresa el artículo que deseas añadir");
	                    String cantStr = JOptionPane.showInputDialog("Ingresa la cantidad de artículos que añadirás");
	                    try {
	                        int cant = Integer.parseInt(cantStr);
	                        stock.put(producto, stock.getOrDefault(producto, 0) + cant);
	                        JOptionPane.showMessageDialog(null, "Has añadido al Stock " + producto + " con una cantidad de: " + cant + " unidades");
	                        StringBuilder listaActualizada = new StringBuilder("Lista actualizada de productos:\n");
	                        for (String key : stock.keySet()) {
	                            listaActualizada.append("- Producto: ").append(key)
	                                            .append(", Cantidad: ").append(stock.get(key)).append("\n");
	                    } 
	                        JOptionPane.showMessageDialog(null, listaActualizada.toString());
	                    }catch (NumberFormatException e) {
	                        JOptionPane.showMessageDialog(null, "Por favor, ingresa un número válido.");
	                    }
	                }

	                // Preguntar si desea salir después de gestionar el stock
	                int salir = JOptionPane.showConfirmDialog(null, "¿Desea salir de la aplicación?", "Salir", JOptionPane.YES_NO_OPTION);
	                if (salir == JOptionPane.YES_OPTION) {
	                    continuarGestion = false;
	                }

	            } else {
	                // Manejar opción de salida
	                int salir = JOptionPane.showConfirmDialog(null, "¿Desea salir de la aplicación?", "Salir", JOptionPane.YES_NO_OPTION);
	                if (salir == JOptionPane.YES_OPTION) {
	                    JOptionPane.showMessageDialog(null, "Gracias por usar la aplicación. ¡Hasta pronto!");
	                    System.exit(0);
	                }
	            }
	        }
	    }
	}
	

