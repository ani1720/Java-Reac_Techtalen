package UD09Ejercicios;

import javax.swing.JOptionPane;

public class Tarea06UD09App  {
	public static void main(String[] args) {
		
		String[] pelicula =  {"1.Super Mario Bros. La película", "2.Capitán América: Un nuevo mundo", "3.Misión: Imposible 8"} ;
		int eleccion = JOptionPane.showOptionDialog(null, "Selecciona la pelicula que quieres ver:", "Selecciona una Opcion", 
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, pelicula, pelicula[0]);

		SubPeliculasUD09 datosP = new SubPeliculasUD09 (Aaron Horvath, 2, 7); 
		
		switch (eleccion) {
		case 0 : 
			JOptionPane.showMessageDialog(null, "Has seleccionado: " + "1.Super Mario Bros. La película" + "\n" +   );
			break;
		case 1 :
			JOptionPane.showMessageDialog(null, "Has seleccionado: " + "2.Capitán América: Un nuevo mundo");
			break;
		case 2 : 
			JOptionPane.showMessageDialog(null, "Has seleccionado: " + "3.Misión: Imposible 8");
			break;
			default: 
				JOptionPane.showMessageDialog(null, "Nos has seleccionado una pelicula");
				break;
		}
	//	SuperClassCine cine = new SuperClassCine(pelicula, precioEntrada);
	}
	

	}

