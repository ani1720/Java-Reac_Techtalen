package UD08POOEjecicios;

public class Tarea02Password {
 //atributos
	private int longitud;
	private String password;
	
	//contructor 
	public Tarea02Password() {
		this.longitud = 8;
		this.password = "";
	}
	public Tarea02Password(int longitud) {
		this.longitud = longitud;
		this.password = generarPassword(longitud);
	}
	private String generarPassword(int length) {
		String caracter = 
				"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";
		StringBuilder password = new StringBuilder();
		
		for ( int i = 0; i < length; i++) {
			int index = (int) (Math.random() * caracter.length());
			password.append(caracter.charAt(index));
		}
		return password.toString();
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
