import javax.swing.JOptionPane;

public class UD05JOptionPaneApp {

	public static void main(String[] args) {

		int precioProducto = 300;
		final double IVA = 0.21;

		JOptionPane.showMessageDialog(null,
						"El precio del producto, incluido el IVA es " + 
						(precioProducto + (precioProducto * IVA)));

	}

}