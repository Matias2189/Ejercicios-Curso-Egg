/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.CuentaBancaria;
import java.util.Scanner;

public class Servicio {
    Scanner leer = new Scanner(System.in);
    
    public void crearCuenta(CuentaBancaria c1){
        System.out.println("Ingrese el numero de cuenta");
        c1.setNroCuenta(leer.nextInt());
        System.out.println("Ingrese el dni del usuario");
        c1.setDni(leer.nextInt());
        System.out.println("Ingrese su saldo actual");
        c1.setSaldoActual(leer.nextInt());
    }
    
    public void ingresar(CuentaBancaria c1){
        System.out.println("Cuanto desea ingresar");
        int ingreso=leer.nextInt();
        int total=c1.getSaldoActual()+ingreso;
        c1.setSaldoActual(total);
    }
    
    public void retirar(CuentaBancaria c1){
        System.out.println("Cuanto dinero desea retirar");
        int retirar=leer.nextInt();
        if (c1.getSaldoActual()<retirar) {
            System.out.println("su nuevo saldo se acabo y se quedo pobre, saluditos!!!");
            c1.setSaldoActual(0);
        }else{
            c1.setSaldoActual(c1.getSaldoActual()-retirar);
            
        }
        
    }
    
    public void extraccionRapido(CuentaBancaria c1){
        System.out.println("De cuanto desea hacer su extraccion rapida?");
        int rapida=leer.nextInt();
        if ((c1.getSaldoActual()*20)/100>rapida) {
            System.out.println("Bien chango, llevate tu plata");
            c1.setSaldoActual(c1.getSaldoActual()-rapida);
        }else{
            System.out.println("No puede retirar esa cantidad en extraccion rapida papanatas");
        }
    }
    
    public void consultarSaldo(CuentaBancaria c1){
        System.out.println("Su saldo disponible es de: "+c1.getSaldoActual());
    }
    
    public void consultarDatos(CuentaBancaria c1){
        System.out.println("Los datos de la cuetna son "+c1.toString());
    }
}
