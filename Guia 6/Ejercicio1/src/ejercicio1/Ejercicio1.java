/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner (System.in); 
    System.out.println("Ingresa 2 numeros a sumar");
    //int tipo de datos: enteros
    int num1 = leer.nextInt();
    int num2 = leer.nextInt();
    
    System.out.println("La suma de ambos numeros es: " + (num1 + num2));
    }
    
}
