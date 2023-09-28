
package clase3_array_string;

/**
 *
 * @author vaiop
 */
public class tp3_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //cuestionario 
        
        char letras[] = {'a','b','c','d'};

        int numeros[] = new int[]{1,37,16};

        for(int i=0;i<numeros.length;i++){

            if (numeros[i] < 30) {

                System.out.println(letras[i+1]);

            } else {

            System.out.println(numeros[i]);

            }

        } 
        
        // cuestionario
        
        String frase = "hola que tal?".toUpperCase().replace("hola","chau");

        System.out.println(frase);
        
        // cuestionario
        
        String[] separado = "3_tristes tigres_del_13".split("_");
        
        for (int i = 0; i < separado.length; i++) {
            
            System.out.println(separado[i]);
            
        }
    }
    
}
