package Ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contCorrectos = 0;
        int contIncorrectos = 0;
        String frase;
        do {

            System.out.println("Ingrese una frase RS232 (INICIO X / FIN O)");
            frase = leer.next();
            if (frase.equals("&&&&&")) {
                break;
            }
            int lon = frase.length();
            if (lon <= 5 && lon >= 2) {
                if ("X".equalsIgnoreCase(frase.substring(0, 1)) && "O".equalsIgnoreCase(frase.substring(lon - 1, lon))) {
                    contCorrectos++;
                } else {
                    contIncorrectos++;
                }
            } else {
                contIncorrectos++;
            }
            System.out.println("Los correctos son: " + contCorrectos);
            System.out.println("Los Incorrectos son: " + contIncorrectos);
        } while (!frase.equals("&&&&&"));
        System.out.println("La cantidad de frases correctas es de: " + contCorrectos);
        System.out.println("La cantidad de frases incorrectas es de: " + contIncorrectos);
        System.out.println("Gracias vuelva Pronto!");
    }
}