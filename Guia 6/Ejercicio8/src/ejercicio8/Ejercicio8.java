/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;



/**
 *
 * @author MATUTE
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       System.out.println("Ingrese una frase: ");
       String frase = leer.nextLine();
       int lon = frase.length();
       if (lon == 8)
          System.out.println("Es correcto");
       else
          System.out.println("Es incorrecto");
    
    }  
}

