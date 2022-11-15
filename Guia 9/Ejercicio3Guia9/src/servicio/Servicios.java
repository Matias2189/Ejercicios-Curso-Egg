/*
 Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package servicio;

//import entidad.Baraja;
import entidad.Carta;
import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;

public class Servicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Carta> BarajeitorChiquito = new ArrayList();
    ArrayList<Carta> BarajaBorrada = new ArrayList();
    //Baraja b1 = new Baraja();

    public void crearBaraja() {
        String palo = "";
        Integer cont = 0;

        for (int i = 1; i < 5; i++) {
            if (i == 1) {
                palo = "Espada";
            }
            if (i == 2) {
                palo = "Oro";
            }
            if (i == 3) {
                palo = "Basto";
            }
            if (i == 4) {
                palo = "Copa";
            }
            for (int j = 1; j < 11; j++) {
                cont++;
                Carta c1 = new Carta();
                c1.setPalo(palo);
                if (j > 7) {
                    c1.setNumero(j + 2);
                } else {
                    c1.setNumero(j);
                }

                BarajeitorChiquito.add(c1);
            }

        }

        for (Carta aux : BarajeitorChiquito) {
            System.out.println(aux);

        }

    }

    public void barajar() {
        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("");
        Collections.shuffle(BarajeitorChiquito);
        for (Carta aux : BarajeitorChiquito) {
            System.out.println(aux);
        }
    }

    public void siguienteCarta() {
        if (BarajeitorChiquito.size() != 0) {

            System.out.println(BarajeitorChiquito.get(0));
            BarajaBorrada.add(BarajeitorChiquito.get(0));
            BarajeitorChiquito.remove(0);

        } else {
            System.out.println("NO HAY MAS CARTAS EN LA BARAJA PAPANATAS!!!!");
        }

    }

    public void cartasDisponibles() {

        System.out.println("Hay " + BarajeitorChiquito.size() + " cartas en la baraja");
    }

    public void darCartas() {
        System.out.println("Ingrese cuantas cartas quiere:");
        int cant = leer.nextInt();
        if (cant > BarajeitorChiquito.size()) {
            System.out.println("NO HAY SUFICIENTES CARTAS EN LA BARAJA PAPANAUTA!!!!");
        } else {
            for (int i = 0; i < cant; i++) {
                System.out.println(BarajeitorChiquito.get(0));
                BarajaBorrada.add(BarajeitorChiquito.get(0));
                BarajeitorChiquito.remove(0);

            }
        }
    }
    
    public void cartasMonton(){
        for (Carta aux : BarajaBorrada) {
            System.out.println(aux);

        }
    }
    

    public void mostrarBaraja() {
        for (Carta aux : BarajeitorChiquito) {
            System.out.println(aux);

        }
    }
}
