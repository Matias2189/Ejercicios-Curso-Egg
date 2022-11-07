/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9extra;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio9Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num1, num2, residuo=0, cociente=0;
        System.out.println("Ingrese 2 numeros a dividir");
        num1=leer.nextInt();
        num2=leer.nextInt();
        
        while(num1<num2) {
            System.out.println("Ingrese un numero menor que el primero para realizar division");
            num2=leer.nextInt();
        }
        
        do {
            residuo=num1-num2;
            num1=residuo;
            cociente+=1;        
        } while (residuo>=num2);
        System.out.println("El residuo es: "+num1+" y el cociente es: "+cociente); 
    }
    
}
