package com.mastermaind.vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GameSetupPanel extends JPanel {

    // Campos de texto para ingresar los nombres de los jugadores
    private JTextField player1NameField;
    private JTextField player2NameField;

    // Spinner para seleccionar la cantidad de intentos
    private JSpinner attemptsSpinner;

    // Botón para comenzar el juego
    private JButton continueButton;

    public GameSetupPanel() {
        setLayout(new GridLayout(5, 2, 10, 10)); // Usamos GridLayout para simplificar
        setBackground(Color.WHITE);

        // Título del panel
        JLabel title = new JLabel("Configuración del Juego Mastermind");
        title.setFont(new Font("Arial", Font.BOLD, 16));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        add(title);
        add(new JLabel("")); // Celda vacía para alinear el título

        // Campo para el nombre del Jugador 1
        add(new JLabel("Nombre del Jugador 1:"));
        player1NameField = new JTextField(10);
        add(player1NameField);

        // Campo para el nombre del Jugador 2
        add(new JLabel("Nombre del Jugador 2:"));
        player2NameField = new JTextField(10);
        add(player2NameField);

        // Selector para el número de intentos
        add(new JLabel("Intentos por jugador:"));
        attemptsSpinner = new JSpinner(new SpinnerNumberModel(5, 1, 20, 1));
        add(attemptsSpinner);

        // Botón para continuar
        continueButton = new JButton("Comenzar juego");
        add(continueButton);

        // Celda vacía para alinear el botón
        add(new JLabel(""));
    }

    // Devuelve el nombre del jugador 1
    public String getPlayer1Name() {
        return player1NameField.getText().trim();
    }

    // Devuelve el nombre del jugador 2
    public String getPlayer2Name() {
        return player2NameField.getText().trim();
    }

    // Devuelve el número de intentos seleccionados
    public int getMaxAttempts() {
        return (Integer) attemptsSpinner.getValue();
    }

    // Asigna una acción al botón "Comenzar juego"
    public void setStartAction(ActionListener listener) {
        continueButton.addActionListener(listener);
    }
}
