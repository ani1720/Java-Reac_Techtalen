package UD09Ejercicios.Tarea02;

public class OcioApp {

	public static void main(String[] args) {

		Serie[] serie = new Serie[5];
		VideoJuego[] videojuegos = new VideoJuego[5];

		serie[0] = new Serie("Mi adorable Demonio", 1, "Romance", "Netflix");
		serie[1] = new Serie("Pablo Escobar", 3, "Drama", "Caracol International");
		serie[2] = new Serie("Juego del Calamar", 2, "Gore", "Netflix");
		serie[3] = new Serie("La casa de las Flores", "Netflix");
		serie[4] = new Serie("Game of Thrones", "HBO");

		videojuegos[0] = new VideoJuego("Call of Duty", 6);
		videojuegos[1] =  new VideoJuego("Luigi's Mansion 3", 13);
		videojuegos[2] = new VideoJuego("Shadow of the Colossus", 7, "Aventura y Accion", 
										"Sony ComputerEntertainment ");
		videojuegos[3] = new VideoJuego("THe Last of Us", 65, "Accion", "Naugthy Dog");
		videojuegos[4] = new VideoJuego("God of War", 21, "Accion", "Santa Monica Studios");

		videojuegos[2].entregar();
		videojuegos[0].entregar();
		serie[1].entregar();
		serie[4].entregar();
		
		System.out.println(videojuegos[3] + "\n");
		
		int videojEntregados = 0;
		int serieEntregadas = 0;
		
		for (VideoJuego v : videojuegos) {
			if (v.isEntregado()) {
				videojEntregados++;
			}
		}
		for (Serie s : serie) {
			if (s.isEntregado()) {
				serieEntregadas++;
			}
		}
		System.out.println("Videojuegos entregados: " + videojEntregados + "\n");
		System.out.println("Series entregadas: " + serieEntregadas + "\n");
		
		for (int i = 0; i < videojuegos.length; i ++) {
	
		}
		VideoJuego videoMasHoras = videojuegos[0];
		for ( VideoJuego v : videojuegos) {
			if (v.getHorasEstimadas() < videoMasHoras.getHorasEstimadas()) {
				videoMasHoras = v;
			}
		}
		Serie serieMasTem= serie[0];
		for (Serie s : serie) {
			if (s.getTemporadas() < serieMasTem.getTemporadas()) {
				serieMasTem = s;
			}
		}
		System.out.println("Videojuego con mas horas estimadas: " + videoMasHoras + "\n");
		System.out.println("Serie con mas temporadas: " + serieMasTem + "\n");
	}
}