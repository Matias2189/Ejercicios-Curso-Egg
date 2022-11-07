
package comparadores;

import entidad.Pelicula;
import java.util.Comparator;


public class Comparador {
    public static Comparator<Pelicula> ordenarPorDuracionDesc = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getHoras().compareTo(t.getHoras());
        }
       
    };
    
    public static Comparator<Pelicula> ordenarPorDuracionAsc = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getHoras().compareTo(t1.getHoras());
        }
       
    };
    
    public static Comparator<Pelicula> ordenarPorTitulo = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareToIgnoreCase(t1.getTitulo());
        }
       
    };
    
    public static Comparator<Pelicula> ordenarPorDirector = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareToIgnoreCase(t1.getDirector());
        }
       
    };
    
   
    
    }