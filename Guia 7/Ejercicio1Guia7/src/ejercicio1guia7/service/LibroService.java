
package ejercicio1guia7.service;

import ejercicio1guia7.entidad.Libro;
import java.util.Scanner;

public class LibroService {
    
    public LibroService() {
    }
    
    public Libro cargaLibro(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el Tìtulo, Autor, Numero de paginas y ISBN");
        Libro l1 = new Libro();
        l1.titulo = leer.nextLine();
        l1.autor = leer.nextLine();
        l1.Paginas = leer.nextInt();
        l1.ISBN = leer.nextInt();
        return l1;
    }
   
    public void MostrarLib(Libro l1){
        System.out.println(l1);
        System.out.println("Muchas gracias");
    }

    
    
    
}
