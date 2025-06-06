package com.mastermaind.controlador;

import com.mastermaind.modelo.Player;

import java.util.List;

import com.mastermaind.modelo.Feedback;
import com.mastermaind.modelo.MastermindModel;

public class MastermindController {
	private Player player1;
	private Player player2;
	private MastermindModel currentGame;
	private boolean isPlayer1Turn;
	
	public MastermindController(Player p1, Player p2) {
		this.player1 = p1;
		this.player2 = p2;
		this.isPlayer1Turn = true;
	}
	public void startTurn(List<String> guess) {
		Player guesser = getCurrentGuesser();
		Player defender = getCurrentDefender();
		
		currentGame = new MastermindModel(defender.getSecretCombination(), guesser.getMaxAttempts());
		Feedback feedback = currentGame.checkGuess(guess);
		guesser.incrementAttemptsUsed();
		guesser.addGuess(guess);
		guesser.addColorMatches(feedback.getCorrectoColors());
		guesser.addPisitionMatches(feedback.getCorrectoPositions());
	}
	public Feedback getCurrentFeedback(List<String> guess) {
		return currentGame.checkGuess(guess);
	}
	public boolean isGameWon() {
		return currentGame.isWin();
	}
	public boolean hasAttemptsLeft() {
		return getCurrentGuesser().hasAttemptsLeft();
	} 
	public void switchTurn() {
		isPlayer1Turn = !isPlayer1Turn;
	}

	public Player getCurrentGuesser() {
		return isPlayer1Turn ? player1 : player2;
	}

	public Player getCurrentDefender() {
		return isPlayer1Turn ? player2 : player1;
	}
	public Player determineWinner() {
		int p1Points = player1.getTotalColorMatches()
				+ player1.getTotalPositionMatches() * 2;
				
		int p2Points = player2.getTotalColorMatches()
				+ player2.getTotalPositionMatches() * 2;
		
		if(p1Points > p2Points) {
			return player1;
		}else if (p2Points > p1Points) {
			return player2;	
		}else {
			return null;
		}
	}
}
	