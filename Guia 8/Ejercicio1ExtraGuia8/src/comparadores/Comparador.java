/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadores;

import alumno.Alumnos;
import java.util.Comparator;

/**
 *
 * @author MATIAS
 */
public class Comparador {
    public static Comparator<Alumnos> apellidoAsc= new Comparator<Alumnos>(){
        @Override
        public int compare(Alumnos t, Alumnos t1) {
            return t.getApellido().compareTo(t1.getApellido());
        }
       
    };
    
    public static Comparator<Alumnos> nombreDesc= new Comparator<Alumnos>(){
        @Override
        public int compare(Alumnos t, Alumnos t1) {
            return t1.getNombre().compareTo(t.getNombre());
        }
       
    };
}
