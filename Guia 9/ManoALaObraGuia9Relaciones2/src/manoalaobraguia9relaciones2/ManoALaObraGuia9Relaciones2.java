/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package manoalaobraguia9relaciones2;

import entidades.Equipo;
import entidades.Jugadores;
import entidades.Posicion;


public class ManoALaObraGuia9Relaciones2 {

    
    public static void main(String[] args) {
        Equipo e1 = new Equipo();
        e1.setNombre("Huevones FC");
        e1.getTeam().add(new Jugadores("Matias", "Bevione", 4, Posicion.DEFENSOR));
       e1.getTeam().add(new Jugadores("Facu", "Cruz", 9, Posicion.DELANTERO));
       e1.getTeam().add(new Jugadores("Cesar", "Rivadeneira", 1, Posicion.ARQUERO));
       e1.getTeam().add(new Jugadores("Walter", "Rosales", 8, Posicion.MEDIO));
       e1.getTeam().add(new Jugadores("Gonza", "Gribaudo", 2, Posicion.DEFENSOR));
       e1.getTeam().add(new Jugadores("Guido", "Dagatti", 10, Posicion.DELANTERO));
       e1.setPresupuesto(1000000);
        System.out.println(e1.getNombre());
        System.out.println("Presupuesto: "+e1.getPresupuesto());
        for (Jugadores aux : e1.getTeam()) {
            System.out.println(aux.toString());
        }
    }
    
}
