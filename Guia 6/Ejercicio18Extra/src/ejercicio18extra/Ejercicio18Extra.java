/*
 Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 */
package ejercicio18extra;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio18Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño de vector");
        int n = leer.nextInt();
        int suma=0;
        int vect[]= new int [n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese valor de posicion "+i);
            vect[i]=leer.nextInt();
            suma+=vect[i];
        }
        System.out.println("La suma del vector es: "+suma);
        
    }
    
}
