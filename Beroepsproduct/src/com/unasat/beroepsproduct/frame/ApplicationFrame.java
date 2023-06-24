package com.unasat.beroepsproduct.frame;

import com.unasat.beroepsproduct.methods.CurrencyConverter;
import com.unasat.beroepsproduct.methods.MorseConverter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApplicationFrame extends JFrame implements ActionListener {
    // Declare the GUI components
    private JLabel inputLabel;
    private JTextField inputField;
    private JLabel outputLabel;
    private JTextField outputField;
    private JButton morseToTextButton;
    private JButton textToMorseButton;
    private JButton usdToEuroButton;
    private JButton euroToUsdButton;

    // This is the constructor for the ApplicationFrame class. It sets up the GUI window with various buttons and fields.
    public ApplicationFrame(){
        setTitle("Beroepsproduct");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new GridLayout(5, 2));

        // Set up the input label and text field
        inputLabel = new JLabel("Input:");
        inputField = new JTextField();
        add(inputLabel);
        add(inputField);

        // Set up the output label and text field
        outputLabel = new JLabel("Output:");
        outputField = new JTextField();
        outputField.setEditable(false);
        add(outputLabel);
        add(outputField);

        // Set up the Morse to text button
        morseToTextButton = new JButton("Morse to Text");
        morseToTextButton.addActionListener(this);
        add(morseToTextButton);

        // Set up the text to Morse button
        textToMorseButton = new JButton("Text to Morse");
        textToMorseButton.addActionListener(this);
        add(textToMorseButton);

        // Set up the USD to EUR button
        usdToEuroButton = new JButton("USD to EUR");
        usdToEuroButton.addActionListener(this);
        add(usdToEuroButton);

        // Set up the EUR to USD button
        euroToUsdButton = new JButton("EUR to USD");
        euroToUsdButton.addActionListener(this);
        add(euroToUsdButton);

        // Show the JFrame
        setVisible(true);
    }

    // This is the actionPerformed() method, which is called when a button is clicked.
    // It handles the button click events and performs the appropriate conversions.
    @Override
    public void actionPerformed(ActionEvent e) {
        CurrencyConverter converter = new CurrencyConverter();
        MorseConverter morseConverter = new MorseConverter();

        if (e.getSource() == morseToTextButton) {
            String input = inputField.getText();
            String output = morseConverter.morseToText(input);
            outputField.setText(output);
        } else if (e.getSource() == textToMorseButton) {
            String input = inputField.getText();
            String output = morseConverter.textToMorse(input);
            outputField.setText(output);
        } else if (e.getSource() == usdToEuroButton) {
            String input = inputField.getText();
            double usd = Double.parseDouble(input);
            double euro = converter.usdToEuro(usd);
            outputField.setText(Double.toString(euro));
        } else if (e.getSource() == euroToUsdButton) {
            String input = inputField.getText();
            double euro = Double.parseDouble(input);
            double usd = converter.euroToUsd(euro);
            outputField.setText(Double.toString(usd));
        }
    }
}
