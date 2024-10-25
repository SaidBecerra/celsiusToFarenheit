package org.example;
import lombok.Getter;
import javax.swing.*;
import java.awt.*;


public class TemperatureView extends JFrame{
    private JTextField celsiusField = new JTextField(10);
    private JTextField fahrenheitField = new JTextField(10);
    @Getter
    private JButton convertButton = new JButton("Convert");

    public TemperatureView(){
        JPanel jPanel = new JPanel(new GridLayout(2, 2));
        jPanel.add(new JLabel("celsius"));
        jPanel.add(celsiusField);
        jPanel.add(new JLabel("Fahrenheit"));
        jPanel.add(fahrenheitField);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 100);
        this.add(jPanel, BorderLayout.CENTER);
        this.add(convertButton, BorderLayout.SOUTH);
    }

    public String getCelsiusInput(){
        return celsiusField.getText();
    }

    public void setFahrenheitOutput(String fahrenheit){
        fahrenheitField.setText(fahrenheit);
    }
}
