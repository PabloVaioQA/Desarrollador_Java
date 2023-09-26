package miprimerproyecto;

public class Ej01 {

	public static void main(String[] args) {
		
		//A
		System.out.println("Ejercicio 1 Punto A");
		int numeroInicio = 5;
		int numeroFin = 14;
		
		while(numeroInicio <= numeroFin) {
			System.out.println(numeroInicio);
			numeroInicio++;
		}
		
		//B
		System.out.println("Ejercicio 1 Punto B");
		int numeroIn = 5;
		int numeroFi = 14;
		
		while(numeroIn <= numeroFi) {
			
			if(numeroIn%2 == 0) {
			System.out.println(numeroIn);
			}
			numeroIn++;
		}
		
		//C
		System.out.println("Ejercicio 1 Punto C");
		int numeroI = 5;
		int numeroF = 14;
		boolean mostrarPares = true; // Cambiar el valor a 'false' si deseas mostrar los impares

		//int i = numeroI;
		while (numeroI <= numeroF) {
			
		    if ((numeroI % 2 == 0 && mostrarPares) || (numeroI % 2 != 0 && !mostrarPares)) {
		        System.out.println(numeroI );
		    }
		    numeroI++;
		}
		
		//D
		System.out.println("Ejercicio 1 Punto D");
		
		for(int i=14; i >= 5; i = i - 2) {
			
			System.out.println(i);
		}
		
		
		//Ejercicio 2
		System.out.println("Ejercicio 2 - Segmento de Ingresos");
		
		float ingresosMensuales = 740000;
		int vehiculos = 3 ;
		int inmuebles = 1;
		boolean embarcacion = false; 
		
		System.out.println("Familia 1");
		System.out.println("Ingresos: 740.000 / Vehiculos: 3 / Inmuebles: 1 / Embarcación = No");
		/*********************************************/
		
		if ( (ingresosMensuales >= 489083) || ( vehiculos >= 3) || (inmuebles >= 3) || (embarcacion == true) ) {
		System.out.println("Pertenece a Categoría de Ingresos ALTOS");
		} 
		

		
	}

}
