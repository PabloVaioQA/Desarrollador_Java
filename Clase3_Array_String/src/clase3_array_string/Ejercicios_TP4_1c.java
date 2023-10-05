package clase3_array_string;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicios_TP4_1c {

    
    public static void main(String[] args) {
        // c- lo mismo, pero usando los parámetros si hay alguno (como en a) y haciendo (b)
        // si no detecta ninguno. Vea si con una función puede evitar repetir código
        
        
    }
    
    //Funcion para rellenar el vector
    
    public static void rellenarVector(Integer numeros[]){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] == null){
                numeros[i]= leer.nextInt();
            }
        }
    
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
