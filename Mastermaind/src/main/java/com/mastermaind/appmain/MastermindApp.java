package com.mastermaind.appmain;

import java.awt.Color;

import com.mastermaind.controlador.MastermidController;
import com.mastermaind.modelo.Juego;
import com.mastermaind.modelo.Jugador;
import com.mastermaind.vista.VentanaInicio;
import com.mastermaind.vista.VentanaJuego;

import db.BaseDatos;

public class MastermindApp {
	 public static void main(String[] args) {
	        // Crear instancia de la ventana inicial (vista)
	        VentanaInicio ventanaInicio = new VentanaInicio();
	        ventanaInicio.setVisible(true);
	        // Crear instancia de la base de datos (esto establecerá la conexión)
	        BaseDatos bd = new BaseDatos();
	        // Crear el controlador, pasando la vista inicial y la base de datos
	        MastermidController controlador = new MastermidController(ventanaInicio, bd);

	        // Nota: el controlador manejará el resto del flujo de la aplicación.
	        // Cuando la aplicación termine, podríamos invocar bd.cerrarConexion() para liberar recursos.
	    }
	}