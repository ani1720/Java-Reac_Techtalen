package com.mastermaind.modelo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

import com.mastermaind.vista.ColorCircle;

public class GamePlayPanel extends JPanel {
	 public GamePlayPanel() {
	        // Usamos un BoxLayout en eje Y para apilar intentos uno debajo de otro.
	        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	    }

	    /**
	     * Añade una nueva fila de intento al panel, con círculos de colores para el intento
	     * y círculos pequeños para la retroalimentación (negros para aciertos exactos, blancos para aciertos de color).
	     * @param guessColors Array de colores que el jugador propuso en este intento.
	     * @param blackCount Número de aciertos exactos (color y posición correctos).
	     * @param whiteCount Número de aciertos de color (colores correctos en posición incorrecta).
	     */
	    public void addAttempt(Color[] guessColors, int blackCount, int whiteCount) {
	        // Panel para la fila del intento (contenedor horizontal para intentos + feedback).
	        JPanel attemptPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	        // Tamaño de círculo grande para los colores del intento.
	        int circleSize = 30;
	        // Añadir un ColorCircle por cada color del intento propuesto.
	        for (Color color : guessColors) {
	            ColorCircle circle = new ColorCircle(color, circleSize);
	            attemptPanel.add(circle);
	        }

	        // Panel de feedback: 2x2 grid para hasta 4 pequeñas clavijas (círculos negros/blancos).
	        JPanel feedbackPanel = new JPanel(new GridLayout(2, 2, 2, 2));
	        int pegSize = 15;  // diámetro para clavijas de feedback (más pequeño que circleSize).
	        // Añadir círculos negros por cada acierto exacto (blackCount).
	        for (int i = 0; i < blackCount; i++) {
	            feedbackPanel.add(new ColorCircle(Color.BLACK, pegSize));
	        }
	        // Añadir círculos blancos por cada acierto de color (whiteCount).
	        for (int i = 0; i < whiteCount; i++) {
	            feedbackPanel.add(new ColorCircle(Color.WHITE, pegSize));
	        }
	        // Si quedan menos de 4 clavijas (casillas de feedback), rellenamos las restantes con espacios vacíos 
	        // para mantener la grilla 2x2 completa.
	        int totalFeedback = blackCount + whiteCount;
	        for (int i = totalFeedback; i < 4; i++) {
	            JPanel emptySlot = new JPanel();
	            emptySlot.setPreferredSize(new Dimension(pegSize, pegSize));
	            feedbackPanel.add(emptySlot);
	        }

	        // Añadir el panel de feedback al panel del intento, después de los círculos de colores de la jugada.
	        attemptPanel.add(feedbackPanel);
	        // Opcional: añadir un espaciado alrededor de la fila para separación visual.
	        attemptPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

	        // Finalmente, agregar esta fila de intento completa al GamePlayPanel principal.
	        this.add(attemptPanel);
	        // Refrescar la interfaz para que el nuevo intento sea visible inmediatamente.
	        this.revalidate();
	        this.repaint();
	    }
	}
