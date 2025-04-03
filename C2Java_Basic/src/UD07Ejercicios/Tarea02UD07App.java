package UD07Ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tarea02UD07App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Instanciamos las variables del ArrayList y HashMap
		ArrayList<Double> carrito = new ArrayList<>();
		HashMap<String, Double> productos = inicializarProductos();

		System.out.println("¡Bienvenido a la tienda Compra Bien!");

		gestionarVenta(sc, productos, carrito);

		mostrarResumen(sc, carrito);

	}
	private static HashMap<String, Double> inicializarProductos() {
		HashMap<String, Double> productos = new HashMap<>();

		productos.put("mantequilla", 1.50);
		productos.put("leche de avena", 1.80);
		productos.put("pan de hamburguesa", 0.99);
		productos.put("manzana", 0.65);
		productos.put("hamburguesas", 3.50);
		productos.put("pasta de vegetales", 2.80);
		productos.put("tomate", 1.80);
		productos.put("oregano", 0.60);
		return productos;
	}

	private static void gestionarVenta(Scanner sc, HashMap<String, Double> productos, ArrayList<Double> carrito) {
		boolean continueCompra = true;
		while (continueCompra) {

			System.out.println("Listado de prodcutos disponibles");
			for (Map.Entry<String, Double> entry : productos.entrySet()) {
				System.out.println(entry.getKey() + "- " + entry.getValue() + "€");
			}
			System.out.println("Intoduce que producto deseas comprar");
			String producSelec = sc.nextLine().trim().toLowerCase();
		//	producSelec.equalsIgnoreCase(producSelec);
			if (productos.containsKey(producSelec)) {
				double precio = productos.get(producSelec);
				carrito.add(precio);
				System.out.println("Producto añadido al carrito " + producSelec + " - " + precio + "€");
			} else {
				System.out.println("Prodcuto no encontrado. Intente de nuevo y asegurese de escribir el nombre correctamente.");
			}
			System.out.println("¿Deseas seguir comprando? (Si/No)");
			String respuesta = sc.nextLine();
			if (respuesta.equalsIgnoreCase("No")) {
				continueCompra = false;
			}
		}
	}

	public static double calcularTotal(ArrayList<Double> carrito) {
		double total = 0;
		for (double precio : carrito) {
			total += precio;
		}
		return total;
	}

	private static void mostrarResumen(Scanner sc, ArrayList<Double> carrito) {

		double precioBruto = calcularTotal(carrito);
		System.out.println("¿Que tipo de IVA se aplica? (21% o 4%)");
		double decidirIVA = sc.nextDouble();
		sc.nextLine();
		double IVA= 0;
	
		if (decidirIVA == 21) {
			System.out.println(
					"Has comprado " + carrito.size() + " productos un precio original de:" + precioBruto + " euros");
		IVA = precioBruto *1.21;
		} else if (decidirIVA == 4) {
			System.out.println(
					"Has comprado " + carrito.size() + " productos un precio original de: " + precioBruto + " euros");
			IVA = precioBruto *1.04;
		} else {
			System.out.println("Porcentaje no valido");
		}
		System.out.println("La lista de compras contiene:" + carrito);
		System.out.println("EL precio total con IVA es de: " + IVA);
		System.out.println("Elige el metodo de pago (Tarjeta/Efectivo)");
		String metodoPago = sc.nextLine();
		// double totalConIVA = MostrarResumen(sc, carrito);
		double totalConIVA = precioBruto * (1 + (decidirIVA / 100));

		switch (metodoPago.toLowerCase()) {
		case "tarjeta":
			System.out.println("El precio total con IVA a pagar es de: " + IVA);
			break;
		case "efectivo":
			System.out.println("Introduce la cantidad pagada");
			double cantidadPagada = sc.nextDouble();
			sc.nextLine();
			double cambio = totalConIVA - cantidadPagada;

			if (cantidadPagada > totalConIVA) {
			    System.out.println("El cambio a devolver: €" + cambio);
			} else if (cantidadPagada < totalConIVA) {
			    System.out.println("¡Pago insuficiente! te faltan €" + (totalConIVA - cantidadPagada));
			} else {
			    System.out.println("Pago exacto, no hay cambio que devolver.");
			}
			break;
		default:
			System.out.println("Metodo de pago no valido");
			break;
		}
	}

}
