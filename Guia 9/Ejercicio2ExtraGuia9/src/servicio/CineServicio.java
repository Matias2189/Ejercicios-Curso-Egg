/*
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.
8 A X | 8 B X | 8 C X | 8 D   | 8 E X | 8 F X
7 A X | 7 B X | 7 C X | 7 D X | 7 E   | 7 F X
6 A X | 6 B X | 6 C   | 6 D X | 6 E X | 6 F
5 A X | 5 B X | 5 C X | 5 D X | 5 E X | 5 F X
4 A X | 4 B X | 4 C X | 4 D X | 4 E X | 4 F X
3 A X | 3 B X | 3 C X | 3 D   | 3 E X | 3 F X
2 A X | 2 B   | 2 C X | 2 D X | 2 E X | 2 F
1 A X | 1 B X | 1 C X | 1 D X | 1 E X | 1 F X
Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
cada asiento o solo las X y espacios vacíos.
 */
package servicio;

import entidad.Espectador;
import java.util.ArrayList;
import java.util.Scanner;

public class CineServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String Sala[][] = new String[8][6];
    Espectador p;
    int cont = 0;

    public void abrirSala() {
       

        System.out.println("El cine abrió y está asi de lleno: ");
        System.out.println("");
        for (int i = 7; i > -1; i--) {

            for (int j = 0; j < 6; j++) {
                if (j == 0) {
                    Sala[i][j] = (i+1) + "A";
                }
                if (j == 1) {
                    Sala[i][j] = (i+1) + "B";
                }
                if (j == 2) {
                    Sala[i][j] = (i+1) + "C";
                }
                if (j == 3) {
                    Sala[i][j] = (i+1) + "D";
                }
                if (j == 4) {
                    Sala[i][j] = (i+1) + "E";
                }
                if (j == 5) {
                    Sala[i][j] = (i+1) + "F";
                }
                if ((int) (Math.random() * 2) == 0) {
                    Sala[i][j] += "X| ";
                    cont++;
                } else {
                    Sala[i][j] += " | ";
                }
                // Sala[i][j]= i+letra+random;
            }
        }

    }

    public void mostrarSala() {
        for (int i = 7; i > -1; i--) {
            for (int j = 0; j < 6; j++) {
                System.out.print(Sala[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Asientos vacios: " + (48 - cont));
    }

    public Espectador crearPersona(ArrayList Espectador) {
        p = new Espectador();

        p.setNombre("Persona " + (Espectador.size() + 1));
        p.setDinero((int) (Math.random() * 2000));
        p.setEdad((int) (Math.random() * 65));

        return p;
    }

    public void modificarSala() {
        System.out.println("Ingrese fila: ");
        int fila = leer.nextInt();
        System.out.println("Ingrese columna: ");
        String columna = leer.next().toUpperCase();
        if (columna.equalsIgnoreCase("A")) {
            if (Sala[fila-1][0].contains("X")) {
                System.out.println("El lugar esta ocupado, mira bien");
                System.out.println("Elija un asiento LIBRE!!!");
                modificarSala();
            }else{
                Sala[fila-1][0] = fila+columna+"X| ";  
                cont++;
            }
            
        }
        if (columna.equalsIgnoreCase("B")) {
             if (Sala[fila-1][1].contains("X")) {
                System.out.println("El lugar esta ocupado, mira bien");
          System.out.println("Elija un asiento LIBRE!!!");
                modificarSala();
            }else{
                Sala[fila-1][1] = fila+columna+"X| "; 
                cont++;
            }
        }
        if (columna.equalsIgnoreCase("C")) {
             if (Sala[fila-1][2].contains("X")) {
                System.out.println("El lugar esta ocupado, mira bien");
                System.out.println("Elija un asiento LIBRE!!!");
                modificarSala();
            }else{
                Sala[fila-1][2] = fila+columna+"X| "; 
                cont++;
            }
        }
        if (columna.equalsIgnoreCase("D")) {
             if (Sala[fila-1][3].contains("X")) {
                System.out.println("El lugar esta ocupado, mira bien");
                System.out.println("Elija un asiento LIBRE!!!");
                modificarSala();
            }else{
                Sala[fila-1][3] = fila+columna+"X| "; 
                cont++;
            }
        }
        if (columna.equalsIgnoreCase("E")) {
             if (Sala[fila-1][4].contains("X")) {
                System.out.println("El lugar esta ocupado, mira bien");
                System.out.println("Elija un asiento LIBRE!!!");
                modificarSala();
            }else{
                Sala[fila-1][4] = fila+columna+"X| "; 
                cont++;
            }
        }
        if (columna.equalsIgnoreCase("F")) {
             if (Sala[fila-1][5].contains("X")) {
                System.out.println("El lugar esta ocupado, mira bien");
                System.out.println("Elija un asiento LIBRE!!!");
                modificarSala();
            }else{
                Sala[fila-1][5] = fila+columna+"X| "; 
                cont++;
            }
        }

    }

}
