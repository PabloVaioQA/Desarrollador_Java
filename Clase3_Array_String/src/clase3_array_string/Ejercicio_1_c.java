package clase3_array_string;

import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class Ejercicio_1_c {

 
    public static void main(String[] args) {
        
        //c. dado un vector de números, y un número X, que sume todos los números > X y
        //retorne el resultado
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        
        int[] numeros = {3,15,7,9,2,1,17,13,11,4,10};
        int suma = 0;
        
        System.out.println("Ingrese un numero de 1 a 20 :");
        int x = leer.nextInt();
        
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > x){
                suma += numeros[i];
                System.out.println("Mayor encontrado: " + numeros[i]);
            }
        }
        
        System.out.println("La suma de los numeros mayores a " + x + " es: " + suma);
        
        
    }
    
}
