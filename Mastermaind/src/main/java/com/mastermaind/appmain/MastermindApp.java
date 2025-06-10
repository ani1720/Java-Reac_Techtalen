package com.mastermaind.appmain;

import javax.swing.*;

import com.mastermaind.vista.*;
import com.mastermaind.controlador.MastermindController;

import java.awt.*;

public class MastermindApp extends JFrame {

    private CardLayout cardLayout;  // Permite cambiar entre pantallas (panels)
    private JPanel mainPanel;       // Panel principal con varias vistas

    // Los paneles del juego
    private GameSetupPanel setupPanel;
    private ColorSelectionPanel colorPanel;
    private GamePlayPanel gameplayPanel;
    private Victory victoryPanel;

    public MastermindApp() {
        // Configuración de la ventana principal
        setTitle("Juego Mastermind");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Centrar ventana

        // Crear layout y panel principal
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Inicializar cada panel de vista
        setupPanel = new GameSetupPanel();
        colorPanel = new ColorSelectionPanel();
        gameplayPanel = new GamePlayPanel();
        victoryPanel = new Victory();

        // Agregar los paneles al CardLayout
        mainPanel.add(setupPanel, "config");
        mainPanel.add(colorPanel, "seleccion");
        mainPanel.add(gameplayPanel, "juego");
        mainPanel.add(victoryPanel, "victoria");

        // Agregar el panel principal a la ventana
        add(mainPanel);

        // Crear el controlador y pasarle las vistas necesarias
        new MastermindController(this, setupPanel, colorPanel, gameplayPanel, victoryPanel);
    }

    /**
     * Cambia la pantalla actual mostrando el panel especificado por nombre.
     * Ejemplo: mostrarPanel("juego") muestra el panel de juego.
     */
    public void mostrarPanel(String nombrePanel) {
        cardLayout.show(mainPanel, nombrePanel);
    }

    // Método main para ejecutar el programa
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MastermindApp().setVisible(true);
        });
    }
}

