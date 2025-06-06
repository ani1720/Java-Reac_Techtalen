package com.mastermaind.modelo;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private String name;
	private int maxAttempts;
	private int attempsUsed;
	private int totalColorMatches;
	private int totalPositionMatches;
	private List<String> secretCombination;
	private List<List<String>> guessHistory;

    public Player(String name, int maxAttemps) {
    	this.name = name;
    	this.maxAttempts = maxAttemps;
    	this.attempsUsed = 0;
    	this.totalColorMatches = 0;
    	this.totalPositionMatches = 0;
    	this.secretCombination = new ArrayList<>();
    	this.guessHistory = new ArrayList<>();
    }
    public String getName() {
    	return name;
    }
    public int getMaxAttempts() {
    	return maxAttempts;
    }
    public int getAttemptsUsed() {
    	return attempsUsed;
    }
    public void incrementAttemptsUsed() {
    	this.attempsUsed++;
    }
    public void setSecretCombination(List<String> combination) {
    	this.secretCombination = new ArrayList<>(combination);
    }
    public List<String> getSecretCombination() {
    	return secretCombination;
    }
    public void addGuess(List<String> guess) {
    	guessHistory.add(new ArrayList<>(guess));
    }
    public List<List<String>> getGuessHistory() {
    	return guessHistory;
    }
    public void addColorMatches(int matches) {
    	this.totalColorMatches += matches;
    } 
    public void addPisitionMatches(int matches) {
    	this.totalPositionMatches += matches;
    }
    public int getTotalPositionMatches() {
    	return totalPositionMatches;
    }
    public boolean hasAttemptsLeft() {
    	return attempsUsed < maxAttempts;
    }
    public int getTotalColorMatches() {
    	return totalColorMatches;
    }
 
    
}

