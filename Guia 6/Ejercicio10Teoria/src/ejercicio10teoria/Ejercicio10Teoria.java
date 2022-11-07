/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10teoria;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio10Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 4 numeros entre 1 y 20");
        for (int i = 0; i < 4; i++) {
            num = leer.nextInt();
            System.out.print("");
            System.out.print(num);
            for (int j = 0; j < num; j++) {
            System.out.print("*");
        }
           System.out.println(""); 
        }
    }
    
}
