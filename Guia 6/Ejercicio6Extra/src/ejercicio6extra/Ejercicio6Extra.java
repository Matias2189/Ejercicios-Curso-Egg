/*
 Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package ejercicio6extra;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio6Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double altura, suma1=0, suma2=0;
        int personajes, contador=0;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese cantidad de personajes");
        personajes=leer.nextInt();
        System.out.println("Ingrese la altura de los personajes");
        
        for (int i = 0; i < personajes; i++) {
            altura=leer.nextDouble();
            if  (altura < 1.6){
                contador++;
                suma1 += altura;        
            }
            suma2 += altura;
        }
        System.out.println("El promedio de estaturas por debajo de los 1.60mts es: "+suma1/contador);
        System.out.println("El promedio general de estaturas es: "+suma2/personajes);
    }
    
}
