package com.mastermaind.vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ColorSelectionPanel extends JPanel {

    private JComboBox<String>[] colorSelectors = new JComboBox[4]; // Selección de 4 colores
    private JButton confirmButton = new JButton("Confirmar combinación");
    private JLabel playerLabel = new JLabel("Jugador:");

    private static final String[] COLORS = {"Rojo", "Azul", "Verde", "Amarillo", "Naranja", "Violeta"};

    public ColorSelectionPanel() {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);

        // Panel superior con el nombre del jugador
        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.WHITE);
        topPanel.add(playerLabel);
        add(topPanel, BorderLayout.NORTH);

        // Panel central con los ComboBox para elegir colores
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.WHITE);
        centerPanel.setLayout(new FlowLayout());

        for (int i = 0; i < 4; i++) {
            colorSelectors[i] = new JComboBox<>(COLORS);
            centerPanel.add(colorSelectors[i]);
        }
        add(centerPanel, BorderLayout.CENTER);

        // Panel inferior con botón de confirmar
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(Color.WHITE);
        bottomPanel.add(confirmButton);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    // Asigna el nombre del jugador y actualiza el texto en pantalla
    public void setPlayerName(String name) {
        playerLabel.setText("Jugador: " + name + " - Elige tu combinación secreta");
    }

    // Devuelve los colores seleccionados como array
    public String[] getSelectedColors() {
        String[] selected = new String[4];
        for (int i = 0; i < 4; i++) {
            selected[i] = (String) colorSelectors[i].getSelectedItem();
        }
        return selected;
    }

    // Limpia los ComboBox (opcional: se puede dejar en primera opción)
    public void clearSelection() {
        for (JComboBox<String> combo : colorSelectors) {
            combo.setSelectedIndex(0); // selecciona el primer color
        }
    }

    // Permite que el botón "Confirmar combinación" tenga una acción personalizada
    public void setConfirmAction(ActionListener listener) {
        confirmButton.addActionListener(listener);
    }
}
