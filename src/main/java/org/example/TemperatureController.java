package org.example;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureController {
    private TemperatureModel model;
    private TemperatureView view;
    public TemperatureController(TemperatureModel model, TemperatureView view){
        this.model = model;
        this.view = view;

        this.view.getConvertButton().addActionListener(new ConvertListener());

    }
    class ConvertListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double celsius = Double.parseDouble(view.getCelsiusInput());
                model.setCelsius(celsius);
                view.setFahrenheitOutput(String.valueOf(model.getFahrenheit()));
            } catch (NumberFormatException ex){
                view.setFahrenheitOutput("Invalid input");
            }
        }
    }
}
