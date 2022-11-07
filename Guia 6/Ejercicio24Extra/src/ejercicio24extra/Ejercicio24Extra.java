/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio24extra;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio24Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño de vector");
        int n = leer.nextInt();
        int aux=0;
        int[] vector = new int [n];        
        for (int i = 1; i < n; i++) {
            if (i==1 || i==0) {
                vector[i]=1;
            }else{
                vector[i]=vector[i-1]+vector[i-2];
            }
        System.out.print("["+vector[i]+"]");
        }
    }
}
    
    

