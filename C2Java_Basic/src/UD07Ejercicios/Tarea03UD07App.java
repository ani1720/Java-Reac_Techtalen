package UD07Ejercicios;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Tarea03UD07App {
		public static void main(String[] args) {
				
				}
		private static void mostrarStock(HashMap<String, Integer> stock) {
		//	HashMap<String, Integer> stock = new HashMap<>();
			
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
private static void gestionStock (HashMap<String,Double> stock) {
	String decision = JOptionPane.showInputDialog("¿Desea ver el stock disponible? (SI/NO)");
    if (decision.equalsIgnoreCase("Si")) {
        for (String producto : stock.keySet()) {
            double cant = stock.get(producto);
            // Process the stock quantity as needed
        }
    } else if (decision.equalsIgnoreCase("No")) {
        for (String producto : stock.keySet()) {
            String geStock = JOptionPane.showInputDialog("¿Desea gestionar el stock? (SI/NO)");
            // Process the stock management as needed
        }
    }
}
}
		
		
	


