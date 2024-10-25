package org.example;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@lombok.NoArgsConstructor

public class TemperatureModel {
    private double celsius;
    public double getFahrenheit(){
        return (celsius * ((double) 9 /5)) + 32;
    }
}