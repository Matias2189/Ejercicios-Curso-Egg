/*
 Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.


Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package ejercicio2extraguia10;

import entidad.Edificio;
import entidad.EdificioDeOficinas;
import entidad.Polideportivo;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2ExtraGuia10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Edificio> edificios = new ArrayList();
        Polideportivo poli1 = new Polideportivo();
        Polideportivo poli2 = new Polideportivo();
        EdificioDeOficinas ofi1 = new EdificioDeOficinas();
        EdificioDeOficinas ofi2 = new EdificioDeOficinas();

        System.out.println("Ingrese informacion del Polideportivo 1");
        poli1.crearEdificio();

        edificios.add(poli1);

        System.out.println("Ingrese informacion del Polideportivo 2");
        poli2.crearEdificio();
        poli2.calcularSuperficie();
        poli2.calcularVolumen();
        edificios.add(poli2);

        System.out.println("Ingrese informacion del Edificio de Oficinas 1");
        ofi1.crearEdificio();
        ofi1.calcularSuperficie();
        ofi1.calcularVolumen();
        edificios.add(ofi1);

        System.out.println("Ingrese informacion del Edificio de Oficinas 2");
        ofi2.crearEdificio();
        ofi2.calcularSuperficie();
        ofi2.calcularVolumen();
        edificios.add(ofi2);
        
        int contP=0;
        int contE=0;
        int contT = 0;
        int contNT = 0;
        for (Edificio aux : edificios) {
            aux.calcularSuperficie();
            aux.calcularVolumen();

            if (aux instanceof Polideportivo) {
                contP++;
                if (((Polideportivo) aux).getTipoInst() == "Techado") {
                    contT++;
                } else {
                    contNT++;
                }
                System.out.println("La superficie del "+aux+contP+" es "+aux.getSuperficie());
            System.out.println("El volumen del "+aux+contP+" es "+aux.getVolumen());
            } else {
                contE++;
                System.out.println("La superficie del "+aux+contE+" es "+aux.getSuperficie());
            System.out.println("El volumen del "+aux+contE+" es "+aux.getVolumen());
            }
            
        }

        System.out.println("Tenemos " + contT + " polideportivos Techados y " + contNT + " Abiertos");

    }

}
