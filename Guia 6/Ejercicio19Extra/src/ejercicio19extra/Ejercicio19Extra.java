/*
 Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
package ejercicio19extra;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio19Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño de vectores");
        int n = leer.nextInt();
        int vect1[]= new int [n];
        int vect2[]= new int [n];
        for (int i = 0; i < n; i++) {
            vect1[i]= (int)(Math.random()*10);
            vect2[i]=(int)(Math.random()*10);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(vect1[i]);
            System.out.println(vect2[i]);
            if (vect1[i]!= vect2[i]) {
                System.out.println("los vectores no son iguales");
                break;
            }else{
                System.out.println("Los vectores son iguales");
            }
        }
    }
    
}
