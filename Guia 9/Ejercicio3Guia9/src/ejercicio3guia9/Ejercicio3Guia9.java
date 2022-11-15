/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
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
package ejercicio3guia9;

import java.util.Scanner;
import servicio.Servicios;

public class Ejercicio3Guia9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Servicios s1 = new Servicios();
        
        System.out.println("Baraja Inicial");
        s1.crearBaraja();
        
        int opcion;

        do {
            System.out.println("");
        System.out.println("-------------------------------");
        System.out.println("");
            System.out.println("\t.:Menu:.");
            System.out.println("1 - Barajar");
            System.out.println("2 - Siguiente Carta");
            System.out.println("3 - Cantidad de Cartas");
            System.out.println("4 - Dar Cartas");
            System.out.println("5 - Baraja Descartada");
            System.out.println("6 - Mostrar Baraja");
            System.out.println("7 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    s1.barajar();
                    break;
                case 2:
                    s1.siguienteCarta();
                    break;
                case 3:
                    s1.cartasDisponibles();
                    break;
                case 4:
                    s1.darCartas();
                    break;
                case 5:
                    s1.cartasMonton();
                    break;
                case 6:
                    s1.mostrarBaraja();
                    break;
                case 7:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 7));
        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("");
    }

}
