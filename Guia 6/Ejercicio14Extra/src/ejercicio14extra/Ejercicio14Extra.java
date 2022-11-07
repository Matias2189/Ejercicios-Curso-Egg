/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14extra;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio14Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         double n, m;
         System.out.println("Ingrese cantidad de familias");
         n = leer.nextInt();
         System.out.println("Ingrese cantidad de hijos");
         m = leer.nextInt();
         double promedio=m/n;
         System.out.println("El promedio de hijos por familia es de: "+promedio);
                 
         
    }
    
}
