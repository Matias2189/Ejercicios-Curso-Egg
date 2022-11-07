 
package servicio;

import java.util.Scanner;
import entidad.Cadena;
import servicio.Servicio;

public class Servicio {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    public void mostrarVocales(Cadena c){
        String palabra = c.getFrase();
        palabra=palabra.toLowerCase();
        int cont=0;
        
        for (int i = 0; i < c.getLongitud(); i++) {
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u') {
                cont++;
            }
        }
        System.out.println("Hay un total de "+cont+" vocales");
    }
    
    public void invertirFrase(Cadena c){
        for (int i = c.getLongitud()-1; i >= 0; i--) {
            System.out.print(c.getFrase().charAt(i));
        }
        System.out.println(" ");
    }
    
    public void vecesRepetido(Cadena c){
        
        String palabra = c.getFrase(), letra;
        palabra=palabra.toLowerCase();
        int cont=0;
        System.out.println("Ingrese una letra y veremos cuantas veces se encuentra en la frase");
        letra=leer.next();
        letra=letra.toLowerCase();
        // para usar chart---> palabra.chart(i)==letra.chart(0)
        for (int i = 0; i < c.getLongitud(); i++) {
            if (palabra.substring(i, i+1).equals(letra)) {
                cont++;
            }
        }
        System.out.println("Se repite un total de "+cont+" veces en la frase");
    }
    
    public void compararLongitud(Cadena c){
        String frase2;
        int longitud2;
        System.out.println("Ingrese una nueva frase");
        frase2=leer.next();
        longitud2=frase2.length();
        if (c.getLongitud()>longitud2) {
            System.out.println("La frase ingresada es mas corta");
        }else{
            System.out.println("La frase ingresada es mas larga");
        }
    }
    
    public void unirFrase(Cadena c){
        String frase2;
        System.out.println("Ingrese una nueva frase");
        frase2=leer.next();
        
        c.setFrase(c.getFrase()+" "+frase2);
        System.out.println("La frase concatenada es: "+c.getFrase());
        c.setLongitud((c.getFrase().length()));
    }
    
    public void reemplazar(Cadena c){
        String letra;
        String palabra=c.getFrase();
        
        System.out.println("Ingrese un caracter o letra para reemplazar la letra a");
        letra=leer.next();
        
        for (int i = 0; i < c.getLongitud(); i++) {
            
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'A' ) {
                palabra = palabra.replace('a', letra.charAt(0));
            }
        }
        System.out.println(palabra);
    }
    
    public boolean contiene(Cadena c, String letra){
        String palabra = c.getFrase().toLowerCase();         
        return c.getFrase().contains(letra);
        
    }
}
