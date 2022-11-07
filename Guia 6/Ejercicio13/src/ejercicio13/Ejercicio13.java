
package ejercicio13;

import java.util.Scanner;


public class Ejercicio13 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese tamaño de cuadrado: ");
        num = leer.nextInt();
        for (int i = 1; i <= num ; i++) {
            
            for (int j = 1; j <= num; j++) {
                if  (i == 1 || i == num || j == num || j == 1){
                    System.out.print(" *");
                    
                }else {
                    System.out.print("  ");
                    
                } 
            }
            System.out.println(" ");
        }
    }
    
}
