package UD09Ejercicios.Tarea02;

public class OcioApp {

	public static void main(String[] args) {

		Serie[] serie = new Serie[5];

		serie[0] = new Serie("Mi adorable Demonio", 1, "Romance", "Netflix");
		serie[1] = new Serie("Pablo Escobar", 5, "Drama", "Caracol International");
		serie[2] = new Serie("Juego del Calamar", 2, "Gore", "Netflix");
		serie[3] = new Serie("La casa de las Flores", "Netflix");
		serie[4] = new Serie("Game of Thrones", "HBO");

		VideoJuego[] videojuegos = new VideoJuego[5];
		
		videojuegos[0] = new VideoJuego("Call of Duty", 6);
		videojuegos[1] =  new VideoJuego("Luigi's Mansion 3", 13);
		videojuegos[2] = new VideoJuego("Shadow of the Colossus", 7, "Aventura y Accion", 
										"Sony ComputerEntertainment ");
		videojuegos[3] = new VideoJuego("THe Last of Us", 65, "Accion", "Naugthy Dog");
		videojuegos[4] = new VideoJuego("God of War", 21, "Accion", "Santa Monica Studios");

//		for (VideoJuego e : videojuegos) {
//			e.entregar();
//		}
//		for (Serie s : serie) {
//			s.entregar();
//		}
	
		
		videojuegos[2].entregar();
		videojuegos[0].entregar();
		serie[1].entregar();
		serie[4].entregar();
		
		//System.out.println(videojuegos[3] + "\n");
		
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
		
		
	
		VideoJuego videoMasHoras = videojuegos[0];
	
		
		for ( VideoJuego a : videojuegos) {
			if (a.getHorasEstimadas() > videoMasHoras.getHorasEstimadas()) {
				videoMasHoras = a;
			}
		}
		System.out.println("Videojuego con mas horas estimadas: " + "\n" + videoMasHoras + "\n");
		
		Serie serieMasTem= serie[4];
		for (Serie b : serie) {
			if (b.getTemporadas() > serieMasTem.getTemporadas()) {
				serieMasTem = b;
			}
		}
		System.out.println("Serie con mas temporadas: " + "\n" + serieMasTem + "\n");
	
		videojuegos[2].devolver();
		videojuegos[0].devolver();
		serie[1].devolver();
		serie[4].devolver();
		
		int videojDevueltos = 0;
		int serieDevueltas = 0;
		
		for (VideoJuego v : videojuegos) {
			if (v.entregado) {
				videojDevueltos++;
			}
			for (Serie s : serie) {
				if (s.entregado) {
					serieDevueltas++;
				}
			}
		}
		System.out.println("Videojuegos devueltos: " + videojDevueltos + "\n");
		
		System.out.println("Series devueltas: " + serieDevueltas + "\n");
	}
}