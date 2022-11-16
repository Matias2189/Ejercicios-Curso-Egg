/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;

import java.util.Scanner;
import numeradores.Tamanio;

/**
 *
 * @author MATIAS
 */
public class Servicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona p;
    Perro pe;

    public Persona generarPersona(ArrayList<Perro> mascotas) {
        p = new Persona();
        String opc="";
        System.out.println("Ingrese nombre");
        p.setNombre(leer.next());
        System.out.println("Ingrese apellido");
        p.setApellido(leer.next());
        System.out.println("Ingrese DNI");
        p.setDni(leer.nextInt());
        System.out.println("Ingrese edad");
        p.setEdad(leer.nextInt());
        System.out.println("Hola " + p.getNombre() + " los perros para adoptar son:");
        System.out.println("");
        for (Perro aux : mascotas) {
            System.out.println(aux);
        }
        System.out.println("");
        do {
            System.out.println("Elije el nombre del que deseas adoptar?");
        String nombre = leer.next();
        for (Perro aux : mascotas) {
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                
                if (aux.isAdopt()) {
                    System.out.println("No se puede adpotar esta mascota, ya esta adoptada");
                    System.out.println("Desea adoptar otro perro?");
                    opc=leer.next();
                } else {
                    p.setMascota(aux);
                    aux.setAdopt(true);
                    opc="no";
                }
            }

        }
        } while (opc.equalsIgnoreCase("si"));
        
        

        return p;
    }

    public Perro generarPerro() {
        pe = new Perro();
        int opc = 0;
        System.out.println("Ingrese nombre del perro");
        pe.setNombre(leer.next());
        do {
            System.out.println("Ingrese tamaño");
            System.out.println("1- Chico");
            System.out.println("2- Mediano");
            System.out.println("3- Grande");
            System.out.println("4- Moloso");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    pe.setTamanio(Tamanio.CHICO);
                    break;
                case 2:
                    pe.setTamanio(Tamanio.MEDIANO);
                    break;
                case 3:
                    pe.setTamanio(Tamanio.GRANDE);
                    break;
                case 4:
                    pe.setTamanio(Tamanio.MOLOSO);
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    ;
            }
        } while (opc < 1 || opc > 4);

        System.out.println("Ingrese la Raza");
        pe.setRaza(leer.next());
        System.out.println("Ingrese la Edad");
        pe.setEdad(leer.nextInt());

        return pe;
    }
}
