package com.mastermaind.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;
public class GamePlayPanel extends JPanel{

		private final JLabel turnPlayLabel = new JLabel("Turno de: ");
		private final JLabel attemptsLabel = new JLabel("Intentos restantes: ");
		private final JComboBox<String>[] guessSelectors= new JComboBox[4];
		private final JButton guessButton = new JButton("Adivinar");
		private final JTextArea feedbackArea = new JTextArea(10, 30);
		
		private static final String[] COLORS = {"Rojo", "Azul", "Verde", "Amarillo", "Naranja", "Morado"};

		public GamePlayPanel() {
			setLayout(new BorderLayout());
			setBackground(Color.WHITE);
			
			//Panel superior con datos del jugador
			
			JPanel topPanel = new JPanel(new GridLayout(2, 1));
			topPanel.setBackground(Color.WHITE);
			turnPlayLabel.setFont(new Font("Arial", Font.BOLD, 16));
			attemptsLabel.setFont(new Font("Arial", Font.PLAIN, 14));
			topPanel.add(turnPlayLabel);
			topPanel.add(attemptsLabel);
			add(topPanel, BorderLayout.NORTH);
			
			//Panel central de seleccion de colores
			JPanel centerPanel = new JPanel(new FlowLayout());
			centerPanel.setBackground(Color.WHITE);
			
			   for (int i = 0; i < 4; i++) {
				   guessSelectors[i] = new JComboBox<>(COLORS);
				   centerPanel.add(guessSelectors[i]);  
			   }
			   add(centerPanel, BorderLayout.CENTER);
		
			 //Boton para enviar suposicion
			   JPanel buttonPanel = new JPanel();
			   buttonPanel.setBackground(Color.WHITE);
			   buttonPanel.add(guessButton);
			   add(buttonPanel, BorderLayout.SOUTH);
			   
			   //Area de Feedback
			   feedbackArea.setEditable(false);
			   feedbackArea.setFont(new Font("Monospaced", Font.PLAIN,12));
			   feedbackArea.setBorder(BorderFactory.createTitledBorder("Historial de intentos"));
			   JScrollPane scrollPane = new JScrollPane(feedbackArea);
			   add(scrollPane, BorderLayout.EAST);
		}
		public void setturnPlay(String playName) {
			turnPlayLabel.setText("Turno de: " + playName);
		}
		public void setAttemptsLeft(int attempts) {
			attemptsLabel.setText("Intentos restantes: " + attempts);
		}
		public String [] getCurrentGuess() {
			String[] guess = new String[4];
			    for (int i = 0; i < 4; i++) {
			    	guess[i] = (String) guessSelectors[i].getSelectedItem();
			    }
			    return guess;
		}
		public void setGuessAction(ActionListener listener) {
			guessButton.addActionListener(listener);
		}
		public void resetSelectors() {
			for (JComboBox<String> selector : guessSelectors) {
				selector.setSelectedIndex(0);
			}
		}
		
}
