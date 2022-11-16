/*
 Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package ejercicio1extraguia9;

import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;
import servicio.Servicios;

public class Ejercicio1ExtraGuia9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Persona> personas = new ArrayList();
        ArrayList<Perro> mascotas = new ArrayList();
        Servicios s1 = new Servicios();
        
        
        System.out.println("Generar perros");
        do {
           mascotas.add(s1.generarPerro());
            System.out.println("Quiere continuar agregando perros? (si/no)");
            
        } while (!leer.next().equalsIgnoreCase("no"));
        
        //para probar si funciona la creacion de perros
       for (Perro aux : mascotas) {
          System.out.println(aux);
        }
       
        System.out.println("");
        System.out.println("-------------------");
        System.out.println("");

        System.out.println("Generar persona");
        do {
           personas.add(s1.generarPersona(mascotas));
            System.out.println("Quiere continuar agregando personas? (si/no)");
            
        } while (!leer.next().equalsIgnoreCase("no"));

        //para probar si funciona la creacion de personas
        for (Persona aux : personas) {
           System.out.println(aux);
        }
        
        
        
        
    }

}
