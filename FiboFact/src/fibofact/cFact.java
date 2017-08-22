/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibofact;

/**
 *
 * @author Diego Herrera y Ángel Hernández Velazquez
 * @version: 2.0
 */
public class cFact {
//Constructor
    public cFact() {

    }
//Metodo para calcular Factorial
    public String Fact(double numero) {
        double num;
        num = numero;
        double re = 1;
        String Resul = "";
        if (num > 100) {
            Resul = "No se puede calcular";
            return Resul;
        } else {
            for (double i = 1; i < num; i++) {
                re = re * (i + 1);
            }
            Resul =Double.toString(re);
            return Resul;
        }

    }

}
