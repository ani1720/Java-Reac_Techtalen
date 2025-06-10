package com.mastermaind.vista;

import javax.swing.*;

import com.mastermaind.modelo.Feedback;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


public class GamePlayPanel extends JPanel {

	private JLabel playerTurnLabel = new JLabel("Turno de: ");
	private JLabel attemptsLabel = new JLabel("Intentos restantes: ");
	private JButton submitButton = new JButton("Adivinar");
	private JComboBox<String>[] guessSelectors = new JComboBox[4];
	private String playerName;
	private int maxAttempts;
	private static final String[] COLORS = { "Rojo", "Azul", "Verde", "Amarillo", "Naranja", "Violeta" };

	public GamePlayPanel() {
		setLayout(new BorderLayout());
		setBackground(Color.WHITE);

		// Parte superior con info de jugador y turnos
		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.WHITE);
		topPanel.add(playerTurnLabel);
		topPanel.add(attemptsLabel);
		add(topPanel, BorderLayout.NORTH);

		// Parte central con los ComboBox para adivinar colores
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.WHITE);
		for (int i = 0; i < 4; i++) {
			guessSelectors[i] = new JComboBox<>(COLORS);
			centerPanel.add(guessSelectors[i]);
		}
		add(centerPanel, BorderLayout.CENTER);

		// Parte inferior con botón para enviar la jugada
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(Color.WHITE);
		bottomPanel.add(submitButton);
		add(bottomPanel, BorderLayout.SOUTH);
	}

	// Obtener los colores seleccionados como intento del jugador
	public String[] getGuessedColors() {
		String[] guess = new String[4];
		for (int i = 0; i < 4; i++) {
			guess[i] = (String) guessSelectors[i].getSelectedItem();
		}
		return guess;
	}

	// Limpiar selección (opcional)
	public void clearSelection() {
		for (JComboBox<String> box : guessSelectors) {
			box.setSelectedIndex(0);
		}
	}

	public GamePlayPanel(String playerName, int maxAttempts) {
		this.playerName = playerName;
		this.maxAttempts = maxAttempts;
	}

	// Establecer el texto del turno del jugador
	public void setPlayerTurn(String playerName) {
		playerTurnLabel.setText("Turno de: " + playerName);
	}

	// Establecer el número de intentos restantes
	public void setAttempts(int attempts) {
		attemptsLabel.setText("Intentos restantes: " + attempts);
	}

	// Asignar acción personalizada al botón "Adivinar"
	public void setSubmitAction(ActionListener listener) {
		submitButton.addActionListener(listener);
	}

	public void setConfirmAction(ActionListener listener) {
		submitButton.addActionListener(listener);
	}
	   public void addAttempt(ActionEvent attempt, Feedback feedback, int attemptNumber) {
	       // Lógica para registrar el intento, mostrar el feedback y actualizar la interfaz
	   }


}
