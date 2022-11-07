/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer    =   new Scanner(System.in);
        System.out.print("Ingrese un limite");
        System.out.print(" ");
        int limite = leer.nextInt();
        int suma = 0;
        do {
            System.out.print("Ingrese un numero");
            int num = leer.nextInt();
            suma += num;
            
        }while (suma <=limite);
        System.out.print("La suma total es: " + suma);
    }
    
}
