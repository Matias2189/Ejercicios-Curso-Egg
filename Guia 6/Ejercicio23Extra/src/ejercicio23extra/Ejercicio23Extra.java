/*
 Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */
package ejercicio23extra;

import java.util.Scanner;

/**
 *
 * @author MATUTE
 */
public class Ejercicio23Extra {

    /**
     * @param args the command line arguments
     */
  /*  public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] Matriz = new String[20][20];
        String palabra="";
        int cont=0;
        do {
            System.out.println("Ingrese una palabra de 3 a 5 caracteres");
            palabra=leer.nextLine();
            palabra= palabra.toUpperCase();
            if(palabra.length()> 5 || palabra.length()<3){
                System.out.println("la palabra esta mal");
                
            }else
                cont++;
                Matriz = rellenarP(Matriz, palabra);
        } while (cont<5);
        
    }
    
    public static String[][] rellenarP(String[][] m, String p) {
        int x=0, y=0;
        do {
            y=(int) (Math.random()*20);
            x=(int)(Math.random()*(20-p.length()));
        } while (m[y][x] != null && m[y][x + p.length() - 1] != null);
        for (int i = 0; i < p.length(); i++) {
            m[y + i][x+1]=p.substring(0+i, 1+i);
        }
        return m;
    }
    
    public static void rellenarN(String[][] m) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (m[i][j]== null) {
                    m[i][j] = String.valueOf((int)(Math.random()*10));
                }
                System.out.print("["+ m[i][j] +"]");
            }
            System.out.println("");
        }
    
    } MODO 1
    
}
*/

    
//MODO 2    
public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] matrizsopa = new String[20][20];
        int[] posicion = new int[5];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matrizsopa[i][j] = String.valueOf((int) (Math.random() * 10));
            }
        }

        for (int i = 0; i < 5; i++) {
            boolean bandera = false;
            do {
                posicion[i] = (int) (Math.random() * 20);
                for (int j = 0; j < i; j++) {
                    if (posicion[i] == posicion[j]) {
                        bandera = true;
                        break;
                    } else {
                        bandera = false;
                    }
                }
            } while (bandera == true);
        }
        String palabra = "";
        String[][] matrizpalabra = new String[5][5];
        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Ingrese una palabra");
                palabra = leer.nextLine();
                palabra = palabra.toUpperCase();
            } while (palabra.length() > 5 || palabra.length() < 3);
            int n = (int) (Math.random() * 15);
            for (int j = 0; j < (palabra.length()); j++) {
                matrizsopa[posicion[i]][n] = palabra.substring(j, j + 1);
                n++;
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(matrizsopa[i][j] + " ");
            }
            System.out.println("");
        }
    }
}