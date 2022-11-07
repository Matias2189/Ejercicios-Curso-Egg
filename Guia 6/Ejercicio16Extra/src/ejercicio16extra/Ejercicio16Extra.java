/*
 Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package ejercicio16extra;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio16Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        validar(leer);
        
        
    }
    
    public static void validar(Scanner leer) {
        int edad;
        boolean bandera=false;
        String per;
        int cont=1;
        System.out.println("Ingrese cantidad de personas");
        int N = leer.nextInt();
        do {
            System.out.println("Ingrese nombre de la persona");
            per = leer.next();
            System.out.println(per);
            System.out.println("Ingrese edad");
            edad = leer.nextInt();
            System.out.println(edad);
            if (edad<18) {
                System.out.println(per+" es menor de edad");
            }else{
                System.out.println(per+" es mayor de edad");
            }
            System.out.println("Desea seguir consultando?");
            System.out.println("1- SI 2- NO");
            int seg = leer.nextInt();
            System.out.println(seg);
            if (seg == 1){
                bandera=true;
            }else if (seg == 2){
                bandera=false;
            } else{
                System.out.println("OPCION NO VALIDA SE SEGUIRA CONSULTANDO");
            }
            System.out.println(bandera);
            cont++;
        } while ( bandera=false || cont <= N);
    }
    
}
