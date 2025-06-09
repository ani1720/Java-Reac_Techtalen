package com.mastermaind.controlador;

import com.mastermaind.appmain.MastermindApp;
import com.mastermaind.modelo.MastermindModel;
import com.mastermaind.modelo.Player;
import com.mastermaind.vista.ColorSelectionPanel;
import com.mastermaind.vista.GamePlayPanel;
import com.mastermaind.vista.GameSetupPanel;
import com.mastermaind.vista.Victory;

import javax.swing.*;
import java.util.List;

public class MastermindController {
    private MastermindApp app;
    private GameSetupPanel setupPanel;
    private ColorSelectionPanel selectionPanel;
    private GamePlayPanel gameplayPanel;
    private Victory victoryPanel;

    private Player player1;
    private Player player2;
    private MastermindModel game;

    private boolean isSelectingSecret = true;

    public MastermindController(MastermindApp app,
                                 GameSetupPanel setupPanel,
                                 ColorSelectionPanel selectionPanel,
                                 GamePlayPanel gameplayPanel,
                                 Victory victoryPanel) {
        this.app = app;
        this.setupPanel = setupPanel;
        this.selectionPanel = selectionPanel;
        this.gameplayPanel = gameplayPanel;
        this.victoryPanel = victoryPanel;

        initSetupPanel();
    }

    private void initSetupPanel() {
        setupPanel.setStartAction(e -> {
            String name1 = setupPanel.getPlayer1Name();
            String name2 = setupPanel.getPlayer2Name();
            int attempts = setupPanel.getMaxAttempts();

            if (name1.isEmpty() || name2.isEmpty() || attempts <= 0) {
                JOptionPane.showMessageDialog(null, "Debes ingresar nombres válidos y un número de intentos mayor que cero.");
                return;
            }

            player1 = new Player(name1, attempts);
            player2 = new Player(name2, attempts);
            game = new MastermindModel(player1, player2, attempts);

            isSelectingSecret = true;
            selectionPanel.clearSelection();
            app.showPanel("SELECTION");
        });
    }
}
