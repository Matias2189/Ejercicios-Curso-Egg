package servicio;

import entidad.Java;
import java.util.Scanner;

public class Servicios {

    public void adivinarMes(Java j) {
        j.setMesSecreto((j.getAño()[(int)(Math.random()*12)]));
        System.out.println(j.getMesSecreto());
        Scanner leer = new Scanner(System.in);
        String mes="";
        System.out.println("Intenta adivinar el mes secreto!!!");
                
        do {
            mes = leer.next();
            if (mes.equalsIgnoreCase(j.getMesSecreto()) ) {
                System.out.println("Correcto adivinaste el mes!!!");
            } else {
                System.out.println("Intenta nuevamente");
            }
        } while (!mes.equalsIgnoreCase(j.getMesSecreto()));

    }

}
