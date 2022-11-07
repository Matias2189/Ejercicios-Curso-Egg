/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] matrizChica = new int[3][3];
        int[][] matrizGrande = new int[10][10];
        rellenarMatrizGrande(matrizGrande);
        rellenarMatrizChica(matrizChica);
        compararMatrices(matrizChica, matrizGrande);
    }

    public static void rellenarMatrizGrande(int[][] matrizGrande) {
        for (int i = 0; i < matrizGrande.length; i++) {
            for (int j = 0; j < matrizGrande.length; j++) {
                matrizGrande[i][j] = (int) (Math.random() * 10);
                System.out.print("[ " + matrizGrande[i][j] + " ]");
            }
            System.out.println(" ");
        }

    }

    public static void rellenarMatrizChica(int[][] matrizChica) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la matriz pequeña");
        for (int i = 0; i < matrizChica.length; i++) {
            for (int j = 0; j < matrizChica.length; j++) {
                System.out.println("Posicion[" + i + "] [" + j + "]");
                matrizChica[i][j] = leer.nextInt();
                System.out.print("[ " + matrizChica[i][j] + " ]");
            }
            System.out.println(" ");
        }

    }

    public static void compararMatrices(int[][] matrizChica, int[][] matrizGrande) {
        boolean banderita = false;
        for (int i = 0; i < matrizGrande.length; i++) {
            for (int j = 0; j < matrizGrande.length; j++) {
                if (matrizGrande[i][j] == matrizChica[0][0] && i < 8 && j < 8) {
                    if (matrizGrande[i][j] == matrizChica[0][0] && matrizGrande[i][j + 1] == matrizChica[0][1] && matrizGrande[i][j + 2] == matrizChica[0][2]) {
                        if (matrizGrande[i + 1][j] == matrizChica[1][0] && matrizGrande[i + 1][j + 1] == matrizChica[1][1] && matrizGrande[i + 1][j + 2] == matrizChica[1][2]) {
                            if (matrizGrande[i + 2][j] == matrizChica[2][0] && matrizGrande[i + 2][j + 1] == matrizChica[2][1] && matrizGrande[i + 2][j + 2] == matrizChica[2][2]) {
                                System.out.println("Se encontro la matriz pequeña soperutanos!!");
                                for (int k = i; k < i+3; k++) {
                                    for (int l = j; l < j+3; l++) {
                                        System.out.print("La matriz pequeña se encuentra en las coordenadas");
                                        System.out.print(" [" + k + "] [" + l + "] ");
                                    }
                                    System.out.println(" ");
                                }
                                banderita = true;
                                //break;
                            }

                        }

                    }

                }
                if (banderita == true) {
                    break;

                }

            }
            if (banderita == true) {
                break;

            }
        }

        if (banderita == false) {
            System.out.println("No se encontro");
        }
    }
}
