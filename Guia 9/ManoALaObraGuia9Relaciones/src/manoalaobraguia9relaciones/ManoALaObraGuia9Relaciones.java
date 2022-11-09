/*
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package manoalaobraguia9relaciones;

import entidades.DNI;
import entidades.Persona;


public class ManoALaObraGuia9Relaciones {

   
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setDoc(new DNI('A', 34290814));
        System.out.println(p1.getDoc());
    }
    
}
