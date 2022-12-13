/*
 • Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
 */
package entidades;


public final class Profesor extends Empleado{
    private String dpto;

    public Profesor() {
    }

    public Profesor(String dpto, Integer añoIncor, Integer nDespacho, String nombre, String apellido, String estadoCivil, Integer dni) {
        super(añoIncor, nDespacho, nombre, apellido, estadoCivil, dni);
        this.dpto = dpto;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }
    
    public void cambioDpto(){
        System.out.println("Ingrese el nuevo departamento asignado: ");
        this.dpto=leer.next();
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor{" + "dpto=" + dpto + '}';
    }
    
    
}
