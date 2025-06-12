
package com.mastermind.Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MastermindView extends JFrame {
	    public static final Color[] COLORES = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.PINK};
	    public static final String[] COLORES_NOMBRES = {"Rojo", "Azul", "Verde", "Amarillo", "Naranja", "Rosa"};

	    private JPanel[] intentoPanels = new JPanel[4];
	    private int[] seleccionActual = new int[4]; // Índices de los colores seleccionados
	    public JButton probarBtn = new JButton("Probar combinación");
	    public JPanel historial = new JPanel();

	    public MastermindView() {
	        setTitle("Mastermind");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new BorderLayout());

	        // Panel de selección visual de colores
	        JPanel panelSeleccion = new JPanel();
	        for (int i = 0; i < 4; i++) {
	            final int idx = i;
	            intentoPanels[i] = new JPanel();
	            intentoPanels[i].setPreferredSize(new Dimension(80, 80));
	            intentoPanels[i].setBackground(COLORES[0]);
	            seleccionActual[i] = 0;
	            intentoPanels[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
	            intentoPanels[i].addMouseListener(new MouseAdapter() {
	                public void mouseClicked(MouseEvent e) {
	                    seleccionActual[idx] = (seleccionActual[idx] + 1) % COLORES.length;
	                    intentoPanels[idx].setBackground(COLORES[seleccionActual[idx]]);
	                }
	            });
	            panelSeleccion.add(intentoPanels[i]);
	        }
	        panelSeleccion.add(probarBtn);

	        add(panelSeleccion, BorderLayout.NORTH);

	        historial.setLayout(new BoxLayout(historial, BoxLayout.Y_AXIS));
	        JScrollPane scroll = new JScrollPane(historial);
	        add(scroll, BorderLayout.CENTER);

	        add(new JScrollPane(historial), BorderLayout.CENTER);

	        setSize(800, 600);
	        setLocationRelativeTo(null);
	        setVisible(true);
	    }

	    // Devuelve el intento actual del usuario como nombres de color
	    public String[] getIntentoUsuario() {
	        String[] intento = new String[4];
	        for (int i = 0; i < 4; i++) {
	            intento[i] = COLORES_NOMBRES[seleccionActual[i]];
	        }
	        return intento;
	    }
	    public void agregarAlHistorialVisual(String[] intento, int exactos, int color) {
	        JPanel intentoPanel = new JPanel();
	        intentoPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
	        intentoPanel.setOpaque(false);

	        // Muestra los cuadros de color
	        for (String colorStr : intento) {
	            JPanel colorBox = new JPanel();
	            colorBox.setPreferredSize(new Dimension(30, 30));
	            colorBox.setBackground(colorDeNombre(colorStr));
	            colorBox.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	            intentoPanel.add(colorBox);
	        }

	        // Etiqueta con el resultado del intento
	        JLabel lbl = new JLabel(" → " + exactos + " bien colocados, " + color + " solo color");
	        intentoPanel.add(lbl);

	        historial.add(intentoPanel);
	        historial.revalidate();
	        historial.repaint();
	    }

	    // Convierte el nombre del color en un Color de Java
	    private Color colorDeNombre(String nombre) {
	        switch (nombre) {
	            case "Rojo": return Color.RED;
	            case "Azul": return Color.BLUE;
	            case "Verde": return Color.GREEN;
	            case "Amarillo": return Color.YELLOW;
	            case "Naranja": return Color.ORANGE;
	            case "Rosa": return Color.PINK;
	            default: return Color.LIGHT_GRAY;
	        }
	    }

	    
	}
