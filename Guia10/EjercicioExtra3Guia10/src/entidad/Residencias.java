/*
Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo.
 */
package entidad;


public final class Residencias extends Alojamientos_ExtraHoteleros{
    protected Integer cantHabit;
    protected Boolean descGrem, campoDepo;

    public Residencias() {
    }

    public Residencias(Integer cantHabit, Boolean descGrem, Boolean campoDepo, Boolean privado, Double m2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, m2, nombre, direccion, localidad, gerente);
        this.cantHabit = cantHabit;
        this.descGrem = descGrem;
        this.campoDepo = campoDepo;
    }

    public Integer getCantHabit() {
        return cantHabit;
    }

    public void setCantHabit(Integer cantHabit) {
        this.cantHabit = cantHabit;
    }

    public Boolean getDescGrem() {
        return descGrem;
    }

    public void setDescGrem(Boolean descGrem) {
        this.descGrem = descGrem;
    }

    public Boolean getCampoDepo() {
        return campoDepo;
    }

    public void setCampoDepo(Boolean campoDepo) {
        this.campoDepo = campoDepo;
    }
    
    
}
