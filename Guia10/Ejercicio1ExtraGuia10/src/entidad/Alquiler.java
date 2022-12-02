/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author MATIAS
 */
public class Alquiler {
    private String nombre;
    private String documento;
    private Integer dias;
    private Integer posicion;
    private Barco bar;

    public Alquiler() {
    }

    public Alquiler(String nombre, String documento, Integer dias, Integer posicion, Barco bar) {
        this.nombre = nombre;
        this.documento = documento;
        this.dias = dias;
        this.posicion = posicion;
        this.bar = bar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public Barco getBar() {
        return bar;
    }

    public void setBar(Barco bar) {
        this.bar = bar;
    }
    
    
    
}
