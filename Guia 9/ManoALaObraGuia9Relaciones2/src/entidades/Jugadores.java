/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author MATIAS
 */
public class Jugadores {
    private String Nombre;
    private String Apellido;
    private int num;
    private Posicion pos;

    public Jugadores() {
    }

    public Jugadores(String Nombre, String Apellido, int num, Posicion pos) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.num = num;
        this.pos = pos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Posicion getPos() {
        return pos;
    }

    public void setPos(Posicion pos) {
        this.pos = pos;
    }

    @Override
    public String toString() {
        return "Nombre: " + Nombre + " " + Apellido + ", " + pos + ", numero: "+ num;
    }
    
    
}
