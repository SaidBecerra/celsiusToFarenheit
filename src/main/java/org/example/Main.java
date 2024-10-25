package org.example;

public class Main {
    public static void main(String[] args) {
        TemperatureModel model = new TemperatureModel();
        TemperatureView view = new TemperatureView();
        TemperatureController controller = new TemperatureController(model, view);
        view.setVisible(true);
    }
}