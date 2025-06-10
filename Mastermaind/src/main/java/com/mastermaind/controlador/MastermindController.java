package com.mastermaind.controlador;

import com.mastermaind.vista.*;
import com.mastermaind.appmain.MastermindApp;
import com.mastermaind.modelo.*;

import java.util.List;
import java.util.function.Consumer;

public class MastermindController {

    private MastermindModel model;
    private MastermindApp app;
    private GameSetupPanel setupPanel;
    private ColorSelectionPanel colorPanel;
    private GamePlayPanel gameplayPanel;
    private Victory victoryPanel;

    public MastermindController(MastermindApp app,
                                 GameSetupPanel setupPanel,
                                 ColorSelectionPanel colorPanel,
                                 GamePlayPanel gameplayPanel,
                                 Victory victoryPanel) {
        this.app = app;
        this.setupPanel = setupPanel;
        this.colorPanel = colorPanel;
        this.gameplayPanel = gameplayPanel;
        this.victoryPanel = victoryPanel;
        this.model = new MastermindModel(); // Asegúrate de tener esta clase

        initSetup();
    }

    private void initSetup() {
        setupPanel.setStartAction(e -> {
            String name1 = setupPanel.getPlayer1Name();
            String name2 = setupPanel.getPlayer2Name();
            int attempts = setupPanel.getMaxAttempts();

            Player player1 = new Player(name1, attempts);
            Player player2 = new Player(name2, attempts);

            model.setPlayers(player1, player2);

            colorPanel.setConfirmAction(selectedColors -> {
                model.setSecretCombination(selectedColors);
                startGame();
            });

            app.mostrarPanel("seleccion"); // Asegúrate de que esto existe en MastermindApp
        });
    }

    private void startGame() {
        gameplayPanel.setAvailableColors(List.of("Rojo", "Verde", "Azul", "Amarillo"));
        gameplayPanel.setPlayer(model.getCurrentPlayer());

        gameplayPanel.setSubmitAction(guess -> {
            Feedback feedback = model.evaluateGuess(guess);
            gameplayPanel.addAttemptResult(guess, feedback);

            if (feedback.getExactMatches() == 4) {
                victoryPanel.setWinner(model.getCurrentPlayer().getName());
                app.mostrarPanel("victoria");
            } else if (!model.hasRemainingAttempts(model.getCurrentPlayer())) {
                model.changeTurn();
                gameplayPanel.setPlayer(model.getCurrentPlayer());
            }
        });

        app.mostrarPanel("juego");
    }
}
