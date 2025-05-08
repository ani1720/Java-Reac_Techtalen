package UD09Ejercicios.Tarea03;

public class Libro {

	protected Long ISBN;
	protected String titulo;
	protected String autor;
	protected int numPaginas;
	
	public Long getISBN() {
		return ISBN;
	}
	public void setISBN(Long iSBN) {
		ISBN = iSBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
public Libro(Long ISBN, String titulo, String autor, int numPaginas) {
	this.ISBN = ISBN;
	this.titulo = titulo;
	this.autor = autor;
	this.numPaginas = numPaginas;
}
	public String toString() {
		return "Libro: " + titulo + "\n" + "Con ISBN: " + ISBN + ", creado por el autor: " 
				+ autor + ", tiene " + numPaginas + " paginas";
	}
	public Libro(Long ISBN, String autor, int numPaginas) {
		this.ISBN = ISBN;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}
}
