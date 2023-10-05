
package ejercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class Ejercicio_1_b {
    public static void main(String[] args) {

    //b. Dados 3 números y un orden (ascendente o decreciente) que ordene los
    //mismos y los retorne en un vector de 3
    
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    Integer numeros[] = {-7,22,4};
    
    
    System.out.println("Como desea ordenarlo Ascendente o Decreciente ? (Ingrese Opciones A/D)");
    String orden = leer.next();
    
    Arrays.sort(numeros);
    
    if(orden.equals("A")){
        
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
    }else if(orden.equals("D")){
        
        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.println(Arrays.toString(numeros));
        
    }else{
        System.out.println("Opcion no valida");
    }
    
    
    
    }
}
