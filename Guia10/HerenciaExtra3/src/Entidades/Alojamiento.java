/*
 * un nombre, una dirección,
una localidad y un gerente encargado del lugar.
 */
package Entidades;


public class Alojamiento {
    protected String nombre;
    protected String direccion;
    protected String gerente;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.gerente = gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
    public void crearHotel(){
        int b = (int) ((Math.random()*10)+1);
        switch (b) {
            case 1:
                nombre = "Jorgito";
                break;
            case 2:
                nombre = "Carlitos";
                break;
            case 3:
                nombre = "Ernestito";
                break;
            case 4:
                nombre = "Josesito";
                break;
            case 5:
                nombre = "Dieguito";
                break;
            default:
                break;
        }
    }  
}
