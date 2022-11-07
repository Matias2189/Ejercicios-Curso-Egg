/*
 Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package ejercicio8extra;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio8Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int numero, contador=0, contador2=0, contador3=0;
        boolean bandera=false;
        System.out.println("Ingrese numeros, al ingresar multiplo de 5 se detiene el programa");
        
        do {
            numero=leer.nextInt();
            if (numero < 0){
                continue;
            }
            if (numero%5==0) {
                bandera=true;
                break;
                
            }
            if (numero%2==0 && numero>0) {
                contador2++;
            }else if (numero%2!=0 && numero>0){
                contador3++;
            }
        
        } while (bandera=true);
        System.out.println("La cantidad de numeros pares es: "+contador2);
        System.out.println("La cantidad de numeros impares es: "+contador3);
        System.out.println("La cantidad total de numeros ingresados es: "+(contador2+contador3));
    }
    
}
