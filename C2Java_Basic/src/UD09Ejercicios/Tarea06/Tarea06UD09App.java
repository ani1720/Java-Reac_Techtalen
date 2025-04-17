package UD09Ejercicios.Tarea06;

import javax.swing.JOptionPane;

public class Tarea06UD09App {
	public static void main(String[] args) {

		String[] pelicula = { "1.Super Mario Bros. La película", "2.Capitán América: Un nuevo mundo",
				"3.Misión: Imposible 8" };
		int eleccion = JOptionPane.showOptionDialog(null, "Selecciona la pelicula que quieres ver:",
				"Selecciona una Opcion", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, pelicula,
				pelicula[0]);

		SubPeliculasUD09 peliSelec = null;
		switch (eleccion) {
		case 0:
			SubPeliculasUD09 peli1 = new SubPeliculasUD09("Super Mario Bros. La película", 12.99, 92, 7,
					"Aaron Horvath");
			JOptionPane.showMessageDialog(null, "Has seleccionado: " + "Super Mario Bros.\n Dura "
					+ peli1.getDuracionPeli() + " minutos y es para mayores de " + peli1.getEdadMinima() + " años.");
			peli1.comprarEntrada(peli1.getEdadMinima(), peli1.precioEntrada);
			peliSelec = peli1;
			break;
		case 1:
			SubPeliculasUD09 peli2 = new SubPeliculasUD09("Capitán América: Un nuevo mundo", 12.99, 118, 12,
					"Julius Onah");
			JOptionPane.showMessageDialog(null, "Has seleccionado: " + "Capitán América: Un nuevo mundo.\n Dura "
					+ peli2.getDuracionPeli() + " minutos y es para mayores de " + peli2.getEdadMinima() + " años.");
			peli2.comprarEntrada(peli2.getEdadMinima(), peli2.precioEntrada);
			peliSelec = peli2;
			break;
		case 2:
			SubPeliculasUD09 peli3 = new SubPeliculasUD09("Misión: Imposible 8", 12.99, 163, 12,
					"Christopher McQuarrie La película");
			JOptionPane.showMessageDialog(null, "Has seleccionado: " + "Misión: Imposible 8.\n Dura "
					+ peli3.getDuracionPeli() + " minutos y es para mayores de " + peli3.getEdadMinima() + " años.");
			peli3.comprarEntrada(peli3.getEdadMinima(), peli3.precioEntrada);
			peliSelec = peli3;
			break;
		default:
			JOptionPane.showMessageDialog(null, "Nos has seleccionado una pelicula");
			return;
		}
		if (peliSelec != null) {

			SubEspectadorUD09 usuario = new SubEspectadorUD09(null);

			int cantidadBoletos = peliSelec.comprarEntrada(peliSelec.getEdadMinima(), peliSelec.getPrecioEntrada());
			if (cantidadBoletos > 0) {
				SuperClassCine cine = new SuperClassCine();
				cine.elegirAsiento(usuario, cantidadBoletos);
			}
			JOptionPane.showInternalMessageDialog(null, "Gracias por su compra\n" + "Que disfrute su pelicula");
		//	SuperClassCine cine = new SuperClassCine();
		}

	}
}
