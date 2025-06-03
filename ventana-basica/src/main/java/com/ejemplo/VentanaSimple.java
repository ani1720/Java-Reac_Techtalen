package com.ejemplo;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;

/**
 * Ventana básica con controles estándar (minimizar, restaurar, maximizar, cerrar).
 * Al pulsar la "X" se cierra completamente la aplicación.
 */
public class VentanaSimple extends JFrame {

    public VentanaSimple() {
        super("Mi ventana con marco y controles");          // Título
        setDefaultCloseOperation(EXIT_ON_CLOSE);           // "X" finaliza el programa
        setLayout(new BorderLayout());

        // Etiqueta centrada
        JLabel etiqueta = new JLabel("¡Hola, mundo Swing!", JLabel.CENTER);
        add(etiqueta, BorderLayout.CENTER);

        setSize(400, 250);      // Tamaño inicial
        setLocationRelativeTo(null);  // Centra la ventana en la pantalla

        // setResizable(true) -> es 'true' por defecto, así que el usuario puede cambiar tamaño
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaSimple().setVisible(true));
    }
}
