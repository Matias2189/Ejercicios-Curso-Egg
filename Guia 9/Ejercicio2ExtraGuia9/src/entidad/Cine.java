/*
 De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada.
 */
package entidad;

import java.util.ArrayList;


public class Cine {
    private Integer precio;
    private ArrayList<Espectador> personas;
    private ArrayList<Pelicula> peli;

    public Cine() {
    }

    public Cine(Integer precio, ArrayList<Espectador> personas, ArrayList<Pelicula> peli) {
        this.precio = precio;
        this.personas = personas;
        this.peli = peli;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public ArrayList<Espectador> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Espectador> personas) {
        this.personas = personas;
    }

    public ArrayList<Pelicula> getPeli() {
        return peli;
    }

    public void setPeli(ArrayList<Pelicula> peli) {
        this.peli = peli;
    }

    @Override
    public String toString() {
        return "Cine{" + "precio=" + precio + ", personas=" + personas + ", peli=" + peli + '}';
    }
    
    
}
