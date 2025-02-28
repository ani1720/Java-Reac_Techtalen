package UD05FlujoDatos.Ejercicios;
import javax.swing.JOptionPane;
public class Tarea12UD5App {

	public static void main(String[] args) {
		
		String contrasena= "789456ab" ;
		
		int maxi = 3;
		int contra = 0 ; 
		
		while (maxi < contra) {
				String contraIntro = JOptionPane.showInputDialog("Introduce la contraseña") ;
			if  (contraIntro.equals(contrasena)) {
				JOptionPane.showMessageDialog(null, "Enhorabuena");
				break;
				
			} else {
				contra++; 
				JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
			}
		}
		if (contra == maxi) {
			JOptionPane.showMessageDialog(null, "Has agotado todos los intentos");
		
		}
	}

}
