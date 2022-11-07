/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String secreta = "Eureka";
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
        if (frase.equals(secreta))
           System.out.println("Es correcto");
        else
           System.out.println("Es incorrecto");
    
    }  
}
