/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       
       int[] vector=new int[100];
       //vector.length lo usamos para leer el tamaño del vector
       for (int i=0;i<vector.length;i++){
       vector[i]=i;
       }
       
       for(int j=vector.length-1;j>=0;j--){
           System.out.print(" ,"+vector[j] );
       }
    }
}
    

