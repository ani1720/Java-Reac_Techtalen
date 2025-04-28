package UD09Ejercicios.Tarea02;

public class VideoJuego implements Entregable {

	// atributos
	protected String titulo;
	protected int horasEstimadas;
	protected boolean entregado;
	protected String genero;
	protected String compania;

	// contructores
	public VideoJuego() {
		this.titulo = "";
		this.horasEstimadas = HORAS_EST_BASE;
		this.entregado = ENTREGADO_BASE;
		this.genero = "";
		this.compania = "";
	}

	public VideoJuego(String titulo, int horasEstimadas) {
		this();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}

	public VideoJuego(String titulo, int horasEstimadas, String genero, String compania) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compania = compania;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	@Override
	public void entregar() {
		this.entregado = true;
	}

	public String toString() {
		return "VideoJuego {" + titulo + '\'' + ", Horas de Juego: " + horasEstimadas + ", Entregado: " + entregado
				+ ", Genero: ' " + genero + '\'' + ", Compañia: '" + compania + '\'' + '}';
	}

	@Override
	public void devolver() {
		this.entregado = false;
	
		// System.out.println("El videojuego " + this.titulo + " ha sido devuelto");

	}

	@Override
	public boolean isEntregado() {
		if (this.entregado) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String compareTo(Object a) {
		if (a instanceof VideoJuego) {
			VideoJuego v = (VideoJuego) a;
			if (this.horasEstimadas > v.horasEstimadas) {
				return this.titulo + " tiene mas horas estimadas que " + v.titulo;
			} else if (this.horasEstimadas < v.horasEstimadas) {
				return this.titulo + " tiene mas horas estimadas que " + this.titulo;
			} else {
				return this.titulo + " y " + v.titulo + " tienen las mismas horas estimadas.";
			}
		} else {
			throw new IllegalArgumentException("El objeto no es tipo VideoJuego");
		}
	}
}
