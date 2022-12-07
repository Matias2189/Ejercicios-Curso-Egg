/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;


public class Hotel extends Alojamiento {
    protected Integer cantHabitaciones, numDeCamas, cantPisos, precioDeHabitacion;
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Hotel(Integer cantHabitaciones, Integer numDeCamas, Integer cantPisos, Integer precioDeHabitacion, String nombre, String direccion, String gerente) {
        super(nombre, direccion, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.numDeCamas = numDeCamas;
        this.cantPisos = cantPisos;
        this.precioDeHabitacion = precioDeHabitacion;
    }

    public Hotel() {
    }

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public Integer getNumDeCamas() {
        return numDeCamas;
    }

    public void setNumDeCamas(Integer numDeCamas) {
        this.numDeCamas = numDeCamas;
    }

    public Integer getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(Integer cantPisos) {
        this.cantPisos = cantPisos;
    }

    public Integer getPrecioDeHabitacion() {
        return precioDeHabitacion;
    }

    public void setPrecioDeHabitacion(Integer precioDeHabitacion) {
        this.precioDeHabitacion = precioDeHabitacion;
    }
    public void precioHab(){
        precioDeHabitacion=50;
    
        
    }
    @Override
    public void crearHotel(){
        super.crearHotel();
        cantPisos= (int) ((Math.random()*10)+1);
        
        cantHabitaciones = (int) ((Math.random()*6)+1);
        
        numDeCamas= (int) ((Math.random()*3)+1);
    }

    @Override
    public String toString() {
        return   "cantHabitaciones=" + cantHabitaciones + ", numDeCamas=" + numDeCamas + ", cantPisos=" + cantPisos + ", precioDeHabitacion=" + precioDeHabitacion + ", leer=" + leer + '}';
    }
    
}
