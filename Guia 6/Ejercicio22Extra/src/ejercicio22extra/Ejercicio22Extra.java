/*
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
 */
package ejercicio22extra;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio22Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese tamaño de Matriz");
        int n = leer.nextInt();
        int m = leer.nextInt();
        int suma=0;
        int Mat[][]= new int [n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                
            Mat[i][j]= (int)(Math.random()*10);
            //System.out.print(Mat[i][j]);
            suma+=Mat[i][j];
            }
           // System.out.println(" ");
        }
        System.out.println("La suma del vector es: "+suma);
        
    }
    
}