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
