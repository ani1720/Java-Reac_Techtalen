package UD05FlujoDatos;
import javax.swing.JOptionPane;
public class PruebaTarea10UD5App {

		    public static void main(String[] args) {
		        // Solicitar el número de ventas a introducir
		        String inputNumVentas = JOptionPane.showInputDialog(null, "Por favor, ingresa el número de ventas a introducir:");
		        int numVentas = Integer.parseInt(inputNumVentas);

		        // Inicializar la variable para la suma total de ventas
		        double sumaTotal = 0;

		        // Solicitar tantas ventas como se haya indicado y sumarlas
		        for (int i = 1; i <= numVentas; i++) {
		            String inputVenta = JOptionPane.showInputDialog(null, "Ingresa el valor de la venta " + i + ":");
		            double venta = Double.parseDouble(inputVenta);
		            sumaTotal += venta;
		        }

		        // Mostrar la suma total de todas las ventas
		        JOptionPane.showMessageDialog(null, "La suma total de todas las ventas es: " + sumaTotal);
		    }
		}