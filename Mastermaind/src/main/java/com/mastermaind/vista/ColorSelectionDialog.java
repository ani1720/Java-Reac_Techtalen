package com.mastermaind.vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorSelectionDialog {
    private static final String[] COLORES_NOMBRES = {"Rojo", "Azul", "Verde", "Amarillo", "Naranja", "Violeta"};
    private static final Color[] COLORES = {
        Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, new Color(148, 0, 211)
    };

    public static String[] mostrarDialogo(JFrame parent, String nombreUsuario) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 4, 10, 10));
        panel.setBackground(new Color(220, 230, 250));
        panel.add(new JLabel(nombreUsuario + ", elige tu combinación secreta:", SwingConstants.CENTER));

        JPanel[] colorPanels = new JPanel[4];
        int[] seleccion = {0, 1, 2, 3}; // índices de color seleccionados inicialmente

        for (int i = 0; i < 4; i++) {
            int idx = i;
            colorPanels[i] = new JPanel();
            colorPanels[i].setPreferredSize(new Dimension(40, 40));
            colorPanels[i].setBackground(COLORES[seleccion[i]]);
            colorPanels[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

            colorPanels[i].addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    Object opcion = JOptionPane.showInputDialog(
                        panel,
                        "Selecciona un color:",
                        "Elige color",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        COLORES_NOMBRES,
                        COLORES_NOMBRES[seleccion[idx]]
                    );
                    if (opcion != null) {
                        // Buscar el índice del color seleccionado
                        for (int j = 0; j < COLORES_NOMBRES.length; j++) {
                            if (COLORES_NOMBRES[j].equals(opcion.toString())) {
                                seleccion[idx] = j;
                                colorPanels[idx].setBackground(COLORES[j]);
                            }
                        }
                    }
                }
            });
            panel.add(colorPanels[i]);
        }

        int result = JOptionPane.showConfirmDialog(
            parent,
            panel,
            "Combinación Secreta",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE
        );

        if (result == JOptionPane.OK_OPTION) {
            String[] coloresSeleccionados = new String[4];
            for (int i = 0; i < 4; i++) {
                coloresSeleccionados[i] = COLORES_NOMBRES[seleccion[i]];
            }
            return coloresSeleccionados;
        } else {
            return null;
        }
    }

    // Prueba rápida:
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            String nombre = "ani";
            String[] seleccion = mostrarDialogo(null, nombre);
            if (seleccion != null) {
                JOptionPane.showMessageDialog(null, String.join(", ", seleccion));
            }
        });
    }
}

