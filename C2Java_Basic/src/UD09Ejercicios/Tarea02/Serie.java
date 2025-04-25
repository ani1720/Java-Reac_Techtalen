package UD09Ejercicios.Tarea02;

public class Serie implements Entregable {
	// atributos
	protected String titulo;
	protected int temporadas;
	protected boolean entregado;
	protected String genero;
	protected String creador;

	// constructores
	public Serie() {
		this.titulo = "";
		this.temporadas = TEMPORADAS_BASE;
		this.entregado = ENTREGADO_BASE;
		this.genero = "";
		this.creador = "";
	}

	public Serie(String titulo, String creador) {
		this();
		this.titulo = titulo;
		this.creador = creador;
	}

	public Serie(String titulo, int temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.genero = genero;
		this.creador = creador;
	}

	// Getters y Setters

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public int getTemporadas_Base() {
		return temporadas;
	}

	// Métodos complementarios

	@Override
	public String toString() {
		return "Serie {" + titulo + '\'' + ", Temporadas: " + temporadas + "Entregado: " + entregado + "Genero: ' "
				+ genero + '\'' + ", Creador: '" + creador + '\'' + '}';
	}

	@Override
	public void entregar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEntregado() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String compareTo(Object a) {
		// TODO Auto-generated method stub
		return null;
	}
}
