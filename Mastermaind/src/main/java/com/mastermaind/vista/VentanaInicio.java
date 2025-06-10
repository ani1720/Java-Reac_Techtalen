package com.mastermaind.vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VentanaInicio extends JFrame{

	private JTextField campoNombre1;
    private JTextField campoNombre2;
    private JSpinner spinnerIntentos;
    private JButton botonComenzar;

    public VentanaInicio() {
        super("Mastermind - Inicio");
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        // Configuración básica de la ventana
        this.setSize(600, 400);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel principal con formulario de nombres e intentos
        JPanel panelForm = new JPanel(new GridLayout(3, 2, 1, 1));
        panelForm.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelForm.add(new JLabel("Nombre Jugador 1:"));
        campoNombre1 = new JTextField();
        campoNombre1.setFont(new Font("Arial", Font.PLAIN,18));
        campoNombre1.setPreferredSize(new Dimension(150, 25));
        panelForm.add(campoNombre1);
        panelForm.add(new JLabel("Nombre Jugador 2:"));
        campoNombre2 = new JTextField();
        campoNombre2.setFont(new Font("Arial", Font.PLAIN,18));
        campoNombre2.setPreferredSize(new Dimension(150, 25));
        panelForm.add(campoNombre2);
        panelForm.add(new JLabel("Nº de intentos:"));
        // Spinner para seleccionar número de intentos (mínimo 1, máximo 15 por ejemplo)
        campoNombre1.setPreferredSize(new Dimension(200, 30));
        campoNombre2.setPreferredSize(new Dimension(200, 30));
       // spinnerIntentos.setPreferredSize(new Dimension(80, 30));

        spinnerIntentos = new JSpinner(new SpinnerNumberModel(10, 1, 20, 1));
        spinnerIntentos.setFont(new Font("Arial", Font.PLAIN,18));
        panelForm.add(spinnerIntentos);

        this.add(panelForm, BorderLayout.CENTER);

        // Botón Comenzar en la parte inferior
        botonComenzar = new JButton("Comenzar");
        this.add(botonComenzar, BorderLayout.SOUTH);
        botonComenzar.setPreferredSize(new Dimension(100,50));

        // Empaquetar componentes y centrar ventana en pantalla
       // this.pack();
        this.setLocationRelativeTo(null);
    }

    // Métodos para acceder a los datos ingresados
    public String getNombreJugador1() {
        return campoNombre1.getText().trim();
    }
    public String getNombreJugador2() {
        return campoNombre2.getText().trim();
    }
    public int getIntentosMaximos() {
        return (Integer) spinnerIntentos.getValue();
    }

    // Método para registrar listener para el botón Comenzar.
    public void addComenzarListener(ActionListener listener) {
        botonComenzar.addActionListener(listener);
    }
}
