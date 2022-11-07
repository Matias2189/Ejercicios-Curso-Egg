
package servicio;

import entidad.Triangulo;
import java.util.Scanner;


public class Servicios {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Triangulo t = new Triangulo();
    public double area(){
        double altura, acuadrado, bcuadrado, area;
        acuadrado = Math.pow(t.getLado(), 2);
        bcuadrado = Math.pow(t.getBase(), 2);
        altura = Math.sqrt(acuadrado - (bcuadrado / 4));
        area = ((t.getBase() * altura) / 2);
        System.out.println(area);
        return area;

    }
    
    public double perimetro(){
        double per=(t.getLado()*2)+t.getBase();
        System.out.println(per);
       return per;
    }
    
    public void datos(){
        System.out.println("Ingrese el lado del triangulo");
        t.setLado(leer.nextInt());
        System.out.println("Ingrese la base del triangulo");
        t.setBase(leer.nextInt());
    }
}
