/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7teoria;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio7Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int TipoMotor;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de motor para determinar el tipo");        
        TipoMotor = leer.nextInt();
        switch (TipoMotor){
            case 1:
            System.out.println("La bomba es una bomba de agua");
            break;
            case 2:
            System.out.println("La bomba es una bomba de gasolina");
            break;
            case 3:
            System.out.println("La bomba es una bomba de hormigon");
            break;
            case 4:
            System.out.println("La bomba es una bomba de pasta alimenticia");
            break;
            default: 
            System.out.println("no es un  valor valido para tipo de bomba");    
        }
    }
    
}
