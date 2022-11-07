
package servicio;

import entidad.Persona;
import java.util.Date;
import java.util.Scanner;


public class Servicios {
    Scanner leer=new Scanner(System.in);
    public void crearPersona(Persona p){
        
        System.out.println("Ingrese su nombre:");
        p.setNombre(leer.next());
        System.out.println("Ingrese año de nacimiento");
        int anio = leer.nextInt();
        System.out.println("Ingrese mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese dia de nacimiento");
        int dia = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        p.setNacimiento(fecha);
        
    }
    
    public void calcularEdad(Persona p){
        Date fActual=new Date();
        if (fActual.getMonth() >= p.getNacimiento().getMonth()) {
            if (fActual.getDate() >= p.getNacimiento().getDate()) {//getDate devuelve numero de dia - getDay devuelve numero de dia de la semana
                p.setEdad(fActual.getYear() - p.getNacimiento().getYear());
            } else {
                p.setEdad((fActual.getYear() - p.getNacimiento().getYear()-1));
            }
        } else {
            p.setEdad((fActual.getYear() - p.getNacimiento().getYear()-1));
        }
        
    }
    
    public boolean menorQue(Persona p){
        boolean menor=false;
        System.out.println("Ingresa una edad a comparar: ");
        int edad=leer.nextInt();
        if (p.getEdad()>edad) {
            menor=true;
        }
       return menor; 
    }
    
    public void mostrarPersona(Persona p){
        System.out.println(p.toString());
    }
}
