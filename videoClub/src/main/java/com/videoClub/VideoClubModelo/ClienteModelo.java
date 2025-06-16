package com.videoClub.VideoClubModelo;

public class ClienteModelo {
 private int id;
 private String nombre;
 private String apellido;

 
 public ClienteModelo(int id, String nombre, String apellido) {
	 this.id = id;
	 this.nombre = nombre;
	 this.apellido = apellido;
 }
 public ClienteModelo(String nombre, String apellido) { 
	 this.nombre = nombre;
	  this.apellido = apellido;
 }

public int getId() {
	return id;
}
public String getNombre() {
	return nombre;
}
public String getApellido() {
	return apellido;
}
}
