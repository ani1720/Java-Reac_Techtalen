package com.mastermaind.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.mastermaind.modelo.Intento;
import com.mastermaind.modelo.Juego;
import com.mastermaind.modelo.Jugador;
import com.mastermaind.vista.VentanaInicio;
import com.mastermaind.vista.VentanaJuego;
import db.BaseDatos;
public class MastermidController{
	private VentanaInicio ventanaInicio;
    private VentanaJuego ventanaJuego;
    private Juego juego;
    private BaseDatos baseDatos;  // manejador de la conexión BD

    public MastermidController(VentanaInicio vInicio, BaseDatos bd) {
        this.ventanaInicio = vInicio;
        this.baseDatos = bd;
        // Registrar el listener para el botón Comenzar de la ventana de inicio
        ventanaInicio.addComenzarListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                iniciarJuego();
            }
        });
    }

    // Método llamado cuando se hace clic en "Comenzar" en VentanaInicio
    private void iniciarJuego() {
        String nombre1 = ventanaInicio.getNombreJugador1();
        String nombre2 = ventanaInicio.getNombreJugador2();
        int intentosMax = ventanaInicio.getIntentosMaximos();
        if (nombre1.isEmpty() || nombre2.isEmpty()) {
            // Validación sencilla: nombres no vacíos
            JOptionPane.showMessageDialog(ventanaInicio, 
                "Por favor ingrese ambos nombres de jugador.", 
                "Datos incompletos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        // Crear objetos Jugador y Juego (modelo)
        Jugador jugador1 = new Jugador(nombre1);
        Jugador jugador2 = new Jugador(nombre2);
        juego = new Juego(jugador1, jugador2, intentosMax);

        // Aquí podríamos pedir a Jugador1 que ingrese la combinación secreta.
        // Para simplificar, imaginemos que abrimos un diálogo:
        String[] combinacion = pedirCombinacionSecreta(jugador1);
        juego.setCombinacionSecreta(combinacion);

        // Iniciar la ventana de juego para Jugador2
        ventanaJuego = new VentanaJuego(nombre1, nombre2, intentosMax);
        ventanaJuego.setVisible(true);
        ventanaInicio.setVisible(false); // ocultar la ventana de inicio

        // Registrar listener para el botón Probar de la ventana de juego
        ventanaJuego.addProbarListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                manejarIntento();
            }
        });
    }

    // Método auxiliar para pedir combinación secreta a Jugador1 (podría abrir un diálogo modal)
    private String[] pedirCombinacionSecreta(Jugador jugador1) {
        // Por simplicidad, vamos a usar un JOptionPane con inputs de texto separados por comas.
        // En una implementación real, sería una interfaz más amigable de selección.
        String input = JOptionPane.showInputDialog(
            null, 
            jugador1.getNombre() + ", introduce tu código secreto de 4 colores separados por comas:", 
            "Combinación Secreta", JOptionPane.QUESTION_MESSAGE
        );
        if (input != null) {
            String[] colores = input.split(","); 
            if (colores.length == 4) {
                for(int i=0; i<4; i++){
                    colores[i] = colores[i].trim();
                }
                return colores;
            }
        }
        // Si algo falla, por defecto devuelve 4 colores fijos:
        return new String[]{"Rojo", "Verde", "Azul", "Amarillo"};
    }

    // Manejar un intento del Jugador2 al presionar "Probar combinación"
    private void manejarIntento() {
        if (juego == null) return; // seguridad, juego debería existir
        // Obtener combinación propuesta desde la vista
        String[] combinacionIntento = ventanaJuego.getCombinacionIntroducida();
        // Procesar el intento a través del modelo
        Intento resultado = juego.procesarIntento(combinacionIntento);
        // Actualizar la interfaz con el resultado
        int numIntento = juego.getIntentosRealizados();
        // Mostrar en historial: intento X y resultados
        String combinacionStr = String.join("-", combinacionIntento);
        String feedback = String.format("Intento %d: %s -> %d bien colocados, %d correctos fuera de lugar",
                                        numIntento, combinacionStr, 
                                        resultado.getAciertosPosicion(), resultado.getAciertosColor());
        ventanaJuego.agregarAlHistorial(feedback);
        // Actualizar etiqueta de intento actual (para el próximo intento, si lo hay)
        if (numIntento < juego.getIntentosMaximos()) {
            ventanaJuego.actualizarInfoIntento(numIntento + 1, juego.getIntentosMaximos());
        }

        // Verificar si termina el juego
        if (juego.isJuegoTerminado()) {
            terminarJuego();
        }
    }

    // Lógica de finalización de la partida
    private void terminarJuego() {
        // Deshabilitar el botón de probar para que no se puedan hacer más intentos
        ventanaJuego.setEnabled(false);
        Jugador ganador = juego.getGanador();
        String msg;
        if (ganador.equals(juego.getJugador2())) {
            msg = "¡Felicitaciones " + ganador.getNombre() + "! Has adivinado la combinación secreta.";
        } else {
            msg = "Se agotaron los intentos. " + ganador.getNombre() + " gana la partida.";
        }
        // Mostrar mensaje de resultado final
        JOptionPane.showMessageDialog(ventanaJuego, msg, "Fin de la partida", JOptionPane.INFORMATION_MESSAGE);
        // (Opcional: mostrar aquí animación o GIF de victoria si se desea, 
        // por ejemplo, abriendo una nueva ventana con un JLabel con ImageIcon animado.)

        // Guardar datos de la partida en la base de datos
        baseDatos.guardarPartida(juego);
    }
}
