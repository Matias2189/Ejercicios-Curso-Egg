/*
 • Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
 */
package entidades;


public class Empleado extends Persona{
    protected Integer añoIncor, nDespacho;

    public Empleado() {
    }

    public Empleado(Integer añoIncor, Integer nDespacho, String nombre, String apellido, String estadoCivil, Integer dni) {
        super(nombre, apellido, estadoCivil, dni);
        this.añoIncor = añoIncor;
        this.nDespacho = nDespacho;
    }

    public Integer getAñoIncor() {
        return añoIncor;
    }

    public void setAñoIncor(Integer añoIncor) {
        this.añoIncor = añoIncor;
    }

    public Integer getnDespacho() {
        return nDespacho;
    }

    public void setnDespacho(Integer nDespacho) {
        this.nDespacho = nDespacho;
    }
    
    public void cambioDespacho(){
        System.out.println("Ingrese el nuevo despacho asignado: ");
        this.nDespacho=leer.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "a\u00f1oIncor=" + añoIncor + ", nDespacho=" + nDespacho + '}';
    }
    
    
    
}
