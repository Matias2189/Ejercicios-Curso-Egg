/*
 Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones.
 */
package entidad;

/**
 *
 * @author MATIAS
 */
public final class Camping extends Alojamientos_ExtraHoteleros{
    protected Integer capMaxCarp, cantBanos;
    protected Boolean restaurant;

    public Camping() {
    }

    public Camping(Integer capMaxCarp, Integer cantBanos, Boolean restaurant, Boolean privado, Double m2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, m2, nombre, direccion, localidad, gerente);
        this.capMaxCarp = capMaxCarp;
        this.cantBanos = cantBanos;
        this.restaurant = restaurant;
    }

    public Integer getCapMaxCarp() {
        return capMaxCarp;
    }

    public void setCapMaxCarp(Integer capMaxCarp) {
        this.capMaxCarp = capMaxCarp;
    }

    public Integer getCantBanos() {
        return cantBanos;
    }

    public void setCantBanos(Integer cantBanos) {
        this.cantBanos = cantBanos;
    }

    public Boolean getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Boolean restaurant) {
        this.restaurant = restaurant;
    }
    
    
}
