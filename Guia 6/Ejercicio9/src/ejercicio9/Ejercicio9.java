/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
        String letra = frase.substring(0, 1);
        if ("A".equalsIgnoreCase(letra))
            System.out.println("Correcto");
        else
            System.out.println("Incorrecto");
                
    }
    
}
