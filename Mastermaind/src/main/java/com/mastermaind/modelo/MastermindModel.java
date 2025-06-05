package com.mastermaind.modelo;
public class MastermindModel {
    private String secretCode;
    private final int CODE_LENGTH = 4;

    public MastermindModel(String secretCode) {
        this.secretCode = secretCode;
    }

    public String checkGuess(String guess) {
        if (guess.length() != CODE_LENGTH || !guess.matches("[0-9]+")) {
            return "Entrada inválida. Debe ser de " + CODE_LENGTH + " dígitos.";
        }
        
        int correctPosition = 0, correctNumber = 0;
        for (int i = 0; i < CODE_LENGTH; i++) {
            if (guess.charAt(i) == secretCode.charAt(i)) {
                correctPosition++;
            } else if (secretCode.contains(String.valueOf(guess.charAt(i)))) {
                correctNumber++;
            }
        }

        return "Correctos: " + correctPosition + ", Parcialmente correctos: " + correctNumber;
    }

    public String getSecretCode() {
        return secretCode;
    }
}
