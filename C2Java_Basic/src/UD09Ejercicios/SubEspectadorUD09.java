package UD09Ejercicios;

public class SubEspectadorUD09 implements PersonaEmpleable {
	protected String nombrePersona;
	protected int edad;
	protected double dineroPersona;
	
public SubEspectadorUD09(String nombrePersona, int edad, double dineroPersona) {	
	//super(null,0);
	    this.nombrePersona = nombrePersona;
		this.edad = edad;
		this.dineroPersona = dineroPersona;
		}
	
	//@Override
	public String getNombrePersona() {
		return nombrePersona;
	}
	
	//@Override
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}
	
	//@Override
	public int getEdad() {
		return edad;
	}
	
	//@Override
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	public double getDineroPersona() {
		return dineroPersona;
	}
	
	
	public void setDineroPersona(double dineroPersona) {
		this.dineroPersona = dineroPersona;
	}
}
