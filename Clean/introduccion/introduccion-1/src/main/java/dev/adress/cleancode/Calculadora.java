package dev.adress.cleancode;

public class Calculadora {
    //Clase, metodo y variables poco dicentes de su funcionalidad
    public Double calcular(Double a, Double b) {
        Double d = Math.sqrt(a * a - b * b);

        return b * d / 2;
    }
}