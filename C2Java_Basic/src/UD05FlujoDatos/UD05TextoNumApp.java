package UD05FlujoDatos;
import javax.swing.JOptionPane;
public class UD05TextoNumApp {

	public static void main(String[] args) {
	
			final double IVA=0.21 ;
			String texto_num=JOptionPane.showInputDialog("Introduce el precio del producto") ;
			
			int precio=Integer.parseInt(texto_num) ;
			JOptionPane.showMessageDialog(null, "El producto tiene un precio de "+precio+" y su precio final es de "+(precio+(precio*IVA)));
			
	}

}
