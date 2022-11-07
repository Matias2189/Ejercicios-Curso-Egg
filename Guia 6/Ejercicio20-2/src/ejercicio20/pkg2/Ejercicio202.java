/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20.pkg2;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio202 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[][] matriz = new int[3][3];
        matriz = rellenarMatriz(matriz);
        mostrarMatriz(matriz);
        int sumaD, sumaD2, sumaC1, sumaC2, sumaC3;
        sumaD = 0;
        sumaD2 = 0;
        sumaC1 = 0;
        sumaC2 = 0;
        sumaC3 = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    sumaD += matriz[i][j];
                }
                if (i + j == 2) {
                    sumaD2 += matriz[i][j];
                }
                if (j == 0) {
                    sumaC1 += matriz[i][j];
                }
                if (j == 1) {
                    sumaC2 += matriz[i][j];
                }
                if (j == 2) {
                    sumaC3 += matriz[i][j];
                }
            }

        }
        if (sumaD == sumaD2) {
            if (sumaD2 == sumaC1) {
                if (sumaC1 == sumaC2) {
                    if (sumaC2 == sumaC3) {
                        System.out.println("su cuadrado es mágico");
                    }else{System.out.println("su cuadrado no es mágico");}

                }else{System.out.println("su cuadrado no es mágico");}
            }else{System.out.println("su cuadrado no es mágico");}
        }
        else{System.out.println("su cuadrado no es mágico");}
    }

    public static int[][] rellenarMatriz(int[][] matriz) {
        Scanner read = new Scanner(System.in);
        System.out.println("ingrese su cuadrado mágico");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = read.nextInt();
            }
        }
        return matriz;
    }

    public static void mostrarMatriz(int[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
   