package servicio;

import entidad.Tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Servicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Integer> tiendita = new HashMap();

    public void cargarProductos() {
        String opc="";

        do {
            Tienda t = new Tienda();
            System.out.println("Ingrese el nombre del producto");
            t.setProducto(leer.next());
            System.out.println("Ingrece el precio del producto");
            t.setPrecio(leer.nextInt());
            tiendita.put(t.getProducto(), t.getPrecio());
            System.out.println("Desea agregar otro producto? (SI/NO)");
            opc = leer.next();
        } while (!opc.equalsIgnoreCase("no"));

    }

    public void modificarPrecio() {
        if (tiendita.isEmpty()) {
            System.out.println("No hay nada cargado aun, vaya a cargar algun producto");
        } else {
            int cont = 0;
            System.out.println("Que producto desea modificar?");
            String opc1 = leer.next();
            for (Map.Entry<String, Integer> aux : tiendita.entrySet()) {
                if (aux.getKey().equalsIgnoreCase(opc1)) {
                    System.out.println("El precio actual del producto es de: " + aux.getValue());
                    System.out.println("Cual es el precio nuevo?");
                    Object value = aux.setValue(leer.nextInt());
                    cont++;
                }
                if (cont == 0) {
                    System.out.println("No se encontro el producto");
                }
            }
         /*   Esta forma reemplazaria el uso del for para ver si esta el 
            producto y modificar el precio.
            
            System.out.println("ingrese el nombre del prodcucto a modicar precio");
        String nombre = leer.next().toLowerCase();
        if (productos.containsKey(nombre)) {
            System.out.println("ingresar el nuevo precio");
            productos.replace(nombre, leer.nextInt()); //metodo para sobreescribir
        } else {
            System.out.println("ese producto no esta en la lista");

        }*/

        }
    }

    public void eliminarProducto() {
        if (tiendita.isEmpty()) {
            System.out.println("No hay nada cargado aun, vaya a cargar algun producto");
        } else {
            System.out.println("Que producto desea eliminar");
            String opc2 = leer.next();
            if (tiendita.containsKey(opc2)) {
                System.out.println("Se eliminó el producto: " + opc2);
                tiendita.remove(opc2);
            } else {
                System.out.println("No se encontró el producto");
            }
        }

    }

    public void mostrarProductos() {
        if (tiendita.isEmpty()) {
            System.out.println("No hay nada cargado aun, vaya a cargar algun producto");
        } else {
            System.out.println("El listado de productos es: ");
            System.out.println("-----------------------------");
            for (Map.Entry<String, Integer> aux : tiendita.entrySet()) {
                System.out.println("Producto: " + aux.getKey());
                System.out.println("Precio: " + aux.getValue());
            }
        }
    }
}
