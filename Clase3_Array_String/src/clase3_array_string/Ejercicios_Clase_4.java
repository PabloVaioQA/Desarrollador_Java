
package clase3_array_string;

/**
 *
 * @author vaiop
 */
public class Ejercicios_Clase_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //contarLetra("patineta",'a');
        //System.out.println(contarLetra("",'a'));
       int cuenta = 0;
        String unaPalabra ="patineta";
        
        char letra = 'a';
        
        for (int i = 0; i < unaPalabra.length(); i++){

        if( unaPalabra.charAt(i)  == letra){

        cuenta = cuenta + 1;

        }
        
    } 
        
        System.out.println(cuenta);
        
    }
    /*
    public static int contarLetra(String unaPalabra, char letra){

    int cuenta = 0;

    for (int i = 0; i < unaPalabra.length(); i++){

    if( unaPalabra.charAt(i)  == letra){

    cuenta = cuenta + 1;

    }

    }

    return cuenta;

    }
*/
}
