package com.mastermaind.modelo;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * Lógica principal del juego Mastermind. Se encarga de almacenar la combinación
 * secreta, evaluar los intentos y llevar el control del juego.
 */
public class MastermindModel {

	private List<String> secretCombination; // La combinación que el jugador debe adivinar

	public MastermindModel() {
		this.secretCombination = new ArrayList<>();
	}

	// Establece la combinación secreta elegida por un jugador
	public void setSecretCombination(List<String> combination) {
		this.secretCombination = new ArrayList<>(combination);
	}

	/**
	 * Evalúa un intento del jugador y devuelve el resultado (Feedback).
	 * 
	 * @param attempt La combinación que el jugador intenta adivinar
	 * @return Feedback con cantidad de colores correctos y en posición correcta
	 */

	public Feedback checkAttempt(List<String> attempt) {
		int orderMatches = 0; // Aciertos exactos (color y posición)
		int colorMatches = 0; // Colores correctos pero en posición incorrecta

		// Copias para no modificar las originales
		List<String> secretCopy = new ArrayList<>(secretCombination);
		List<String> attemptCopy = new ArrayList<>(attempt);

		// Paso 1: verificar coincidencias exactas
		for (int i = 0; i < 4; i++) {
			if (attemptCopy.get(i).equals(secretCopy.get(i))) {
				orderMatches++;
				// Marcar como usados para no contarlos dos veces
				secretCopy.set(i, null);
				attemptCopy.set(i, null);
			}
		}

		// Paso 2: verificar coincidencias de color (pero en lugar diferente)
		for (int i = 0; i < 4; i++) {
			String color = attemptCopy.get(i);
			if (color != null && secretCopy.contains(color)) {
				colorMatches++;
				// Marcar como usado
				secretCopy.set(secretCopy.indexOf(color), null);
			}
		}

		return new Feedback(colorMatches, orderMatches);
	}

	// Devuelve la combinación secreta (puede usarse al final del juego para
	// mostrarla)
	public List<String> getSecretCombination() {
		return secretCombination;
	}
}
