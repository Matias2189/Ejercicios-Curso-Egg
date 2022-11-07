/*
 Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
        int[][] matriz = {{3, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int[][] matrizT = new int[3][3];
        Scanner leer = new Scanner(System.in);
        //llenarMatriz(matriz, leer);
        mostrarMatriz(matriz);
        //hacerMatrizT(matriz, matrizT);
        mostrarMatrizT(matriz);
        comparaMatriz(matrizT, matriz);
    }
   // public static void llenarMatriz(int matriz[][], Scanner leer) {
       // System.out.println("Ingrese los 9 numeros de la Matriz");
        //for (int i = 0; i < matriz.length; i++) {
           // for (int j = 0; j < matriz.length; j++) {
                //System.out.print("Matriz [" + (i + 1) + "][" + (j + 1) + "] = ");
                //matriz[i][j] = leer.nextInt();
           // }
       // }
   // }
    public static void mostrarMatriz(int matriz[][]) {
        System.out.println("==== Matriz Principal =====");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    //public static void hacerMatrizT(int matriz[][], int matrizT[][]) {

        //for (int i = 0; i < matriz.length; i++) {
            //for (int j = 0; j < matriz.length; j++) {
               // matrizT[i][j] = matriz[j][i];
          //  }
       // }
   // }
    public static void mostrarMatrizT(int matriz[][]) {
        System.out.println("==== Matriz Transpuesta ====");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println("");
        }
    }
    public static void comparaMatriz(int matrizT[][], int matriz[][]) {
        boolean bandera = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] + matriz[j][i] == 0) {
                    bandera = true;
                } 
                if (matriz[i][j] + matriz[j][i] != 0){
                    bandera = false;
                  
                }
            }if (bandera=false);
            break;
        }
        System.out.println("");
        if (bandera == true) {
            System.out.println("La Matriz es Antisimetrica");
        } else {
            System.out.println("La Matriz no es Antisimetrica");
        }
        System.out.println("");
    }

}