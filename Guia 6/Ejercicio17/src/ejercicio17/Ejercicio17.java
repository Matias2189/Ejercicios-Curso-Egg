/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese tamaño de vector");
        int N = leer.nextInt();
        int[] vector=new int [N];
        autorellenar(vector);
        buscarNumero(vector);
    }
    


public static void autorellenar(int[] vector) {
    for (int i = 0; i < vector.length; i++) {
        vector[i]= (int) (Math.random()*100000);
        System.out.print(vector[i]+" ");
    }

}

public static void buscarNumero(int[] vector) {
    int contador1 = 0;
    int contador01 = 0;
    int contador001 = 0;
    int contador0001 = 0;
    int contador00001 = 0;
    for (int i = 0; i < vector.length; i++) {
        if (vector[i]<=9) {
            contador1++;
           
        }
        if (vector[i]>=10 && vector[i]<=99) {
            contador01++;
           
        }
        if (vector[i]>=100 && vector[i]<=999) {
            contador001++;
            
        }
        if (vector[i]>=1000 && vector[i]<=9999) {
            contador0001++;
            
        }
        if (vector[i]>=10000 && vector[i]<=99999) {
            contador00001++;
            
        }
    }
     System.out.println(" ");
     System.out.println("Se encontraron "+contador1+" numero/s de 1 digito");
     System.out.println("Se encontraron "+contador01+" numero/s de 2 digitos");
     System.out.println("Se encontraron "+contador001+" numero/s de 3 digitos");
     System.out.println("Se encontraron "+contador0001+" numero/s de 4 digitos");
     System.out.println("Se encontraron "+contador00001+" numero/s de 5 digitos");
   
}

}

