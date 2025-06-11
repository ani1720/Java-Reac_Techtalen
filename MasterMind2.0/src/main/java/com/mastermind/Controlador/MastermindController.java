// MastermindController.java
package com.mastermind.Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.mastermind.Modelo.MastermindModel;
import com.mastermind.Vista.MastermindView;

public class MastermindController {
    private MastermindModel modelo;
    private MastermindView vista;
    private int intentos = 0;

    public MastermindController(MastermindModel modelo, MastermindView vista) {
        this.modelo = modelo;
        this.vista = vista;

        vista.probarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] intento = vista.getIntentoUsuario();
                int[] resultado = modelo.comprobarIntento(intento);
                intentos++;
                vista.agregarAlHistorial("Intento " + intentos + ": " +
                        String.join(", ", intento) +
                        " --> " + resultado[0] + " bien colocados, " + resultado[1] + " solo color");
                if (resultado[0] == 4) {
                    JOptionPane.showMessageDialog(vista, "¡Felicidades! Has adivinado la combinación secreta.");
                    vista.probarBtn.setEnabled(false);
                }
            }
        });
    }
    
}
