/*
Definir la clase Tiempo, la cual tendrá la hora, minutos y segundos. Definir dos constructores: un
constructor vacío y otro con la hora, minutos y segundos ingresado por el usuario. Deberá definir
además, los métodos getters y setters correspondientes, y el método imprimirHoraCompleta().
Recordar crear una validación sobre las horas, minutos y segundos ingresados por el usuario. Te
animas a simular el paso del tiempo en consola??????
 */
package ejercicioextrextra2;

import entidad.Tiempo;
import java.util.Scanner;
import servicio.Servicios;

public class EjercicioExtrExtra2 {

   
    public static void main(String[] args)throws InterruptedException{
 
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Servicios s1 = new Servicios();
        Tiempo t1 = new Tiempo();
        s1.ingresaHora();
        s1.imprimirHoraCompleta();
        s1.reloj();
    }
    
}
