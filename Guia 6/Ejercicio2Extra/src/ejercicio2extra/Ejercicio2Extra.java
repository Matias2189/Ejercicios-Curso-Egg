/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2extra;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio2Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c, d, e;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese 4 números enteros");
        a = leer.nextInt();
        b = leer.nextInt();
        c = leer.nextInt();
        d = leer.nextInt();
        
        System.out.println("El número ingresado en A es; " +a);
        System.out.println("El número ingresado en B es; " +b);
        System.out.println("El número ingresado en C es; " +c);
        System.out.println("El número ingresado en D es; " +d);
        
        e=a;
        a=d;
        d=b;
        b=c;
        c=e;
        System.out.println("================================");
        System.out.println("La variable A ahora vale: " +a);
        System.out.println("La variable B ahora vale: " +b);
        System.out.println("La variable C ahora vale: " +c);
        System.out.println("La variable D ahora vale: " +d);
    }
    
}
