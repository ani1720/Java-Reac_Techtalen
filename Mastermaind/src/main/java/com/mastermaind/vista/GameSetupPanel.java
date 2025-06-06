package com.mastermaind.vista;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GameSetupPanel extends JPanel {

	private JTextField player1NameField;
	private JTextField player2NameField;
	private JSpinner attemptsSpinner;
	private JButton continueButton;
	
	public GameSetupPanel() {
	   setLayout(new GridBagLayout());
	   GridBagConstraints gbc = new GridBagConstraints();
	   setBackground(Color.WHITE);
	   
	   JLabel title = new JLabel("Configuracion del Juego Mastermind");
	   title.setFont(new Font("Arial", Font.BOLD , 18));
	   gbc.gridwidth = 2;
	   gbc.insets = new Insets(10, 10, 10, 10);
	   gbc.gridx = 0;
	   gbc.gridy = 0;
	   add(title, gbc);
	   
	   gbc.gridwidth = 1;
	   gbc.gridy++;
	   add(new JLabel("Nombre del jugador 1:"), gbc);
	   
	   gbc.gridx = 0;
	   gbc.gridy++;
	   add(new JLabel("Intentos por jugador:"), gbc);
	   
	   gbc.gridx = 1;
	   attemptsSpinner = new JSpinner(new SpinnerNumberModel(5, 1, 20, 1));
	   add(attemptsSpinner, gbc);
	   
	   gbc.gridx = 0;
	   gbc.gridy++;
	   gbc.gridwidth = 2;
	   continueButton = new JButton("Continuar");
	   add(continueButton, gbc);
	}
	public String getPlayer1Name() {
		return player1NameField.getText();
	}
	public String getPlayer2Nane() {
		return player2NameField.getText();
	}
	public int getAttempts() {
		return (Integer) attemptsSpinner.getValue();
	}
	public void setContinueAction(ActionListener listener) {
		continueButton.addActionListener(listener);
	}
}
