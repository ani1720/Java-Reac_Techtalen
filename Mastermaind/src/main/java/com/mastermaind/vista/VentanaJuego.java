package com.mastermaind.vista;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.mastermaind.modelo.GamePlayPanel;

public class VentanaJuego extends JFrame {
	private JLabel etiquetaInfo;      // etiqueta para mostrar información (ej: "Intento 1 de 10")
    private JComboBox<String>[] comboColores; // arreglo de 4 ComboBox para colores
    private JButton botonProbar;
    private JTextArea areaHistorial;  // muestra intentos previos y resultados

    public VentanaJuego(String nombreJugador1, String nombreJugador2, int intentosMax) {
        super("Mastermind - Jugando");
        inicializarComponentes(nombreJugador1, nombreJugador2, intentosMax);
    }

    @SuppressWarnings("unchecked")
    private void inicializarComponentes(String nombreJ1, String nombreJ2, int intentosMax) {
        this.setSize(800, 600);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Información superior
        etiquetaInfo = new JLabel("Turno de " + nombreJ2 + ". Intento 1 de " + intentosMax);
        this.add(etiquetaInfo, BorderLayout.CENTER);

        // Panel central con selección de colores para el intento actual
        JPanel panelIntento = new JPanel(new FlowLayout());
        Color[] coloresDisponibles = {Color.RED, Color.GREEN, Color.BLUE,Color.YELLOW, Color.ORANGE, Color.MAGENTA};
        comboColores = JComboBox[4];
        //        String[] coloresDisponibles = {"Rojo", "Verde", "Azul", "Amarillo", "Naranja", "Morado"}; // ejemplo de colores
//        comboColores = new JComboBox[4];
//        for (int i = 0; i < 4; i++) {
//            comboColores[i] = new JComboBox<>(coloresDisponibles);
//            panelIntento.add(comboColores[i]);
//        }
        botonProbar = new JButton("Probar combinación");
        panelIntento.add(botonProbar);
        this.add(panelIntento, BorderLayout.CENTER);

        // Área de texto para historial de intentos
        areaHistorial = new JTextArea();
        areaHistorial.setEditable(false);
        areaHistorial.setBorder(BorderFactory.createTitledBorder("Historial de intentos"));
        this.add(new JScrollPane(areaHistorial), BorderLayout.SOUTH);

      //  this.pack();
    //    this.setLocationRelativeTo(null);
    }

    // Obtener la combinación actual seleccionada por Jugador2 en los ComboBox
    public String[] getCombinacionIntroducida() {
        String[] combinacion = new String[4];
        for (int i = 0; i < 4; i++) {
            combinacion[i] = (String) comboColores[i].getSelectedItem();
        }
        return combinacion;
    }

    // Método para actualizar la etiqueta de información del turno/intentoo
    public void actualizarInfoIntento(int numeroIntento, int intentosMax) {
        etiquetaInfo.setText("Turno de " + /*nombre Jugador2*/ " . Intento " + numeroIntento + " de " + intentosMax);
    }

    // Agregar línea al historial de intentos
    public void agregarAlHistorial(String texto) {
        areaHistorial.append(texto + "\n");
    }

    // Registrar listener para el botón "Probar combinación"
    public void addProbarListener(ActionListener listener) {
        botonProbar.addActionListener(listener);
    }
}
