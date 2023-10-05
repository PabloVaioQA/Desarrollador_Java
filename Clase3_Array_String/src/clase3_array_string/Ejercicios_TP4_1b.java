package clase3_array_string;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class Ejercicios_TP4_1b {

    
    public static void main(String[] args) {
        
        // b- haga lo mismo, pero solicitando los parámetros de a uno por consola
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese 3 numeros");
        
        System.out.println("Ingrese primer numero: ");
        Integer nu1 = leer.nextInt();
        System.out.println("Ingrese segundo numero: ");
        Integer nu2 = leer.nextInt();
        System.out.println("Ingrese tercer numero: ");
        Integer nu3 = leer.nextInt();
        
        Integer[] numeros2 = {nu1,nu2,nu3};
        
        System.out.println("Como desea ordenarlos? Ascendente(opcion A) Descendente (opcion D)");
        String letra2 = leer.next().toUpperCase();
        
        ordenar(numeros2,letra2);
    }
    
    
    //Funcion para ordenar
    
    public static void ordenar(Integer[] numeros, String letra){
        
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
