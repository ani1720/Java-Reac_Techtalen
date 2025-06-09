package com.mastermaind.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

public class Victory  extends JPanel{
	private JLabel winnerLabel;
    private JLabel gifLabel;
    private JButton restartButton;
    private JButton exitButton;

    public Victory() {
    	setLayout(new BorderLayout());
    	setBackground(Color.WHITE);
    	
    	winnerLabel = new JLabel("Felicidades, Jugador" + getName() + " ha ganado", SwingConstants.CENTER);
    	winnerLabel.setFont(new Font("Arial", Font.BOLD, 22));
    	winnerLabel.setForeground(new Color(0 , 128, 0));
    	add(winnerLabel, BorderLayout.NORTH);
    	
    	//Cargar gif
    	gifLabel = new JLabel();
    	gifLabel.setHorizontalAlignment(SwingConstants.CENTER);
    	   
    	     try {
    	    	 ImageIcon gif = new ImageIcon(getClass().getClassLoader().getResource("congratulatin.gif"));
    	    	 gifLabel.setIcon(gif);
    	     } catch (Exception e) {
    	    	 gifLabel.setText("🎉 ¡Felicidades! 🎉");
    	    	 gifLabel.setFont(new Font("Arial", Font.BOLD, 32));
    	     }
    	     add(gifLabel, BorderLayout.CENTER);
   
    	     //Botones
    	     JPanel buttonPanel = new JPanel();
    	     buttonPanel.setBackground(Color.WHITE);
    	     restartButton = new JButton("Jugar de nuevo");
    	     exitButton = new JButton("Salir");
    	     buttonPanel.add(restartButton);
    	     buttonPanel.add(exitButton);
    	     add(buttonPanel, BorderLayout.SOUTH);
  
    	     playVictorySound();
    }
    public void setWinner(String winnerName) {
    	winnerLabel.setText("🎉 ¡Felicidades, " + winnerName + " ha ganado! 🎉");;
    }
    public void setRestartAction(ActionListener listener) {
        restartButton.addActionListener(listener);
    }

    public void setExitAction(ActionListener listener) {
        exitButton.addActionListener(listener);
    }
    private void playVictorySound() {
        try {
            InputStream is = getClass().getResourceAsStream("victory.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(new BufferedInputStream(is));
            Clip clip =AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
           
        } catch (Exception e) {
            System.out.println("No se pudo reproducir el sonido de victoria: " + e.getMessage());
        }
}
}
