// AppMain.java
package com.mastermind;

import com.mastermind.Controlador.MastermindController;
import com.mastermind.Modelo.MastermindModel;
import com.mastermind.Vista.MastermindView;

public class AppMain {
    public static void main(String[] args) {
        MastermindModel modelo = new MastermindModel();
        MastermindView vista = new MastermindView();
        new MastermindController(modelo, vista);
    }
}
