package Java_Ejercicios_Clases;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Actividad_TP_3 {

	public static void main(String[] args) {
		
		//1 - a. Dado un String y una letra, que cuente la cantidad de apariciones de la letra en
	    //el String 
		System.out.println("EJERCICIO 1 A:");
	    Scanner leer = new Scanner(System.in);
	    
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
	    System.out.println("EJERCICIO 1 B:");
		
		Integer numeros[] = {-2,23,0};
		boolean ascendente = true; //false
		
		System.out.println("En que orden lo quiere ordenar? opcion: 1 - (Ascendente) o 2 - (Descendente)");
		int opcion = leer.nextInt();
		if(opcion == 2) {
			ascendente = false;
		}else {
			ascendente = true;
		}
		
		
		if(ascendente) {
			Arrays.sort(numeros);
			
		}else {
			Arrays.sort(numeros, Collections.reverseOrder());
			
		}
		
		for(int elemento : numeros) {
			System.out.println(elemento);
			
		}
		
		//c. dado un vector de números, y un número X, que sume todos los números > X y
		//retorne el resultado
		System.out.println("EJERCICIO 1 C:");
		int[] listaNumeros = {3,15,7,9,2,1,17,13,11,4,10};
        int suma = 0;
        
        System.out.println("Ingrese un numero de 1 a 20 :");
        int x = leer.nextInt();
        
        for (int i = 0; i < listaNumeros.length; i++) {
            if(listaNumeros[i] > x){
                suma += listaNumeros[i];
                System.out.println("Mayor encontrado: " + listaNumeros[i]);
            }
        }
        
        System.out.println("La suma de los numeros mayores a " + x + " es: " + suma);
		
        
        
	}

}
