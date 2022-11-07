/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1extra;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio1Extra {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        int minutos;
        double dias,horas;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de minutos a convertir");
        minutos = leer.nextInt();
        
        horas = minutos/60;
        
        dias= Math.round(horas/24);
        if (dias >= 1){
            horas = Math.floor(horas - (24*dias));
        }
        System.out.println(minutos + " minutos convertidos son: "+dias+" dias, y " +horas+ "horas");
    }
    
}

