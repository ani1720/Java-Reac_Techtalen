package com.mastermaind.vista;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

import com.mastermaind.modelo.GamePlayPanel;
public class VentanaJuego extends JFrame {
	
	private JLabel etiquetaInfo;      // etiqueta para mostrar información (ej: "Intento 1 de 10")
   private String[] combinacionSecreta; // arreglo de 4 ComboBox para colores
    private JButton botonProbar;
    private JTextArea areaHistorial;  // muestra intentos previos y resultados
    private static final String[] COLORES_NOMBRES = {"Rojo", "Azul", "Verde", "Amarillo", "Naranja", "Violeta"};
    private static final Color[] COLORES = {
        Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, new Color(148, 0, 211)
    };
    public VentanaJuego(String nombreJugador1, String nombreJugador2, int intentosMax) {
        super("Mastermind - Jugando");
        
        combinacionSecreta = mostrarDialogo(this, nombreJugador1, nombreJugador2);
        if (combinacionSecreta == null) {
            // Usuario canceló, cerramos la ventana inmediatamente
            JOptionPane.showMessageDialog(this, "No se seleccionó ninguna combinación. Cerrando el juego.");
            dispose(); // o puedes System.exit(0) si quieres cerrar toda la app
            return;
        }

        // Si sí eligió combinación, inicializa todo normalmente:
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

        // Área de texto para historial de intentos
        areaHistorial = new JTextArea();
        areaHistorial.setEditable(false);
        areaHistorial.setBorder(BorderFactory.createTitledBorder("Historial de intentos"));
        this.add(new JScrollPane(areaHistorial), BorderLayout.SOUTH);

      //  this.pack();
    //    this.setLocationRelativeTo(null);
    }
    public static String[] mostrarDialogo(JFrame parent, String nombreJ1, String nombreJ2) {
    	JPanel panel = new JPanel();
    	 panel.setLayout(new GridLayout(2, 4, 10, 10));
         panel.setBackground(new Color(220, 230, 250));
         panel.add(new JLabel(nombreJ1 + ", elige tu combinación secreta:", SwingConstants.CENTER));
         JPanel[] colorPanels = new JPanel[4];
        final int[] seleccion = new int [4];
         
         for (int i = 0; i < 4; i++) {
           final  int idx = i;
             colorPanels[i] = new JPanel();
             colorPanels[i].setPreferredSize(new Dimension(40, 40));
             colorPanels[i].setBackground(COLORES[seleccion[i]]);
             colorPanels[i].setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

             colorPanels[i].addMouseListener(new MouseAdapter() {
                 public void mouseClicked(MouseEvent e) {
                     Object opcion = JOptionPane.showInputDialog(
                         panel,
                         "Selecciona un color:",
                         "Elige color",
                         JOptionPane.QUESTION_MESSAGE,
                         null,
                         COLORES_NOMBRES,
                         COLORES_NOMBRES[seleccion[idx]]
                     );
                     if (opcion != null) {
                         // Buscar el índice del color seleccionado
                         for (int j = 0; j < COLORES_NOMBRES.length; j++) {
                             if (COLORES_NOMBRES[j].equals(opcion.toString())) {
                                 seleccion[idx] = j;
                                 colorPanels[idx].setBackground(COLORES[j]);
                             }
                         }
                     }
                 }
             });
             panel.add(colorPanels[i]);
         }

         int result = JOptionPane.showConfirmDialog(
             parent,
             panel,
             "Combinación Secreta",
             JOptionPane.OK_CANCEL_OPTION,
             JOptionPane.PLAIN_MESSAGE
         );

         if (result == JOptionPane.OK_OPTION) {
             String[] coloresSeleccionados = new String[4];
             for (int i = 0; i < 4; i++) {
                 coloresSeleccionados[i] = COLORES_NOMBRES[seleccion[i]];
             }
             return coloresSeleccionados;
         } else {
             return null;
         }
     }
    
    // Obtener la combinación actual seleccionada por Jugador2 en los ComboBox
    public String[] getColoresSeleccionados() {
        String[] seleccionNombres = new String[4];
        int[] seleccion = null;
        for (int i = 0; i < 4; i++) {
			seleccionNombres[i] = COLORES_NOMBRES[seleccion[i]];
        }
        return seleccionNombres;
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
