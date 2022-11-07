
package servicio;

import entidad.Puntos;
import java.util.Scanner;


public class Servicios {
    Scanner leer = new Scanner(System.in);
    public Puntos crearPuntos(){
        Puntos p = new Puntos();
        System.out.println("Ingrese coordenadas de x del primer punto");
        p.setX1(leer.nextInt());
        System.out.println("Ingrese coordenadas de y del primer punto");
        p.setY1(leer.nextInt());
        System.out.println("Ingrese coordenadas de x del segundo punto");
        p.setX2(leer.nextInt());
        System.out.println("Ingrese coordenadas de y del segundo punto");
        p.setY2(leer.nextInt());
       return p;
    }
    
    public void calcularPuntos(Puntos p){
        System.out.println(Math.sqrt(Math.pow(p.getX2()-p.getX1(), 2)+Math.pow(p.getY2()-p.getY1(), 2)));
    }
}
