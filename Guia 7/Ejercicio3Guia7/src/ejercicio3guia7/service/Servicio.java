
package ejercicio3guia7.service;

import ejercicio3guia7.entidad.Operacion;
import java.util.Scanner;

public class Servicio {

    public Servicio() {
    }
    public void crearOperacion(Operacion O1){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        O1.setNumero1(leer.nextInt());
        System.out.println("Ingrese otro número");
        O1.setNumero2(leer.nextInt());
    }
    public int Sumar(Operacion O1){
        return(O1.getNumero1()+O1.getNumero2());
    }
    public int Restar(Operacion O1){
        return(O1.getNumero1()-O1.getNumero2());
    }
    public int Multiplicar(Operacion O1){
        if(O1.getNumero1()==0||O1.getNumero2()==0){
            System.out.println("Error.");
            return 0;
        }else{
            return(O1.getNumero1()*O1.getNumero2());
        }
    }
    public double Dividir(Operacion O1){
        if(O1.getNumero1()==0||O1.getNumero2()==0){
            System.out.println("Error.");
            return 0;
        }else{
            return((double)O1.getNumero1()/(double)O1.getNumero2());
        }
    }
}

