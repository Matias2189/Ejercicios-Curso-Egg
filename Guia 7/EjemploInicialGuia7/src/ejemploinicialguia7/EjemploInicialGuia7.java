/*
 RED SOCIAL PARA MASCOTTAS
 */
package ejemploinicialguia7;

import ejemploinicialguia7.entidades.Mascota;

import java.util.Scanner;

/**
 * @author MATI
 */
public class EjemploInicialGuia7 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Mascota m1 = new Mascota("Morgan", "Chiquito", "perro");
       
       m1.setNombre("Pepe chiquito");
       

        
//si no pongo valores en los objetos pone valores por defecto
        System.out.println(m1);
    }

}
