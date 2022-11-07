/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package ejercicio6guia8;


import java.util.Scanner;
import servicio.Servicios;


public class Ejercicio6Guia8 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Servicios s1 = new Servicios();
       
        
        
        int opcion;
        
        do {
            System.out.println("\t.:Menu:.");
            System.out.println("1 - Cargar producto");
            System.out.println("2 - Modificar precio");
            System.out.println("3 - Eliminar Producto");
            System.out.println("4 - Mostrar Productos");
            System.out.println("5 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    s1.cargarProductos();
                    break;
                case 2:
                    s1.modificarPrecio();
                    break;
                case 3:
                    s1.eliminarProducto();
                    break;
                case 4:
                    s1.mostrarProductos();
                    break;
                case 5:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 5));
    }
    
}
