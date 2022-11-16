
package entidad;


import numeradores.Tamanio;


public class Perro {
    private String nombre, raza;
    private Integer edad;
    private Tamanio tamanio;
    private boolean adopt=false;

    public boolean isAdopt() {
        return adopt;
    }

    public void setAdopt(boolean adopt) {
        this.adopt = adopt;
    }

    public Perro() {
    }

    public Perro(String nombre, String raza, Integer edad, Tamanio tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamanio=" + tamanio + ", adopt=" + adopt + '}';
    }

   

   
    
    
}
