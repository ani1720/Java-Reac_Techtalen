package UD09Ejercicios.Tarea02;

public interface Entregable {
	
	// Métodos abstractos
	public void entregar();
	public boolean devolver();
	public boolean isEntregado();
	public String compareTo(Object a);
	
	final boolean ENTREGADO_BASE = false;
	final int HORAS_EST_BASE = 10;
	final int TEMPORADAS_BASE = 3;

	
	
}
