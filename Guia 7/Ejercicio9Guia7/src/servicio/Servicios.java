package servicio;

import java.util.Scanner;
import entidad.Matematica;

/*
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
public class Servicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void devolverMayor(Matematica m) {
        if (m.getNum1() > m.getNum2()) {
            System.out.println("El numero " + m.getNum1() + " es mayor que el numero " + m.getNum2());
        } else {
            System.out.println("El numero " + m.getNum2() + " es mayor que el numero " + m.getNum1());
        }
    }

    public void calcularPotencia(Matematica m) {
        double Num1=(Math.round(m.getNum1()));
        double Num2=(Math.round(m.getNum2()));
        
        if (Num1 < Num2) {
            System.out.println("La potencia es: "+Math.pow(Num2, Num1));
        }else if (Num1>Num2) {
            System.out.println("La potencia es: "+Math.pow(Num1, Num2));
        }
    }
    
    public void calculaRaiz(Matematica m){
        double Num1=(Math.abs(m.getNum1()));
        double Num2=(Math.abs(m.getNum2()));
               
        if (Num1<Num2) {
            System.out.println("La raiz cuadrada es: "+Math.sqrt(Num1));
        }else if (Num2<Num1) {
            System.out.println("La raiz cuadrada es: "+Math.sqrt(Num2));
        }
    }
}
