package UD08POOEjecicios;

public class Tarea04Serie {
private String titulo;
private int numTemporadas;
private boolean entregado;
private String genero;
private String creador;

private final int TEMPORADAS_DEF = 3;
private final boolean ENTREGADO_DEF = false;

public Tarea04Serie()  {
	this.titulo = "";
	this.numTemporadas = TEMPORADAS_DEF;
	this.entregado = ENTREGADO_DEF;
	this.genero = "";
	this.creador = "";
}
public Tarea04Serie (String nombre, String director) {
	this();
	this.titulo = nombre;
	this.creador = director;
}
public Tarea04Serie (String nombre, int temporadas,
						String genero, String director) {
	this();
	this.titulo = nombre;
	this.numTemporadas = temporadas;
	this.genero = genero;
	this.creador = director;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public int getNumTemporadas() {
	return numTemporadas;
}
public void setNumTemporadas(int numTemporadas) {
	this.numTemporadas = numTemporadas;
}
public boolean isEntregado() {
	return entregado;
}
public void setEntregado(boolean entregado) {
	this.entregado = entregado;
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
public int getTEMPORADAS_DEF() {
	return TEMPORADAS_DEF;
}
public boolean isENTREGADO_DEF() {
	return ENTREGADO_DEF;
}
}
