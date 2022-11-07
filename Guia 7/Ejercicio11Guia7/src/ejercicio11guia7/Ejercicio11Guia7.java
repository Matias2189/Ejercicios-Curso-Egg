/*
 Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package ejercicio11guia7;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio11Guia7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int resultado = 0;
        System.out.println("Ingrese año de nacimiento");
        int anio = leer.nextInt();
        System.out.println("Ingrese mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese dia de nacimiento");
        int dia = leer.nextInt();

        Date nacimiento = new Date(anio - 1900, mes - 1, dia);
        Date fActual = new Date();
        System.out.println(nacimiento.toLocaleString());
        //System.out.println(fActual.toLocaleString());
        //System.out.println(fActual.getDate());
        //System.out.println(nacimiento.getDate());
        if (fActual.getMonth() >= nacimiento.getMonth()) {
            if (fActual.getDate() >= nacimiento.getDate()) {//getDate devuelve numero de dia - getDay devuelve numero de dia de la semana
                resultado = (fActual.getYear() - nacimiento.getYear());
            } else {
                resultado = (fActual.getYear() - nacimiento.getYear()-1);
            }
        } else {
            resultado = (fActual.getYear() - nacimiento.getYear()-1);
        }

        System.out.println("La edad es: " + resultado);

    }

}
