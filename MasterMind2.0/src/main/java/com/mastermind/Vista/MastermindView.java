
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
	    public JTextArea historial = new JTextArea();

	    public MastermindView() {
	        setTitle("Mastermind");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new BorderLayout());

	        // Panel de selección visual de colores
	        JPanel panelSeleccion = new JPanel();
	        for (int i = 0; i < 4; i++) {
	            final int idx = i;
	            intentoPanels[i] = new JPanel();
	            intentoPanels[i].setPreferredSize(new Dimension(40, 40));
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

	        historial.setEditable(false);
	        add(new JScrollPane(historial), BorderLayout.CENTER);

	        setSize(400, 300);
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

	    public void agregarAlHistorial(String mensaje) {
	        historial.append(mensaje + "\n");
	    }
	}
