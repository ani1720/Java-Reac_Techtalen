import java.util.Scanner;
public class UD05ScannerApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("-- Bienvenido a JAVA 21 --");
		System.out.println("Introduce tu nombre");
		
		String nombre = sc.nextLine();
		sc.close();
		
		System.out.println("Hola " + nombre.toUpperCase());

	}

}
