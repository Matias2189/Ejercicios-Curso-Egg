/*
 Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package ejercicio9guia7;

import entidad.Matematica;
import servicio.Servicios;
import java.util.Scanner;

public class Ejercicio9Guia7 {

    
    public static void main(String[] args) {
        Servicios cs = new Servicios();
        Matematica M = new Matematica();
        Scanner leer = new Scanner(System.in);
        
        M.setNum1(Math.random()*100);
        //System.out.println(M.getNum1());
        M.setNum2(Math.random()*100);
        //System.out.println(M.getNum2());
        cs.devolverMayor(M);
        cs.calcularPotencia(M);
        
    }
    
}
