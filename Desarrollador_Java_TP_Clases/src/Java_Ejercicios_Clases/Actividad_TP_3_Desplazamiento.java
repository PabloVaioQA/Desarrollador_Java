package Java_Ejercicios_Clases;

public class Actividad_TP_3_Desplazamiento {

	public static void main(String[] args) {
		
		//2. Genere una clase que tenga los métodos para realizar la codificación y decodificación
        //de un string, dado un número de desplazamiento.
		
		//A-Por ejemplo, con desplazo de 1:
		
		String frase = "hola que tal";
		
		byte[] decodedBytes = frase.getBytes();
		
		
		for(int i = 0 ; i < decodedBytes.length ; i++) {
			
			decodedBytes[i]++;
		}
		
		String otraFrase = new String(decodedBytes);
		
		System.out.println("Frase sin desplazamiento: " + frase);
		System.out.println("Frase con desplazamiento: " + otraFrase);
		
		
		//A-Por ejemplo, con desplazo de 2:
		//Usamos la frase generada en el anterior, y lo corremos un casillero mas
		
		byte[] decodedBytes2 = otraFrase.getBytes();
		
		
		for(int i = 0 ; i < decodedBytes2.length ; i++) {
			
			decodedBytes2[i]++;
		}
		
		
		
		String otraFraseNueva = new String(decodedBytes2);
		
		System.out.println("Frase sin desplazamiento: " + frase);
		System.out.println("Frase sin desplazamiento: " + otraFrase);
		System.out.println("Frase con desplazamiento: " + otraFraseNueva);

	}

}
