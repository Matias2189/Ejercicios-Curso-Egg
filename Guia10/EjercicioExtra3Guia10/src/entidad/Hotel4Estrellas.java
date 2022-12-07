/*
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
 */
package entidad;


public class Hotel4Estrellas extends Hoteles{
    protected Boolean gimnasio;
    protected String nombreRest;
    protected Integer capRest;

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(Boolean gimnasio, String nombreRest, Integer capRest, Integer CantHabit, Integer nDeCamas, Integer CantPisos, Double precioHabit, String nombre, String direccion, String localidad, String gerente) {
        super(CantHabit, nDeCamas, CantPisos, precioHabit, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRest = nombreRest;
        this.capRest = capRest;
    }

    public Boolean getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(Boolean gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRest() {
        return nombreRest;
    }

    public void setNombreRest(String nombreRest) {
        this.nombreRest = nombreRest;
    }

    public Integer getCapRest() {
        return capRest;
    }

    public void setCapRest(Integer capRest) {
        this.capRest = capRest;
    }
    
    
    public void precioHab(){
        
    }
}
