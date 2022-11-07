/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5extra;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio5Extra {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String clase;
        boolean resp = false;
        System.out.println("Clase de socio:");
        System.out.println("Socio Mayor - (A)");
        System.out.println("Socio Moderado - (B)");
        System.out.println("Socio Comun - (C)");
        System.out.println("Ingrese A, B o C:");
        do{
        clase = leer.next();
        clase = clase.toUpperCase();
        if(clase.equals("A")||clase.equals("B")||clase.equals("C")){
            resp = false;
            break;
        }else
                System.out.println("Solo A, B o C...");
        
        }while(resp = true);
    Obra(clase,leer);
    }
    
    public static void Obra(String clase, Scanner leer){
        System.out.println("Ingrese el importe para el tratamiento:");
        double importe = leer.nextDouble();
        clase=clase.toUpperCase();
        System.out.println("");
        switch(clase){
            case "A":
                System.out.println("Su tratamiento tendra un 50% de descuento");
                System.out.println("Importe = $ "+(importe-(importe*0.50)));
                break;
            case "B":
                System.out.println("Su tratamiento tendra un 35% de descuento");
                System.out.println("Importe = $ "+(importe-(importe*0.35)));
                break;
            case "C":
                System.out.println("Su tratamiento no tendra descuento");
                System.out.println("Importe = $ "+importe);
                break;
        }
    }
}