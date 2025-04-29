package UD09Ejercicios.Tarea03;

public class LibroApp {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro(9788418359835L, "Vampire Academy", "Richelle Mead", 384);
		Libro libro2 = new Libro(9788483658376L, "Beautiful Disaster", "Jamie McGuire", 432);
		
		System.out.println(libro1.toString() + "\n");
		System.out.println(libro2.toString() + "\n");
		
		if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
			System.out.println("El libro " + libro1.getTitulo() + " tiene mas paginas que "
								+ libro2.getTitulo());
		}else {
			System.out.println("El libro " + libro2.titulo + " tiene mas paginas que "
					            + libro1.getTitulo());
		}
	}

}
