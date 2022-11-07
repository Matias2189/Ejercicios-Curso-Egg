
package servicio;

import entidad.Tiempo;
import java.util.Scanner;


public class Servicios {
    Tiempo t1 = new Tiempo();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void imprimirHoraCompleta(){
        System.out.println(t1.getHora()+":"+t1.getMinutos()+":"+t1.getSegundos());
        
    }
    
    public void ingresaHora(){
        System.out.println("Ingrese la hora: ");
        t1.setHora(leer.nextInt());
        while (t1.getHora()>23||t1.getHora()<0) {
            System.out.println("Ingrese un numero valido");
            t1.setHora(leer.nextInt());
        } 
        System.out.println("Ingrese los minutos: ");
        t1.setMinutos(leer.nextInt());
        while (t1.getMinutos()>59||t1.getMinutos()<0) {
            System.out.println("Ingrese un numero valido");
            t1.setMinutos(leer.nextInt());
        } 
        System.out.println("Ingrese los segundos: ");
        t1.setSegundos(leer.nextInt());
        while (t1.getSegundos()>59||t1.getSegundos()<0) {
            System.out.println("Ingrese un numero valido");
            t1.setSegundos(leer.nextInt());
        }
       
        
    }
    
    public void reloj() throws InterruptedException{
        for (int i = t1.getHora(); i <= 24; i++) {
            if (i==24) {
                        i=0;
                    }
            for (int j = t1.getMinutos(); j < 60; j++) {
                if (j==59) {
                        t1.setMinutos(0);
                    }
                for (int k = t1.getSegundos(); k < 60; k++) {
                    Thread.sleep(1000);

                    if (k==59) {
                        t1.setSegundos(0);
                    }
                    if (i < 10) {
                        System.out.print("0");
                    }
                    System.out.print(i + ":");
                    if (j < 10) {
                        System.out.print("0");
                    }
                    System.out.print(j + ":");
                    if (k < 10) {
                        System.out.print("0");
                    }
                    System.out.println(k);

                    
                }
            }
        }
    }
}
