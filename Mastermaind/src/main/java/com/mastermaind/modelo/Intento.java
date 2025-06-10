package com.mastermaind.modelo;

public class Intento {
    private String[] combinacionIntentada; // arreglo de 4 colores elegidos en el intento
    private int aciertosPosicion;  // colores correctos en la posición correcta
    private int aciertosColor;     // colores correctos pero en posición incorrecta

    public Intento(String[] combinacionIntentada, int aciertosPosicion, int aciertosColor) {
        this.combinacionIntentada = combinacionIntentada;
        this.aciertosPosicion = aciertosPosicion;
        this.aciertosColor = aciertosColor;
    }
    // Getters para obtener los datos del intento (setters no necesarios en este caso)
    public String[] getCombinacionIntentada() { return combinacionIntentada; }
    public int getAciertosPosicion() { return aciertosPosicion; }
    public int getAciertosColor() { return aciertosColor; }
}