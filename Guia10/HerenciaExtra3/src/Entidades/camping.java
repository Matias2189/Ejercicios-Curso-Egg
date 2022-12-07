/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

public class camping extends AlojamientoExtraHotelero {

    protected Integer capMaxCarpas, CantBanios;
    protected Boolean Restaurante;

    public camping() {
        crearAlojamiento();
    }

    public camping(Integer capMaxCarpas, Integer CantBanios, Boolean Restaurante, Boolean privado, Integer CantMetrosCuadrados) {
        super(privado, CantMetrosCuadrados);
        this.capMaxCarpas = capMaxCarpas;
        this.CantBanios = CantBanios;
        this.Restaurante = Restaurante;
    }

    public Integer getCapMaxCarpas() {
        return capMaxCarpas;
    }

    public void setCapMaxCarpas(Integer capMaxCarpas) {
        this.capMaxCarpas = capMaxCarpas;
    }

    public Integer getCantBanios() {
        return CantBanios;
    }

    public void setCantBanios(Integer CantBanios) {
        this.CantBanios = CantBanios;
    }

    public Boolean getRestaurante() {
        return Restaurante;
    }

    public void setRestaurante(Boolean Restaurante) {
        this.Restaurante = Restaurante;
    }

    @Override
    public String toString() {
        return "" +super.toString() +  "capMaxCarpas=" + capMaxCarpas + ", CantBanios=" + CantBanios + ", Restaurante=" + Restaurante + '}';
    }

    @Override
    public void crearAlojamiento() {
        super.crearAlojamiento();
        capMaxCarpas = (int) ((Math.random() * 100) + 1);
        CantBanios = (int) ((Math.random() * 10) + 1);
        int v = (int) ((Math.random() * 2) + 1);
        Restaurante = v==1;
    }

}
