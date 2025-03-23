package UD07Ejercicios;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Tarea04UD07App {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	     
	        ArrayList<Double> flujos = new ArrayList<>();
	    
	        HashMap<String, Integer> productos = new HashMap<>();
	        
	      
	        productos.put("Leche", 2);
	        productos.put("Azucar", 4);
	        productos.put("Bocadillo", 3);
	        productos.put("Atun", 5);
	        productos.put("Macarrones", 3);
	        productos.put("Carne", 8);
	        productos.put("Cereales", 10);
	        productos.put("Cuchara", 3);
	        productos.put("Agua", 1);

	        while (true) {
	          
	            System.out.println("Que hacer: ");
	            System.out.println("1. Gestionar ventas");
	            System.out.println("2. Ver y gestionar stock");
	            System.out.println("3. Salir");
	            System.out.print("Elige una opción (1/2/3): ");
	            int opcion = sc.nextInt();
	            sc.nextLine(); 

	            switch (opcion) {
	                case 1:
	                    flujos = gestionarVentas(flujos);
	                    break;
	                case 2:
	                    gestionarStock(productos);
	                    break;
	                case 3:
	                    System.out.println("Adios.");
	                    return;
	                default:
	                    System.out.println("Invalido.");
	                    sc.close();
	            }
	        }
	     }

	    
	    public static ArrayList<Double> gestionarVentas(ArrayList<Double> flujo) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Ventas para registrar: ");
	        int ventas = sc.nextInt();

	        double sum = 0;

	        for (int i = 1; i <= ventas; i++) {
	            System.out.print("Introduce el precio para la venta " + i + ": ");
	            double precioVenta = sc.nextDouble();
	            flujo.add(precioVenta);
	            sum += precioVenta;
	            sc.close();
	        }

	        System.out.println("Porcentaje de IVA: [4%/21%]");
	        int decidir = sc.nextInt();

	        if (decidir == 21) {
	            System.out.println("Has comprado " + ventas + " productos por un precio original de: " + sum + " euros.");
	            sum *= 1.21;  
	            System.out.println("El precio final con IVA del 21% es de: " + sum);
	        } else if (decidir == 4) {
	            System.out.println("Has comprado " + ventas + " productos por un precio original de: " + sum + " euros.");
	            sum *= 1.04;  
	            System.out.println("El precio final con IVA del 4% es de: " + sum);
	        } else {
	            System.out.println("Porcentaje no válido.");
	        }

	        for (Double precio : flujo) {
	            System.out.println("La lista de ventas contiene: " + precio + " euros.");
	            sc.close();
	        }

	        return flujo;
	    }

	    public static void gestionarStock(HashMap<String, Integer> productos) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("¿Deseas ver los artículos en tu lista? [Ver/No]");
	        String ver = sc.nextLine();

	        if (ver.equalsIgnoreCase("Ver")) {
	            for (String producto : productos.keySet()) {
	                int cantidad = productos.get(producto);
	                System.out.println(producto + " - Cantidad: " + cantidad);
	            }
	        } else if (ver.equalsIgnoreCase("No")) {
	            System.out.println("Qué artículo quieres añadir? ");
	            String articulo = sc.nextLine();

	            System.out.println("Qué cantidad de artículos deseas agregar? ");
	            int cantidad = sc.nextInt();

	            productos.put(articulo, productos.getOrDefault(articulo, 0) + cantidad);
	            System.out.println("Has añadido " + cantidad + " unidades de " + articulo + " a tu lista de productos.");
	            sc.nextLine(); 

	            System.out.println("Quieres ver tu lista actualizada? [Si/No]");
	            String respuesta = sc.nextLine();

	            if (respuesta.equalsIgnoreCase("Si")) {
	                for (String producto : productos.keySet()) {
	                    System.out.println("Tu lista contiene: " + producto + " y su cantidad: " + productos.get(producto));
	                }
	            } else {
	                System.out.println("Gracias por actualizar el stock.");
	            }
	        } else {
	            System.out.println("Invalido.");
	            sc.close();
	        }
	    }
	}