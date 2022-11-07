/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();

        String respuesta = " ";
        do {
            
            System.out.println("Ingrese una opcion, 1= sumar, 2= restar, 3= multiplicar, 4= dividir, 5= salir");
            int num3 = leer.nextInt();

            switch (num3) {
                case 1:
                    System.out.println("La suma de los numeros es igual a :" + (num1 + num2));
                    continue;
                case 2:
                    System.out.println("La resta de los numeros es igual a :" + (num1 - num2));
                    continue;
                case 3:
                    System.out.println("La multiplicacion de los numeros es igual a :" + (num1 * num2));
                    continue;
                case 4:
                    double division=num1/num2;                      
                    System.out.println("La division de los numeros es igual a :" + (division));
                    continue;
                case 5:
                    System.out.println("Desea salir, responder S/N");
                    respuesta = leer.next();
                                       
                     
                   
                    
            }
             
             
        }while (!respuesta.equalsIgnoreCase("s"));
            
            System.out.println("Gracias vuelva prontos.");
    }       
    

    }