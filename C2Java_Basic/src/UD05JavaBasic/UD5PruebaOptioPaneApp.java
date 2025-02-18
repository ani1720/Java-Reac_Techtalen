package UD05JavaBasic;
import javax.swing.JOptionPane;
public class UD5PruebaOptioPaneApp {

	public static void main(String[] args) {
		
		String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
		
		JOptionPane.showMessageDialog(null, "Bien, tu nombre es "+ nombre);
		
	}

}
