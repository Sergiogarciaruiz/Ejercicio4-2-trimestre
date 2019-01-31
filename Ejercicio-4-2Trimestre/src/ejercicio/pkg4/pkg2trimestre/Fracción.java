/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4.pkg2trimestre;

/**
 *
 * @author Usuario DAM 1
 */
public class Fracción {

    private double Numerador;
    private double Denominador;

    public Fracción() {
        this.Denominador = 5;
        this.Numerador = 10;
    }

    public Fracción(double Numerador, double Denominador) {
        this.Numerador = Numerador;
        this.Denominador = Denominador;
    }

    public double getNumerador() {
        return Numerador;
    }

    public void setNumerador(double Numerador) {
        this.Numerador = Numerador;
    }

    public double getDenominador() {
        return Denominador;
    }

    public void setDenominador(double Denominador) {
        this.Denominador = Denominador;
    }

    @Override
    public String toString() {
        return "Fracci\u00f3n{" + "Numerador=" + Numerador + ", Denominador=" + Denominador + '}';
    }

    public double inversion() {
        double aux = 0;
        aux = Numerador;
        Numerador = Denominador;
        Denominador = aux;
        return 0;
    }

   public double suma() {
        double suma;
        suma = Numerador + Denominador;
        return suma;
    }

    public double resta() {
        double resta;
        resta = Numerador - Denominador;
        return resta;
    }

    public double multiplicacion() {
        double multi;
        multi = Numerador * Denominador;
        return multi;
    }

    public double division() {
        double div;
        div = Numerador / Denominador;
        return div;
    }
}


