/*
 El matemático indio Dattaraya Ramchandra Kaprekar descubrió en 1949 una curiosa característica del número 6174. Hoy, se conoce a dicho número como constante de Kaprekar en honor a él.

El número es notable por la siguiente propiedad:

Elige un número de cuatro dígitos que tenga al menos dos diferentes (es válido colocar el dígito 0 al principio, por lo que el número 0009 es válido).
Coloca sus dígitos en orden ascendente y en orden descendente para formar dos nuevos números. Puedes añadir los dígitos 0 que necesites al principio.
Resta el menor al mayor.
Vuelve al paso 2.
A este proceso se le conoce como la rutina de Kaprekar, y siempre llegará al número 6174 en, como mucho, 7 iteraciones. Una vez en él, el proceso no avanzará, dado que 7641 − 1467 = 6174.

Por ejemplo, el número 3524 alcanzará la constante de Kaprekar en 3 iteraciones:

5432 − 2345 = 3087
8730 − 0378 = 8352
8532 − 2358 = 6174

Los únicos dígitos de cuatro cifras para los que la rutina de Kaprekar no alcanza el número 6174 son los repdigits, es decir aquellos cuyas cuatro cifras son iguales (como 1111), pues en la primera iteración se alcanzará el valor 0 y no podrá salirse de él. Es por esto que en el paso 1 se pedía explícitamente que el número inicial tuviera al menos dos dígitos diferentes.

El resto de los números de cuatro cifras terminarán siempre en el número 6174.

Entrada
La primera línea de la entrada contendrá el número de casos de prueba. Cada uno contendrá, en una única línea, un número a comprobar.

Salida
Para cada caso de prueba, el programa indicará el número de vueltas que se debe dar a la rutina de Kaprekar para alcanzar el 6174. Para los números repdigits deberá escribir 8. Para la propia constante de Kaprekar deberá indicar 0.
 */
package ejerciciologicakaprekar;

import java.util.Scanner;
import java.util.Arrays;

public class EjercicioLogicaKaprekar {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int kapre[] = new int[num];
        int numeros[] = new int[4];
        
        for (int i = 0; i < num; i++) {
            kapre[i] = input.nextInt();
            int cont = 0;
            int aux = kapre[i];
            

            do {
                if (aux==6174) {
                break;
            }
                int asc=0,des=0;
            //1234 numero ingresado
            for (int j = 0; j < 4; j++) {
                //Primer vuelta
                // 1234 % 10 = 4
                // aux -> 123
                //numeros [0] = 4
                //Segunda vuelta ...
                numeros[j] = aux % 10;
                aux /= 10;
            }
            Arrays.sort(numeros);
            for (int j = 0; j < 4; j++) {
                if (j<3) {
                   asc+=numeros[j];
                   asc *= 10; 
                } else {
                    asc+=numeros[j];
                }    
            }
            
            for (int j = 3; j >= 0; j--) {
                if (j>0) {
                   des+=numeros[j];
                   des *= 10; 
                } else {
                    des+=numeros[j];
                }
            }  
            aux = des - asc;
            cont ++;
                if (aux==0) {
                    cont = 8;
                    aux = 6174;
                }
            } while (aux!=6174);
            System.out.println(cont);
        }

    }

}