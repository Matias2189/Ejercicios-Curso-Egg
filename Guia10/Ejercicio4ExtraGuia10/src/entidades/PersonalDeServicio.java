/*
 • Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
 */
package entidades;


public final class PersonalDeServicio extends Empleado{
    private String seccion;

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(String seccion, Integer añoIncor, Integer nDespacho, String nombre, String apellido, String estadoCivil, Integer dni) {
        super(añoIncor, nDespacho, nombre, apellido, estadoCivil, dni);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
    
    public void cambioSeccion(){
        System.out.println("Ingrese la nueva sección asignada: ");
        this.seccion=leer.next();
    }

    @Override
    public String toString() {
        return super.toString() + "PersonalDeServicio{" + "seccion=" + seccion + '}';
    }
    
    
}
