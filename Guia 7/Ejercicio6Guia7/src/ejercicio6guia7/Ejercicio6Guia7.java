/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */

package ejercicio6guia7;

import java.util.Scanner;
import entidad.Cafetera;
import servicio.Servicio;

public class Ejercicio6Guia7 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Servicio c1 = new Servicio();
        Cafetera C = new Cafetera();
        C.setCapacidadMaxima(1000);
        int menu;
        boolean salir=false;
        do {
            System.out.println("        Menu         ");
            System.out.println("---------------------");
            System.out.println("1)Llenar Cafetera    ");
            System.out.println("2)Servir Taza        ");
            System.out.println("3)Vaciar Cafetera    ");
            System.out.println("4)Agregar Cafe       ");
            System.out.println("5)Salir              ");
            System.out.println("---------------------");
            menu=leer.nextInt();
            switch(menu){
                case 1:
                    c1.llenarCafetera(C);
                    break;
                case 2:
                    c1.servirTaza(C);
                    break;
                case 3:
                    c1.vaciarCafetera(C);
                    break;
                case 4:
                    c1.agregarCafe(C);
                    break;
                case 5:
                    System.out.println("Desea salir del menu (S/N)");
                    if (leer.next().equalsIgnoreCase("S")) {
                        salir=true;
                        System.out.println("nos vimos");
                    }
                   break;
                default:
                    System.out.println("Fijate bien la opcion que pones!!!");
                    break;
            }
        } while (salir!=true);
        
        
    }
    
}
