
package servicio;

import comparadores.Comparador;
import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Servicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    ArrayList<Pelicula> Pelis = new ArrayList();
    
    public void pedirPelicula(){
        String opc="";
        do {
            Pelicula p1 = new Pelicula();
            System.out.println("Ingrese el nombre de la pelicula");
            p1.setTitulo(leer.next());
            System.out.println("Ingrese director de la pelicula");
            p1.setDirector(leer.next());
            System.out.println("Ingrese la duracion de la pelicula");
            p1.setHoras(leer.nextDouble());
            Pelis.add(p1);
            System.out.println("Quiere ingresar una nueva pelicula? si/no");
            opc=leer.next();
        } while (!opc.equalsIgnoreCase("no"));
     }
    
    public void mostrarPelis(){
            for (Pelicula aux : Pelis) {
                System.out.println(aux);
            }
    }
    
    public void pelis1hr(){
        System.out.println("Las pelicualas con duracion mayor o igual a 1hs son:");
        for (Pelicula aux : Pelis) {
            if (aux.getHoras()>=1) {
                System.out.println(aux);
            }
        }
    }
    
    public void pelisOrdDuracion(){
        Collections.sort(Pelis, Comparador.ordenarPorDuracionAsc);
        System.out.println("Peliculas ordenadas por Duracion ascendente");
        mostrarPelis();
        System.out.println("-------------------------");
        Collections.sort(Pelis, Comparador.ordenarPorDuracionDesc);
        System.out.println("Peliculas ordenadas por Duracion Descendente");
        mostrarPelis();
    }
    
    public void PelisOrdDirector(){
        Collections.sort(Pelis, Comparador.ordenarPorDirector);
        System.out.println("Peliculas ordenadas por nombre de director");
        mostrarPelis();
    }
    
    public void PelisOrdTitulo(){
        Collections.sort(Pelis, Comparador.ordenarPorTitulo);
        System.out.println("Peliculas ordenadas por titulo");
        mostrarPelis();
    }
}
