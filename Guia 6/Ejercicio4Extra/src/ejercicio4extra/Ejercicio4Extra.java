/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4extra;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio4Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número (entre el 1 y el 10), y lo convertiremos en romano");
        numero = leer.nextInt();
        convertir(numero);
    }
    
    public static void convertir(int numero){
        switch (numero){
            case 1:
                System.out.println("El número " +numero+ " convertido a número romano es I");
                break;
            case 2:
                System.out.println("El número " +numero+ " convertido a número romano es II");
                break;
            case 3:
                System.out.println("El número " +numero+ " convertido a número romano es III");
                break;
            case 4:
                System.out.println("El número " +numero+ " convertido a número romano es IV");
                break;
            case 5:
                System.out.println("El número " +numero+ " convertido a número romano es V");
                break;
            case 6:
                System.out.println("El número " +numero+ " convertido a número romano es VI");
                break;
            case 7:
                System.out.println("El número " +numero+ " convertido a número romano es VII");
                break;
            case 8:
                System.out.println("El número " +numero+ " convertido a número romano es VIII");
                break;
            case 9:
                System.out.println("El número " +numero+ " convertido a número romano es IX");
                break;
            case 10:
                System.out.println("El número " +numero+ " convertido a número romano es x");
                break;
            default:
                System.out.println("Te dijimos entre 1 y 10!!!!!!");
        }
    }