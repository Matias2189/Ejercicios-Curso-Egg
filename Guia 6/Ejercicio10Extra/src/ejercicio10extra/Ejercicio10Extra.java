/*
 Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package ejercicio10extra;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio10Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int respuesta; 
        int numero1 = (int)(Math.random()*10)+1;
        int numero2 = (int)(Math.random()*10)+1;
        int resultado = numero1*numero2;
        System.out.println(resultado); //(para mostrar el resultado y ver si el programa rompe el bucle)
        System.out.println("Adivina el resultado de la multiplicacion que realizo el programa...");
        respuesta=leer.nextInt();
        while (resultado!=respuesta){
            System.out.println("INCORRECTO! Intenta nuevamente:");
            respuesta=leer.nextInt();
            
        } 
        System.out.println("ADIVINASTE!!!");
    }
    
}
