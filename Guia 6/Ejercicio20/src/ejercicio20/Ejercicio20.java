/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

/**
 *
 * @author MATUTE
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int[][] matriz = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        mostrarMatriz(matriz);
        compararMatriz(matriz);
    }

    public static void mostrarMatriz(int matriz[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("==================");
    }

    public static void compararMatriz(int matriz[][]) {
        boolean bandera = false;
        int sumaDiag1 = 0, sumaDiag2 = 0;
        int sumaFila = 0, sumaColumna = 0;
        int[] sumaf1 = new int[3];
        int[] sumac1 = new int[3];
        for (int i = 0; i < 3; i++) {
            sumaFila = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila = sumaFila + matriz[i][j];

            }
            System.out.println("La suma de la fila " + (i + 1) + " es " + sumaFila);

            System.out.println("");

            sumaf1[i] = sumaFila;
        }
        for (int j = 0; j < 3; j++) {
            sumaColumna = 0;
            {
                for (int i = 0; i < 3; i++) {
                    sumaColumna = sumaColumna + matriz[i][j];
                }
                System.out.println("La suma de la columna " + (j + 1) + " es " + sumaColumna);
            }

            System.out.println("");

            sumac1[j] = sumaColumna;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sumaDiag1 = sumaDiag1 + matriz[i][j];
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i + j == 2) {
                    sumaDiag2 = sumaDiag2 + matriz[i][j];
                }
            }
        }

        System.out.println("La suma de la diagonal principal es: " + sumaDiag1);
        System.out.println("");
        System.out.println("La suma de la diagonal invertida es: " + sumaDiag2);
        System.out.println("");
        for (int i = 0; i < 3; i++) {

            if ((sumac1[i] == sumaf1[i]) && (sumaDiag1 == sumaDiag2) && (sumac1[i] == sumaDiag1)) {
                bandera = true;  
            
            }else
                bandera = false;
                break;
        
        
        }

        if (bandera == true) {
            System.out.println("La matriz es Magica!!");
                
        } else {
            System.out.println("La matriz no es magica sos un gil saludos!!");
        }
    }
}
