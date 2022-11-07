/*
 Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package ejercicio12extra;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio12Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String num1="", num2="", num3="";
        int contador=0;
        //String numCadena= String.valueOf(3);
        
                    
            for (int i = 0; i < 10; i++) {
                 
                    num1=Integer.toString(i);
                    if (i==3) {
                        num1 = "E";
                      }  
                 
                   
              
                for (int j = 0; j < 10; j++) {
                    
                   num2=Integer.toString(j);
                   if (j==3) {
                        num2 = "E";
                        
                    } 
                    for (int k = 0; k < 10; k++) {
                    
                   num3=Integer.toString(k);
                   if (k==3) {
                        num3 = "E";
                        
                    } 
                     
                System.out.println(num1+"-"+num2+"-"+num3);
                } 
                
                }
                
            } 
            
            
        
        
    }
         
}
