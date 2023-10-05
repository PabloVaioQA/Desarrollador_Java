
package clase3_array_string;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Ejercicios_TP4 {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {
        
        // a. haga un main, donde por parámetro ponga 3 números y una letra que
        // represente ascendente o descendente y los muestre ordenados por tal criterio
        // ascendente(a) descendente(d)
        
        Integer numeros[] = {22,6,14};
        String letra = "A"; //poner D para descendente
        
        ordenarNum(numeros, letra);
       
    }
    
    //Funcion para ordenar
    
    public static void ordenarNum(Integer[] numeros, String letra){
        
        if (letra.equals("A")) {
            Arrays.sort(numeros);
            System.out.println(Arrays.toString(numeros));
        } else if (letra.equals("D")) {

            Arrays.sort(numeros, Collections.reverseOrder());
            System.out.println(Arrays.toString(numeros));

        } else {
            System.out.println("Opcion no valida");
        }
   }
}
