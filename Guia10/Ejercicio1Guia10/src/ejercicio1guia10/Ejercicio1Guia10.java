/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package ejercicio1guia10;

import entidad.Animal;
import entidad.Caballo;
import entidad.Gato;
import entidad.Perro;

/**
 *
 * @author MATIAS
 */
public class Ejercicio1Guia10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro1 = new Perro("Chiquito", "Carne", 5, "perro");
        perro1.alimentarese();
        
        Animal perro2 = new Perro("Fernando", "Sushi", 7, "perro");
        perro2.alimentarese();
        
        Animal gato1 = new Gato("Lola", "Balanceado", 2, "gato");
        gato1.alimentarese();
        
        Animal caballo1 = new Caballo("Tiro al Blanco", "Alfalfa", 20, "caballo");
        caballo1.alimentarese();
    }
    
}
