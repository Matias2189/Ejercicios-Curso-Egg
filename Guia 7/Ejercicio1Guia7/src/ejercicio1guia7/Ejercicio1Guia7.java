/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package ejercicio1guia7;

import ejercicio1guia7.service.LibroService;
import ejercicio1guia7.entidad.Libro;

public class Ejercicio1Guia7 {

  
    public static void main(String[] args) {
        
       LibroService libroservice = new LibroService();
       Libro l1 = libroservice.cargaLibro();
       libroservice.MostrarLib(l1);
       
    }
    
   
}
