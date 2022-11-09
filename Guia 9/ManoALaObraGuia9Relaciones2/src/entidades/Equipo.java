/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MATIAS
 */
public class Equipo {
    private List <Jugadores> team;
    private double presupuesto;
    private String nombre;

    public Equipo() {
        this.team = new ArrayList();
    }

    public Equipo(List<Jugadores> team, double presupuesto, String nombre) {
        this.team = team;
        this.presupuesto = presupuesto;
        this.nombre = nombre;
    }

    public List<Jugadores> getTeam() {
        return team;
    }

    public void setTeam(List<Jugadores> team) {
        this.team = team;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
