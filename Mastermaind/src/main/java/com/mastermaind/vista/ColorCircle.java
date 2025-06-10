package com.mastermaind.vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;

public class ColorCircle extends JComponent {
	private Color color;
    private int diameter;

    /**
     * Constructor de ColorCircle.
     * @param color Color del círculo.
     * @param diameter Diámetro del círculo en píxeles.
     */
    public ColorCircle(Color color, int diameter) {
        this.color = color;
        this.diameter = diameter;
        // Establecer el tamaño preferido para que el layout lo considere.
        setPreferredSize(new Dimension(diameter, diameter));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Establecer el color de dibujo al color del círculo y dibujar un óvalo (círculo).
        g.setColor(color);
        g.fillOval(0, 0, diameter - 1, diameter - 1);
        // Dibujar un borde negro alrededor del círculo para delimitarlo visualmente.
        g.setColor(Color.BLACK);
        g.drawOval(0, 0, diameter - 1, diameter - 1);
    }
}
