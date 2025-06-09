package com.mastermaind.vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.function.Consumer;

public class ColorSelectionPanel extends JPanel {
	private final JComboBox<String>[] colorSelectors = new JComboBox[4];
	private final JButton confirmButton = new JButton("Confirmar combinacion");
	private final JLabel playerLabel = new JLabel("Jugador: ");

	private static final String[] COLORS = { "Rojo", "Azul", "Verde", "Amarillo", "Naranja", "Violeta", };
	
	
	public ColorSelectionPanel() {
		setLayout(new BorderLayout());
		setBackground(Color.WHITE);

		// Panel superior con el name
		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.WHITE);
		topPanel.add(playerLabel);
		add(topPanel, BorderLayout.NORTH);

		// Panel central con los selectores
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.WHITE);
		centerPanel.setLayout(new FlowLayout());

		for (int i = 0; i < colorSelectors.length; i++) {
			colorSelectors[i] = new JComboBox<>(COLORS);
			centerPanel.add(colorSelectors[i]);
		}
		add(centerPanel, BorderLayout.CENTER);

		// Panel inferior con botones
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(Color.WHITE);
		bottomPanel.add(confirmButton);
		add(bottomPanel, BorderLayout.SOUTH);
	}

	public void setPalyerName(String playName) {
		playerLabel.setText("Jugador: " + playName + "Elige tu combinacion secreta");
	}
	public void clearSelection() {
		for (JComboBox<String> selector : colorSelectors) {
			selector.setSelectedIndex(0);
		}
	}
	public String[] getSelectedColors() {
		String[] selected = new String[4];
		for (int i = 0; i < 4; i++) {
			selected[i] = (String) colorSelectors[i].getSelectedItem();
		}
		return selected;
	}

	public void addConfirmButtonListener(ActionListener listener) {
		confirmButton.addActionListener(listener);
	}
}

