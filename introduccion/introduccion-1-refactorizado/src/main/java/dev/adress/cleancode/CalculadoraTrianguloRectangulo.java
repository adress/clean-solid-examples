package dev.adress.cleancode;

public class CalculadoraTrianguloRectangulo {

    // tanto las clase como el metodo y las variables son dicientes mejorando
    // el entendimiento de su funcionalidad
    public Double calcularArea(Double hipotenusa, Double cateto) {
        Double cateto_2 = Math.sqrt(hipotenusa*hipotenusa - cateto*cateto);

        return cateto * cateto_2 / 2;
    }
}
