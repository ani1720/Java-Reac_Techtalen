package UD09Ejercicios.Tarea02;

public class VideoJuego implements Entregable {

	//atributos
	protected String titulo;
	protected int horasEstimadas;
	protected boolean entregado;
	protected String genero;
	protected String compania;

	//contructores
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
