package com.mastermaind.controlador;

import com.mastermaind.modelo.MastermindModel;
import com.mastermaind.vista.MastermindView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MastermindController {
    private MastermindModel model;
    private MastermindView view;

    public MastermindController(MastermindModel model, MastermindView view) {
        this.model = model;
        this.view = view;

        view.setSubmitButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String guess = view.getUserGuess();
                String result = model.checkGuess(guess);
                view.showMessage(result);

                if (guess.equals(model.getSecretCode())) {
                    view.showMessage("¡Jugador 2 ganó! El código era: " + model.getSecretCode());
                }
            }
        });
    }
}

