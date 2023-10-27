package org.example;

import Entidad.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class GestorPersonas
{
    public static void main( String[] args ) {

        List<Persona> personas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean cargarMas = true;
        while (cargarMas) {
            Persona nuevaPersona = new Persona();

            System.out.print("Ingrese nombre: ");
            nuevaPersona.setNombre(scanner.nextLine());

            System.out.print("Ingrese apellido: ");
            nuevaPersona.setApellido(scanner.nextLine());

            System.out.print("Ingrese fecha de nacimiento: ");
            nuevaPersona.setFechaNacimiento(scanner.nextLine());

            personas.add(nuevaPersona);

            System.out.print("¿Desea cargar otra persona? (S/N): ");
            String respuesta = scanner.nextLine().toUpperCase();
            cargarMas = respuesta.equals("S");
        }

        System.out.println("\nListado de personas:");
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre() + ", Apellido: " + persona.getApellido() + ", Fecha de nacimiento: " + persona.getFechaNacimiento());
        }
    }

}
