/*
 • Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.
 */
package entidades;

import java.util.Scanner;


public class Persona {
    protected String nombre, apellido, estadoCivil;
    protected Integer dni;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona() {
    }

    public Persona(String nombre, String apellido, String estadoCivil, Integer dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }
    
    public void cambioEstadoCivil (){
        System.out.println("Ingrese el nuevo estado civil: ");
        this.estadoCivil=leer.next();
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", estadoCivil=" + estadoCivil + ", dni=" + dni + '}';
    }
    
    
}
