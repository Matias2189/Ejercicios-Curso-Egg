/*
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
 */
package entidad;


public final class Hotel5Estrellas extends Hotel4Estrellas{
    protected Integer cantSalonesConfer, cantSuites, cantLimosinas;

    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(Integer cantSalonesConfer, Integer cantSuites, Integer cantLimosinas, Boolean gimnasio, String nombreRest, Integer capRest, Integer CantHabit, Integer nDeCamas, Integer CantPisos, Double precioHabit, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombreRest, capRest, CantHabit, nDeCamas, CantPisos, precioHabit, nombre, direccion, localidad, gerente);
        this.cantSalonesConfer = cantSalonesConfer;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Integer getCantSalonesConfer() {
        return cantSalonesConfer;
    }

    public void setCantSalonesConfer(Integer cantSalonesConfer) {
        this.cantSalonesConfer = cantSalonesConfer;
    }

    public Integer getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(Integer cantSuites) {
        this.cantSuites = cantSuites;
    }

    public Integer getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(Integer cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    
    
}
