/*
 Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones.
 */
package entidad;


public class Hoteles extends Alojamientos{
    protected Integer CantHabit, nDeCamas,CantPisos;
    protected Double precioHabit;

    public Hoteles() {
    }

    public Hoteles(Integer CantHabit, Integer nDeCamas, Integer CantPisos, Double precioHabit, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.CantHabit = CantHabit;
        this.nDeCamas = nDeCamas;
        this.CantPisos = CantPisos;
        this.precioHabit = precioHabit;
    }

    public Integer getCantHabit() {
        return CantHabit;
    }

    public void setCantHabit(Integer CantHabit) {
        this.CantHabit = CantHabit;
    }

    public Integer getnDeCamas() {
        return nDeCamas;
    }

    public void setnDeCamas(Integer nDeCamas) {
        this.nDeCamas = nDeCamas;
    }

    public Integer getCantPisos() {
        return CantPisos;
    }

    public void setCantPisos(Integer CantPisos) {
        this.CantPisos = CantPisos;
    }

    public Double getPrecioHabit() {
        return precioHabit;
    }

    public void setPrecioHabit(Double precioHabit) {
        this.precioHabit = 50d;
    }
    
    
}
