/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese temperatura en ºC");
        int grados = leer.nextInt();
        int faren = 32 + (9 * grados/5);
        System.out.println("La temperatura en ºF es de: "+faren+"ºF");
    }
    
}
