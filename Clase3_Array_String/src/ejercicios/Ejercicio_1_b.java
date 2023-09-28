
package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author vaiop
 */
public class Ejercicio_1_b {
    

   

    //b. Dados 3 números y un orden (ascendente o decreciente) que ordene los
    //mismos y los retorne en un vector de 3
    
    public void ejercicio(){
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    int num1,num2,num3;
    
    System.out.println("Escriba 3 numeros ");
    num1 = leer.nextInt();
    num2 = leer.nextInt();
    num3 = leer.nextInt();
    
    int[] numeros = {num1,num2,num3};
    
    System.out.println("Como desea ordenarlo Ascendente o Decreciente ? (Ingrese Opciones A/D)");
    String orden = leer.next();
    
    Arrays.sort(numeros);
    
    int[] descendente = new int[3];
    
    if(orden.equals("A")){
        
        System.out.println(Arrays.toString(numeros));
        
    }else if(orden.equals("D")){
        
        for (int i = numeros.length; i > 0 ; i--) {
            
        }
    
    }else{
        System.out.println("Opcion no valida");
    }
    
    
    
    }
}
