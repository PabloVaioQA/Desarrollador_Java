package clase3_array_string;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejercicios_TP4_2_Archivo {
    //Haga una main donde por parámetro envíe la ruta de un archivo. Ese archivo debe
    //    contener números. El programa debe escribir por consola la suma de esos números
    // a. Al programa anterior agreguele un parámetro para que la operación pueda ser
    //    suma o multiplicación
    
    
    public static void main(String[] args) throws IOException {
        
        System.out.println("");    
    try {
            String archivo = "C:\\Users\\vaiop\\OneDrive\\Documentos\\Pato\\UTN-Neoris\\Tp2\\Git-Pablo\\Desarrollador_Java\\Clase3_Array_String\\src\\archivosDeTexto\\numeros.txt";
            int sumaNumeros = 0;
            int multNumeros = 1;
            String opcion = "M";

            for (String linea : Files.readAllLines(Paths.get("C:\\Users\\vaiop\\OneDrive\\Documentos\\Pato\\UTN-Neoris\\Tp2\\Git-Pablo\\Desarrollador_Java\\Clase3_Array_String\\src\\archivosDeTexto\\numeros.txt"))) {
                System.out.println(linea);
                
                String numeros[] = linea.split(",");
                
                if(opcion.equals("S")){
                    for (String num : numeros) {
                    sumaNumeros = sumaNumeros + Integer.parseInt(num);
                    }
                    System.out.println(sumaNumeros);
                }else if(opcion.equals("M")){
                    for (String num : numeros) {
                    multNumeros = multNumeros * Integer.parseInt(num);
                    }
                    System.out.println(multNumeros);
                }else{ System.out.println("Letra Incorrecta");
                }
            }
           
        }
    
    catch(FileNotFoundException e){
            System.out.println("El Archivo solicitado no ha sido encontrado" + e.getMessage());
    }
    catch(IOException IOe){
            System.out.println("El Archivo solicitado no se pudo abrir o cerrar" + IOe.getMessage());
    }
    }
}

