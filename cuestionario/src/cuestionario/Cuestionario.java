
package cuestionario;

/**
 *
 * @author vaiop
 */
public class Cuestionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int i = 6;

        while(i > 0) {

                if (i < 3) {

                    i = i + 1;

                }

            i = i - 2;

            System.out.println(i);

        }
        
        String[] separado = "3_tristes tigres_del_13".split("_");
        
        for (int j = 0; j < separado.length; j++) {
            System.out.println(separado[j]);
        }
        
        
        
        System.out.println(contarLetra("",'a'));
        contarLetra("Programacion",'a');
        
        "hola que tal?".toUpperCase().replace("hola","chau");
        System.out.println("hola que tal?".toUpperCase().replace("hola","chau"));
        
    }
    
    public static int contarLetra(String unaPalabra, char letra){

    int cuenta = 0;

    for (int i = 0; i<unaPalabra.length(); i++){

            if( unaPalabra.charAt(i)  == letra){

            cuenta = cuenta + 1;

            }
    
    }

    return cuenta;

    }
    
    
}
