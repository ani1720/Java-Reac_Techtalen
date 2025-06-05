package com.mastermaind.vista;

import java.util.Scanner;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionListener;

	public class MastermindView extends JFrame {
	    private JTextField inputField;
	    private JButton submitButton;
	    private JLabel resultLabel;
	    
	    public MastermindView() {
	        setTitle("Mastermind Multijugador");
	        setSize(400, 200);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new FlowLayout());

	        add(new JLabel("Introduce tu intento:"));
	        inputField = new JTextField(10);
	        add(inputField);
	        
	        submitButton = new JButton("Enviar");
	        add(submitButton);

	        resultLabel = new JLabel("");
	        add(resultLabel);
	        
	        setVisible(true);
	    }

	    public void setSubmitButtonListener(ActionListener listener) {
	        submitButton.addActionListener(listener);
	    }

	    public String getUserGuess() {
	        return inputField.getText();
	    }

	    public void showMessage(String message) {
	        resultLabel.setText(message);
	    }
	}
