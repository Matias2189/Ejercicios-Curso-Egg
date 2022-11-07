
package servicio;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class Servicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    TreeSet <String> pais = new TreeSet();
    public void ingresarPais(){
        do {
            System.out.println("Ingrese un pais");
            pais.add(leer.next().toLowerCase());
            System.out.println("Desea ingresar otro pais? S/N");
        } while (!leer.next().equalsIgnoreCase("N"));
                
        
    }
    
    public void mostrarPais(){
        for (String aux : pais) {
            System.out.println(aux);
        }
    }
    
    public void buscarPais(){
        System.out.println("Ingrese pais a buscar para eliminar");
        String busc=leer.next().toLowerCase();
        int cont=0;
       
        
        Iterator <String> tuki = pais.iterator();
       
        while (tuki.hasNext()) {
            if (busc.equals(tuki.next())) {
                tuki.remove();
                cont++;
                System.out.println(cont);
            }
        }
        
        System.out.println("--------------------------------");
        if (cont==0) {
            System.out.println("NO SE ENCONTRO EL PAIS EN LA LISTA");
        }else{
            mostrarPais();
            //for (String aux : pais) {
               // System.out.println(aux);
            //}
        }
    }
}
