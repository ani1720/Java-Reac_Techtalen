package UD05FlujoDatos;

public class NotasCondicionalesUD5App {

	public static void main(String[] args) {
		// Variables
		double nota = 7.5;
		String mensaje = "";

		// Condiciones
		if (nota >= 0 && nota < 5) {
			mensaje = "Suspendido";
		} else if (nota >= 5 && nota < 6) {
			mensaje = "Aprobado";
		} else if (nota >= 6 && nota < 7) {
			mensaje = "Bien";
		} else if (nota >= 7 && nota < 9) {
			mensaje = "Notable";
		} else if (nota >= 9 && nota <= 10) {
			mensaje = "Sobresaliente";
		} else {
			mensaje = "Nota no válida";
		}

		// Salida
		System.out.println("La nota " + nota + " es " + mensaje);	
	}

}
