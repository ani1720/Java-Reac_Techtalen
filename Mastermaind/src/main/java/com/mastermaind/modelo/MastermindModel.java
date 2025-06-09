package com.mastermaind.modelo;

import java.util.ArrayList;
import java.util.List;

public class MastermindModel {
	private List<String> secretCombination;
	private int masAttempts;
	private int currentAttemps;
	private int correctoColors;
	private int correctoPositions;
	
	public MastermindModel(List<String> secretCombination, int maxAttempts) {
		this.secretCombination = new ArrayList<>(secretCombination);
		this.masAttempts = masAttempts;
		this.currentAttemps = 0;
		this.correctoColors = 0;
		this.correctoPositions = 0;
		
	}
	public MastermindModel(Player player1, Player player2, int attempts) {
		// TODO Auto-generated constructor stub
	}
	public boolean hasAttemptsLeft() {
		return currentAttemps < masAttempts;
	}
	public Feedback checkGuess(List<String> guess) {
		currentAttemps++;
		
		int colorMatches= 0;
		int positionMatches = 0;
		
		List<String> secretCopy = new ArrayList<>(secretCombination);
		List<String> guessCopy = new ArrayList<>(guess);
		
		//Contar aciertos exactos (posicion y color
		for (int i = 0; i < 4; i++) {
			if (guessCopy.get(i).equals(secretCopy.get(i))) {
				positionMatches++;
				secretCopy.set(i,  null);
				guessCopy.set(i,  null);
			}
		}
		
		for (int i = 0; i < 4; i++) {
			if (guessCopy.get(i) != null && secretCopy.contains(guessCopy.get(i)));
			colorMatches++;
			secretCopy.set(secretCopy.indexOf(guessCopy.get(i)), null);
		}
	 
	this.correctoColors = colorMatches;
	this.correctoPositions = positionMatches;

	return new Feedback(colorMatches, positionMatches);
}
	public int getCorrectoColors() {
		return correctoColors;
	}
	public int getCorrectoPositions() {
		return correctoPositions;
	}
		public boolean isWin() {
			return correctoPositions == 4;
		}
		public int getCurrentAttempts() {
			return currentAttemps;
	}
}