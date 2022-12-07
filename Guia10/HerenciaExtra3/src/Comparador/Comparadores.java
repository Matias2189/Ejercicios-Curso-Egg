/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparador;

import java.util.Comparator;
import Entidades.Hotel;

/**
 *
 * @author nacho
 */
public class Comparadores {

    public static Comparator<Hotel> compararPrecio = new Comparator<Hotel>(){
        @Override
        public int compare(Hotel t, Hotel t1) {
           return t1.getPrecioDeHabitacion().compareTo(t.getPrecioDeHabitacion());
                   }
    };
}
