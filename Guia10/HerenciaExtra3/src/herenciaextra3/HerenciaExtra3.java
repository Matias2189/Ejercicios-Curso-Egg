/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaextra3;

import static Comparador.Comparadores.compararPrecio;
import Entidades.Alojamiento;
import Entidades.AlojamientoExtraHotelero;
import Entidades.Hotel;
import Entidades.Hotel4;
import Entidades.Hotel5;
import Entidades.Residencias;
import Entidades.camping;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class HerenciaExtra3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Hotel> hoteles = new ArrayList();
        ArrayList<AlojamientoExtraHotelero> Aloja = new ArrayList();
        int j = 0;
        for (int i = 0; i < 5; i++) {
            Hotel4 h = new Hotel4();
            Hotel5 h1 = new Hotel5();
            hoteles.add(h);
            hoteles.add(h1);
        }
        Collections.sort(hoteles, compararPrecio);

        for (int i = 0; i < 5; i++) {
            camping camp = new camping();
            Residencias r = new Residencias();
            Aloja.add(r);
            Aloja.add(camp);
        }
        
        int opcion;
        do {
            System.out.println("\tMenu ");
            System.out.println("1 - Ver Alojamientos");
            System.out.println("2 - Hoteles (Precio mayor a menor)");
            System.out.println("3 - Campings con restaurant");
            System.out.println("4 - Residencias con Descuento");
            System.out.println("5 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    for (AlojamientoExtraHotelero aux : Aloja) {

                        System.out.println(aux);
                    }
                    for (Hotel aux : hoteles) {
                        System.out.println(aux);
                    }
                    break;
                case 2:
                    for (Hotel aux : hoteles) {
                        j++;
                        if (aux instanceof Hotel5) {
                            System.out.println(j + "_ " + "Hotel 5 estrellas " + " " + aux.getPrecioDeHabitacion());

                        } else {
                            System.out.println(j + "_ " + "Hotel 4 estrellas " + " " + aux.getPrecioDeHabitacion());
                        }

                    }
                    break;
                case 3:
                    for (AlojamientoExtraHotelero aux : Aloja) {
                        if (aux instanceof camping) {
                            if (((camping) aux).getRestaurante()) {
                                System.out.println(aux);
                            }

                        }
                    }
                    break;
                case 4:
                    for (AlojamientoExtraHotelero aux : Aloja) {
                        if (aux instanceof Residencias) {
                            if (((Residencias) aux).getDescuento()) {
                                System.out.println(aux);
                            }

                        }
                    }
                    break;
                case 5:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 5));
    }

}
