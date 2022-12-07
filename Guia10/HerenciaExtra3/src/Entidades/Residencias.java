
package Entidades;


public class Residencias extends AlojamientoExtraHotelero{
    protected Integer cantHabitaciones;
    protected Boolean descuento, campoDeportivo;

    public Residencias() {
        crearAlojamiento();
    }

    public Residencias(Integer cantHabitaciones, Boolean descuento, Boolean campoDeportivo, Boolean privado, Integer CantMetrosCuadrados) {
        super(privado, CantMetrosCuadrados);
        this.cantHabitaciones = cantHabitaciones;
        this.descuento = descuento;
        this.campoDeportivo = campoDeportivo;
    }

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public Boolean getDescuento() {
        return descuento;
    }

    public void setDescuento(Boolean descuento) {
        this.descuento = descuento;
    }

    public Boolean getCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(Boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return  "Residencias{"+ super.toString() + "cantHabitaciones=" + cantHabitaciones + ", descuento=" + descuento + ", campoDeportivo=" + campoDeportivo + '}';
    }
    public void crearAlojamiento(){
        super.crearAlojamiento();
        cantHabitaciones = (int) ((Math.random()*20)+1);
        int v = (int) ((Math.random() * 2) + 1);
        campoDeportivo = v==1;
        int h = (int) ((Math.random() * 2) + 1);
        descuento = h==1;
    }
    
}
