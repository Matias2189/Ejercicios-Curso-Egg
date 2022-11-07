package servicio;

import entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class Servicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearAhorcado(Ahorcado a) {
        System.out.println("Ingrese una frase");
        String palabra = leer.next();
        String vec[] = new String[palabra.length()];
        String vecGuion[] = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            vec[i] = palabra.substring(i, i + 1);
            if (palabra.substring(i, i + 1).equals(" ")) {
                vecGuion[i] = " ";
            } else {
                vecGuion[i] = "_";
            }

        }
        a.setBuscar(vec);
        a.setVecGuiones(vecGuion);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    public void mostrarGuiones(Ahorcado a) {
        for (int i = 0; i < a.getVecGuiones().length; i++) {
            System.out.print(a.getVecGuiones()[i]);
        }
        System.out.println("");
        System.out.println("Letras usadas: " + a.getNoEncontradas());
    }

    public void ingresarLetra(Ahorcado a) {
        int intentos = 0;
        do {
            
            System.out.println("Te quedan " + (6 - intentos) + " intentos");
            System.out.println("Ingrese una letra");
            //stringvalueof leernextcharat(0) para que tome una sola letra
            String letra = leer.next();
            String vec[] = a.getVecGuiones();
            int contador = 0;

            for (int i = 0; i < a.getBuscar().length; i++) {
                if (letra.equalsIgnoreCase(a.getBuscar()[i])) {
                    vec[i] = a.getBuscar()[i];
                    contador++;
                }

            }

            if (contador == 0) {

                if (!a.getNoEncontradas().contains(letra)) {
                    a.setNoEncontradas(a.getNoEncontradas() + " " + letra);
                    intentos++;
                    System.out.println("La letra ingresada no esta en la palabra");
                    System.out.println("Te quedan " + (6 - intentos) + " intentos");
                }

            }

            a.setVecGuiones(vec);
            mostrarGuiones(a);
            if (Arrays.equals((a.getBuscar()), (a.getVecGuiones()))) {
                break;
            }
            switch (intentos) {
                case 0:
                    System.out.println("    (•‿•)   ");
                    break;
                case 1:
                    System.out.println("    (¬‿¬)  ");
                    System.out.println("      |   ");
                    break;
                case 2:
                    System.out.println("   ( ≖.≖)  ");
                    System.out.println("      |   ");
                    System.out.println("      |  ");
                    break;
                case 3:
                    System.out.println("    (◑_◑)  ");
                    System.out.println("      |   ");
                    System.out.println("     /|\\  ");
                    break;
                case 4:
                    System.out.println("    (ㆆ_ㆆ)  ");
                    System.out.println("      |   ");
                    System.out.println("     /|\\  ");
                    System.out.println("      |   ");
                    break;
                case 5:
                    System.out.println("   ⁀⊙﹏☉⁀  ");
                    System.out.println("      |   ");
                    System.out.println("     /|\\  ");
                    System.out.println("      |   ");
                    System.out.println("     / \\ ");
                    break;

                case 6:
                    System.out.println("   (╥﹏╥)  ");
                    System.out.println("--------------");
                    System.out.println("      |   ");
                    System.out.println("     /|\\  ");
                    System.out.println("      |   ");
                    System.out.println("     / \\ ");
                    break;

            }
            System.out.println("");
            System.out.println("-----------------------------------------");
            System.out.println("");
        } while (intentos < 6);

        if (intentos != 6) {
            System.out.println("ADIVINASTE!!!");
        } else {
            System.out.println("SE AGOTARON LOS INTENTOS!");
        }
    }

}
