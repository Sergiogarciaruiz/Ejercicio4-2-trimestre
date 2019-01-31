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
public class Ejercicio42Trimestre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fracción Calculo = new Fracción();
        System.out.println(Calculo.toString());
        Calculo.inversion();
        System.out.println(Calculo.toString());
        System.out.println(Calculo.division());
        System.out.println(Calculo.multiplicacion());
        System.out.println(Calculo.suma());
        Calculo.inversion();
        System.out.println(Calculo.resta());

    }

}
