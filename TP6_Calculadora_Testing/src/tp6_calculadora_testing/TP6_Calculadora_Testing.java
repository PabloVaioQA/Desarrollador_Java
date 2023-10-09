
package tp6_calculadora_testing;

import Entidades.Calculadora;

/**
 *
 * @author vaiop
 */
public class TP6_Calculadora_Testing {

    
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();
        
        //Prueba de calculadora
        System.out.println(calculadora.Suma(10, 2));
        System.out.println(calculadora.Resta(10, 2));
        System.out.println(calculadora.Multiplicacion(10, 2));
        System.out.println(calculadora.Division(10, 2));
    }
    
}
