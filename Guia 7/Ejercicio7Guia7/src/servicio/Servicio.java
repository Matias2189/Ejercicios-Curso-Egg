
package servicio;

import entidad.Persona;
import java.util.Scanner;

public class Servicio {
    Scanner leer = new Scanner(System.in);
    String genero;
    public void crearPersona(Persona p){
        System.out.println("Ingrese su nombre");
        p.setNombre(leer.next());
        System.out.println("Ingrese su edad");
        p.setEdad(leer.nextInt());
        System.out.println("Ingrese su sexo -({H para hombre) - (M para mujer) - (O para otro)-");
        genero=leer.next();
        while   (!genero.equalsIgnoreCase("H")&& !genero.equalsIgnoreCase("M")&& !genero.equalsIgnoreCase("O")){
            System.out.println("Error");
            System.out.println("Ingrese una condicion de sexo valida: (H - Hombre) (M - Mujer) (O - Otro)");
            genero = leer.next();
            p.setSexo(genero);
        }
        System.out.println("Ingrese su peso");
        p.setPeso(leer.nextDouble());
        System.out.println("Ingrese su altura");
        p.setAltura(leer.nextDouble());
         
        
    }
    
    public double calcularIMC(Persona p){
        double indice;
        indice= p.getPeso() / Math.pow(p.getAltura(), 2);
        if (indice<20) {
            indice = -1;
        }else if(indice>=20 && indice<=25){
            indice = 0;
        }else if(indice>25){
            indice = 1;
        }
        return indice;
    }
    
    public boolean esMayorDeEdad(Persona p){
        boolean Mayor=false;
        if (p.getEdad()>=18){
            Mayor = true;
        }
        return Mayor;
        
        //return p.getEdad()>=18
        //guarda lo mismo que arriba los true y false
        //en el main se compara si da true o false para sumar los contadres con un for que recorre vectores
    }
}
