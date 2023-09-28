
package clase3_array_string;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class Clase3_Array_String {

    public static void main(String[] args) {
    
    //1 - a. Dado un String y una letra, que cuente la cantidad de apariciones de la letra en
    //el String 
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
        System.out.println("Escriba una palabra: ");
        String palabra = leer.nextLine();
        System.out.println("Que letra desea buscar y contar ?");
        String letra = leer.nextLine();
        char buscar = letra.charAt(0);
        int contador = 0;
        
        for (int i = 0; i < palabra.length(); i++) {
            
            if(palabra.charAt(i) == buscar ){
             contador ++;   
            }
        }
        System.out.println("Palabra: " + palabra);
        if(contador > 0){
            System.out.println("La letra: >>" + buscar + "<< Esta " + contador + " Veces en la palabra" );
        }else{
            System.out.println("La letra: >>" + buscar + "<< NO se encontro en la palabra" );
        }
        
        
    
    //b. Dados 3 números y un orden (ascendente o decreciente) que ordene los
    //mismos y los retorne en un vector de 3
    
    //c. dado un vector de números, y un número X, que sume todos los números > X y
    //retorne el resultado
    
    
    
    
    }
    
}
