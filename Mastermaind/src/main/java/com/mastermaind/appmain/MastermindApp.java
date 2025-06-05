package com.mastermaind.appmain;


import com.mastermaind.controlador.MastermindController;
import com.mastermaind.modelo.MastermindModel;
import com.mastermaind.vista.MastermindView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            String secretCode = JOptionPane.showInputDialog("Jugador 1: Introduce un código secreto de 4 dígitos:");
            
            while (secretCode == null || secretCode.length() != 4 || !secretCode.matches("[0-9]+")) {
                secretCode = JOptionPane.showInputDialog("Código inválido. Debe ser de 4 dígitos numéricos:");
            }

            MastermindModel model = new MastermindModel(secretCode);
            MastermindViewGUI view = new MastermindViewGUI();
            new MastermindControllerGUI(model, view);
        });
    }
}
