/*
1-
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

2-
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package ejercicio1guia8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class Ejercicio1Guia8 {

    
    public static void main(String[] args) {
        int cont=0;
        ArrayList<String> Raza = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String opc;
        do {
            System.out.println("Ingrese raza"); 
            Raza.add(leer.next());
            System.out.println("Desea ingresar una raza nueva SI/NO");
            opc = leer.next();
            while(!opc.equalsIgnoreCase("si") && !opc.equalsIgnoreCase("no")){
                System.out.println(opc+" no es una opcion valida, ingrese SI/NO");
                opc = leer.next();
            }
        } while (opc.equalsIgnoreCase("si"));
        
        Collections.sort(Raza, Comparadores.ordenarAsc);
        
        for (String aux : Raza) {
            System.out.println(aux);
        }
        
        System.out.println("Hay "+Raza.size()+" razas en la lista");
        System.out.println("");
        System.out.println("--------------------------------------------");
        
        System.out.println("Ingrese raza a buscar en la lista");
        String raz = leer.next();
        
        
        Iterator<String> it = Raza.iterator();
        
        while(it.hasNext()){
            String aux = it.next();
            
            if (aux.equalsIgnoreCase(raz)) {
                it.remove();
                cont++;
            }
        }
        
        if (cont>0) {
            System.out.println("La raza se encontro "+cont+ " veces en lña lista");
            System.out.println("Se elimino la raza de la lista");
        }else{
            System.out.println("No se encontro la raza en la lista");
        }
        
         Collections.sort(Raza, Comparadores.ordenarAsc);
        
        for (String aux : Raza) {
            System.out.println(aux);
        }
        
              
        System.out.println("Hay "+Raza.size()+" razas en la lista");
    }
    
}
