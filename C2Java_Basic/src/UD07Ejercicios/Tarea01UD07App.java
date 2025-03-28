package UD07Ejercicios;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Tarea01UD07App {

    public static void main(String[] args) {
    	//Inicializamos el scanner
        Scanner sc = new Scanner(System.in);
        // Creamos un HashMap para almacenar las notas de los alumnos
        Map<String, ArrayList<Double>> notasAlumnos = pedirNota(sc);
        Map<String, Double> medianaAlumnos = calcularMedia(notasAlumnos);
        mostrarMediana(medianaAlumnos);
        sc.close();
    }

    public static Map<String, ArrayList<Double>> pedirNota(Scanner scanner) { //Metodo para pedir las notas de los alumnos
        // Crear un HashMap para almacenar las notas de los alumnos
        Map<String, ArrayList<Double>> datos = new HashMap<>();

        System.out.println("¿Cuántos alumnos quiere introducir?");
        int numAlum = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        for (int i = 0; i < numAlum; i++) {
            System.out.println("Introduce el nombre del alumno:");
            String nombre = scanner.nextLine();

            ArrayList<Double> notasAlumno = new ArrayList<>();
            System.out.println("¿Cuántas notas tiene el alumno?");
            int numNotas = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            for (int j = 0; j < numNotas; j++) {
                System.out.println("Introduce la nota " + (j + 1) + ":");
                double nota = scanner.nextDouble();
                notasAlumno.add(nota);
            }
            scanner.nextLine(); // Limpiar el buffer
            datos.put(nombre, notasAlumno);
        }
        return datos;
    }

    public static Map<String, Double> calcularMedia(Map<String, ArrayList<Double>> datos) {
        Map<String, Double> medianas = new HashMap<>();
        for (Entry<String, ArrayList<Double>> entrada : datos.entrySet()) {
            String alumno = entrada.getKey();
            ArrayList<Double> notas = entrada.getValue();

            double suma = 0;
            for (double nota : notas) {
                suma += nota;
            }
            double mediana = suma / notas.size();
            medianas.put(alumno, mediana);
        }
        return medianas;
    }

    public static void mostrarMediana(Map<String, Double> medianas) {
        System.out.println("\n--- Nota mediana de los alumnos ---");
        for (Entry<String, Double> entrada : medianas.entrySet()) {
            System.out.printf("%s -> %.2f%n", entrada.getKey(), entrada.getValue());
        }
    }
}
