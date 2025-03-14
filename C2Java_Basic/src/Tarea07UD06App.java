import javax.swing.JOptionPane;

public class Tarea07UD06App {

	public static void main(String[] args) {
		String euro = "";
		JOptionPane.showConfirmDialog(null, "Bienvenido al conversor de monedas");
		int valor = 0;
		
		valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a convertir "));
	
	}
	private static double dolar (int valor) {
		return valor *= 1.09 ;
	}
	private static double libra (int valor) {
		return valor *= 0.84 ;
	}
	public static double yenes (int valor) {
		return valor *= 129.852 ;
	}
}
