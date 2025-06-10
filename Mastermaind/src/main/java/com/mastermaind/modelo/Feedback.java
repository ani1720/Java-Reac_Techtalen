package com.mastermaind.modelo;

/**
 * Representa la retroalimentación de un intento:
 * cuántos colores acertó el jugador y cuántos están en el lugar correcto.
 */
public class Feedback {
    private int colorMatches;  // Colores correctos pero en posición incorrecta
    private int orderMatches;  // Colores correctos y en la posición correcta

    public Feedback(int colorMatches, int orderMatches) {
        this.colorMatches = colorMatches;
        this.orderMatches = orderMatches;
    }

    public int getColorMatches() {
        return colorMatches;
    }

    public int getOrderMatches() {
        return orderMatches;
    }

    public boolean isCorrect() {
        return orderMatches == 4;
    }
}
