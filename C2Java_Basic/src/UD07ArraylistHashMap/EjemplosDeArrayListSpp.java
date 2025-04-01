package UD07ArraylistHashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class EjemplosDeArrayListSpp {

	public static void main(String[] args) {
		ArrayList<String> alimentos = new ArrayList<>();
		alimentos.add("Pan");
		alimentos.add("Leche");

		// Crear el HashMap
		HashMap<ArrayList<String>, String> mapa = new HashMap<>();
		mapa.put(alimentos, "Categoría General");

		// Imprimir el valor asociado a la clave ArrayList
		System.out.println("El ArrayList 'alimentos' está asociado con: " + mapa.get(alimentos));
		/*
		 * Funcionamiento:
		 * 
		 * El ArrayList (alimentos) actúa como una clave en el HashMap.
		 * Sin embargo, esto requiere que el ArrayList no sea modificado después de ser
		 * usado como clave, ya que las claves en un HashMap deben ser inmutables o
		 * constantes.
		 * 
		 */
	}

	public static void MapArrayListExample() {
		HashMap<String, ArrayList<String>> categorias = new HashMap<>();

		// Crear ArrayLists para cada categoría
		ArrayList<String> frutas = new ArrayList<>();
		frutas.add("Manzana");
		frutas.add("Banana");

		ArrayList<String> verduras = new ArrayList<>();
		verduras.add("Tomate");
		verduras.add("Zanahoria");

		// Asociar las categorías con los ArrayLists
		categorias.put("Frutas", frutas);
		categorias.put("Verduras", verduras);
		/*
		 * Funcionamiento:
		 * 
		 * Las claves del HashMap ("Frutas" y "Verduras") actúan como categorías. Los
		 * valores son listas (ArrayList) que contienen los elementos correspondientes.F
		 */
		// Imprimir las categorías y sus contenidos
		for (String categoria : categorias.keySet()) {
			System.out.println("Categoría: " + categoria);
			System.out.println("Productos: " + categorias.get(categoria));
		}
	}

	public static void MapToArrayListExample() {
		// Crear un HashMap
		HashMap<String, Double> productos = new HashMap<>();
		productos.put("Mantequilla", 1.50);
		productos.put("Pan de hamburguesa", 0.99);

		// Convertir claves a ArrayList
		ArrayList<String> nombresProductos = new ArrayList<>(productos.keySet());

		// Convertir valores a ArrayList
		ArrayList<Double> preciosProductos = new ArrayList<>(productos.values());

		/*
		 * Funcionamiento:
		 * 
		 * productos.keySet() devuelve las claves (en este caso, los nombres de los
		 * productos). productos.values() devuelve los valores (en este caso, los
		 * precios).
		 */
		// Imprimir las listas
		System.out.println("Nombres de productos: " + nombresProductos);
		System.out.println("Precios de productos: " + preciosProductos);
	}
}
