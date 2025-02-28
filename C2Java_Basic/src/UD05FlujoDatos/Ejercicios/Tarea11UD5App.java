package UD05FlujoDatos.Ejercicios;

import javax.swing.JOptionPane; // Quiero hacerlo mediante ventanas emergentes asi que importo el JOption

import java.util.Date; //importamos la clase Date

import java.text.SimpleDateFormat; //importamos la clase SimpleDateFormat

public class Tarea11UD5App {

	public static void main(String[] args) {
		String dia = JOptionPane.showInputDialog("Introduce un dia de la semana");
		String nomDia = ""; 
		//Usamos switch para decirle si el ususario introduce el dia le diga si es laborable o no, y si lo hace mal que le diga que no es valido
		switch (dia) {
		case "lunes" :
			JOptionPane.showMessageDialog(null, nomDia += "Laborable") ;
			break; 
		case "martes" :
			JOptionPane.showMessageDialog(null, nomDia += "Laborable") ;
			break;
		case "miercoles" :
			JOptionPane.showMessageDialog(null, nomDia += "Laborable") ;
			break;
		case "jueves" :
			JOptionPane.showMessageDialog(null, nomDia += "Laborable") ;
			break;
		case "viernes" :
			JOptionPane.showMessageDialog(null, nomDia += "Laborable") ;
		case "sabado" :
			JOptionPane.showMessageDialog(null, nomDia += "No laborable") ;
		case "domingo" :
			JOptionPane.showMessageDialog(null, nomDia += "No laborable") ;
	default: 
		JOptionPane.showMessageDialog(null, "Dia no valido");
		}
		
	}

}
