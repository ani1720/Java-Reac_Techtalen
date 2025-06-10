package com.mastermaind.modelo;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Juego {
	  private Jugador jugador1;               // codificador (pone la combinación secreta)
	    private Jugador jugador2;               // descifrador (intenta adivinar)
	    private String[] combinacionSecreta;    // los 4 colores de la combinación secreta
	    private int intentosMaximos;
	    private int intentosRealizados;
	    private List<Intento> historialIntentos; // lista de intentos realizados

	    public Juego(Jugador jugador1, Jugador jugador2, int intentosMaximos) {
	        this.jugador1 = jugador1;
	        this.jugador2 = jugador2;
	        this.intentosMaximos = intentosMaximos;
	        this.intentosRealizados = 0;
	        this.historialIntentos = new ArrayList<>();
	    }

	    // Método para que Jugador1 fije la combinación secreta.
	    public void setCombinacionSecreta(String[] combinacionSecreta) {
	        // Copiamos la combinación de 4 colores.
	        this.combinacionSecreta = Arrays.copyOf(combinacionSecreta, combinacionSecreta.length);
	    }

	    // Lógica para procesar un intento de adivinanza del Jugador2.
	    // Devuelve un objeto Intento con los resultados de aciertos.
	    public Intento procesarIntento(String[] combinacionIntentada) {
	        intentosRealizados++;
	        // Calcular aciertos de posición y de color:
	        int aciertosPos = 0;
	        int aciertosColor = 0;
	        boolean[] secretoUsado = new boolean[combinacionSecreta.length];
	        boolean[] intentoUsado = new boolean[combinacionSecreta.length];

	        // Primero, contar aciertos de posición (colores y posiciones exactas).
	        for (int i = 0; i < combinacionSecreta.length; i++) {
	            if (combinacionIntentada[i].equalsIgnoreCase(combinacionSecreta[i])) {
	                aciertosPos++;
	                secretoUsado[i] = true;
	                intentoUsado[i] = true;
	            }
	        }
	        // Luego, contar aciertos de color (colores correctos en otra posición).
	        for (int i = 0; i < combinacionSecreta.length; i++) {
	            if (!intentoUsado[i]) {  // solo para posiciones no ya acertadas exactamente
	                for (int j = 0; j < combinacionSecreta.length; j++) {
	                    if (!secretoUsado[j] && !intentoUsado[i] 
	                            && combinacionIntentada[i].equalsIgnoreCase(combinacionSecreta[j])) {
	                        aciertosColor++;
	                        secretoUsado[j] = true;
	                        intentoUsado[i] = true;
	                        break;
	                    }
	                }
	            }
	        }
	        // Crear objeto Intento con los resultados y guardarlo en el historial.
	        Intento intento = new Intento(combinacionIntentada, aciertosPos, aciertosColor);
	        historialIntentos.add(intento);
	        return intento;
	    }

	    // Método para comprobar si el juego ha terminado.
	    public boolean isJuegoTerminado() {
	        // Termina si adivinaron (aciertosPos == 4 en el último intento) o se agotaron los intentos.
	        if (historialIntentos.isEmpty()) {
	            return false;
	        }
	        Intento ultimo = historialIntentos.get(historialIntentos.size() - 1);
	        boolean adivinado = (ultimo.getAciertosPosicion() == 4);
	        boolean agotados = (intentosRealizados >= intentosMaximos);
	        return adivinado || agotados;
	    }

	    // Determinar el ganador de la partida.
	    public Jugador getGanador() {
	        // Si el último intento tuvo 4 aciertos de posición, gana jugador2 (descifrador), 
	        // de lo contrario (se agotaron intentos) gana jugador1 (codificador).
	        if (!historialIntentos.isEmpty()) {
	            Intento ultimo = historialIntentos.get(historialIntentos.size() - 1);
	            if (ultimo.getAciertosPosicion() == 4) {
	                return jugador2;
	            }
	        }
	        // Si llegó aquí, significa que no adivinó dentro de los intentos permitidos.
	        return jugador1;
	    }

	    // Getters útiles...
	    public Jugador getJugador1() { return jugador1; }
	    public Jugador getJugador2() { return jugador2; }
	    public int getIntentosRealizados() { return intentosRealizados; }
	    public int getIntentosMaximos() { return intentosMaximos; }
	    public List<Intento> getHistorialIntentos() { return historialIntentos; }
	}
