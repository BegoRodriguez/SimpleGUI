package org.example;

public class ConversorMoneda {
    private final double CAMBIO_EUROS_PESETAS = 166.386;

    public double eurosAPesetas(double euros) {
        return euros * CAMBIO_EUROS_PESETAS;
    }

    public double pesetasAEuros(double pesetas) {
        return pesetas / CAMBIO_EUROS_PESETAS;
    }
}
