/*
 Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package ejercicio8guia7;

import java.util.Scanner;
import entidad.Cadena;
import servicio.Servicio;

public class Ejercicio8Guia7 {

   
    public static void main(String[] args) {
        Servicio cs = new Servicio();
        Cadena c = new Cadena();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese una frase");
        c.setFrase(leer.next());
        c.setLongitud(c.getFrase().length());
        cs.mostrarVocales(c);
        cs.invertirFrase(c);
        cs.vecesRepetido(c);
        cs.compararLongitud(c);
        cs.unirFrase(c);
        cs.reemplazar(c);
        System.out.println("Ingrese una letra y veremos si esta o no...");
        String letra=leer.next();
        letra=letra.toLowerCase();
        cs.contiene(c, letra);
        if (cs.contiene(c, letra)) {
            System.out.println("La frase contiene la letra buscada");
        }else{
            System.out.println("La frase NO contiene la letra buscada");
        }
        
    }
    
}
