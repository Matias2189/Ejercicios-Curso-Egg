/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9teoria;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio9Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        int suma=0, j=0;
                       
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        do{
            j++;
            num = leer.nextInt();
            if (num == 0){
               System.out.println("Se capturo el numero 0. Se detiene el ingreso");
               break;
            }
             if (num < 0){
                 continue;
            }
            suma += num;
        }while (j < 20);
                 
        System.out.println("La suma de los numeros ingresados es: " + suma);   
    }
    
}