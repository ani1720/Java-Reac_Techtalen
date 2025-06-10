package com.mastermaind.vista;

import javax.swing.*;
import java.awt.*;

public class Victory extends JPanel {

    private JLabel victoryMessage = new JLabel("¡Felicidades! Has adivinado la combinación.");
    private JLabel winnerNameLabel = new JLabel("Ganador: ");
    private String winnerName;
    public Victory(String winnerName) {
    	this.winnerName = winnerName;
    }
    public Victory() {
        setLayout(new GridLayout(2, 1));
        setBackground(Color.WHITE);

        victoryMessage.setFont(new Font("Arial", Font.BOLD, 18));
        victoryMessage.setHorizontalAlignment(SwingConstants.CENTER);
        winnerNameLabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(victoryMessage);
        add(winnerNameLabel);
    }

    // Establece el nombre del jugador ganador
    public void setWinner(String playerName) {
        winnerNameLabel.setText("Ganador: " + playerName);
    }
}
