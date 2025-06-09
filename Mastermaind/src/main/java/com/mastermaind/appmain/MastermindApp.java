package com.mastermaind.appmain;

import java.awt.CardLayout;
import java.awt.LayoutManager;

import javax.swing.*;

import com.mastermaind.controlador.MastermindController;
import com.mastermaind.vista.ColorSelectionPanel;
import com.mastermaind.vista.GamePlayPanel;
import com.mastermaind.vista.GameSetupPanel;
import com.mastermaind.vista.Victory;

public class MastermindApp extends JFrame {
	private LayoutManager cardLayout;
    private JPanel mainPanel;
    private MastermindController controller;

    private GameSetupPanel setupPanel;
    private ColorSelectionPanel selectionPanel;
    private GamePlayPanel gameplayPanel;
    private Victory victoryPanel;
    
    public MastermindApp() {
    	setTitle("Mastermind");
    	setSize(800,600);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	setLocationRelativeTo(null);
    	
    	 cardLayout = new CardLayout(); // Inicializar como CardLayout
         mainPanel = new JPanel(cardLayout);
         
    	 setupPanel = new GameSetupPanel();
         selectionPanel = new ColorSelectionPanel();
         gameplayPanel = new GamePlayPanel();
         victoryPanel = new Victory();
    	//Añadir paneles al contenerdor
    	mainPanel.add(setupPanel, "CONFIGURACIÓN");
    	mainPanel.add(selectionPanel, "SELECCIÓN");
    	mainPanel.add(gameplayPanel, "JUGABILIDAD");
    	mainPanel.add(victoryPanel, "VICTORIA");
    	
    	add(mainPanel);
    	
    	controller = new MastermindController(this, setupPanel, selectionPanel, gameplayPanel, victoryPanel);
    	
    	((CardLayout) cardLayout).show(mainPanel, "CONFIGURACION");
    }
    public void showPanel(String name) {
        ((CardLayout) cardLayout).show(mainPanel, name);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MastermindApp app = new MastermindApp();
            app.setVisible(true);
        });
}
}
