/*
Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa.
 */
package entidad;


public class Alojamientos_ExtraHoteleros extends Alojamientos{
    protected Boolean privado;
    protected Double m2;

    public Alojamientos_ExtraHoteleros() {
    }

    public Alojamientos_ExtraHoteleros(Boolean privado, Double m2, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.m2 = m2;
    }

    public Boolean getPrivado() {
        return privado;
    }

    public void setPrivado(Boolean privado) {
        this.privado = privado;
    }

    public Double getM2() {
        return m2;
    }

    public void setM2(Double m2) {
        this.m2 = m2;
    }
    
    
    
}
