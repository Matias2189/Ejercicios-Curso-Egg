package ejercicio2guia7.service;

import ejercicio2guia7.entidad.Circunferencia;
import java.util.Scanner;

public class Servicio {

    public Servicio() {
    }
    
    public void crearCircunferencia(Circunferencia O1){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un radio");
        O1.setRadio(leer.nextDouble());
    }
    
    public double area(Circunferencia O1){
        return (Math.PI*Math.pow(O1.getRadio(), 2));
        //return pi*radio2
    }
    
    public double perimetro(Circunferencia O1){
        return (2*Math.PI*O1.getRadio());
        //return 2*pi*radio
    }
}