/*
 Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package ejercicio15extra;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio15Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        double resultado=0;
        System.out.println("Ingrese 2 numeros para realizar una operacion:");
        num1=leer.nextInt();
        num2=leer.nextInt();
        System.out.println("Ingrese que operación desea realizar: ");
        System.out.println("1- Sumar 2- Restar 3- Multiplicar 4- Dividir 5- Salir");
        int opc = leer.nextInt();
        switch (opc) {
            case 1:
                Sumar(num1,num2,resultado, leer);
                break;
            case 2:
                Restar(num1, num2,resultado, leer);
                break;
            case 3:
                Multiplicar(num1, num2,resultado, leer);
                break;
            case 4:
                Dividir(num1, num2,resultado, leer);
                break;
            case 5:
                System.out.println("Gracias vuelva prontos!");
                break;
        }
          
    }
    


public static void Sumar(int num1,int num2,double resultado, Scanner leer) {
        
        resultado=num1+num2;
        System.out.println("El resultado de la suma es: "+resultado);
    }

public static void Restar(int num1,int num2,double resultado, Scanner leer) {
        
        resultado=num1-num2;
        System.out.println("El resultado de la resta es: "+resultado);
    }

public static void Multiplicar(int num1,int num2,double resultado, Scanner leer) {
        
        resultado=num1*num2;
        System.out.println("El resultado de la multiplicacino es: "+resultado);
    }

public static void Dividir(int num1,int num2,double resultado, Scanner leer) {
        
        resultado=num1/num2;
        System.out.println("El resultado de la division es: "+resultado);
    }
    
}