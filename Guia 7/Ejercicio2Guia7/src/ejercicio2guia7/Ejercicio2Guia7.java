/*
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (AREA = pi ∗ radio2).
e) Método perimetro(): para calcular el perímetro (PERIMETRO = 2 ∗ pi ∗ radio).
 */
package ejercicio2guia7;

import ejercicio2guia7.entidad.Circunferencia;
import ejercicio2guia7.service.Servicio;

public class Ejercicio2Guia7 {

   
    public static void main(String[] args) {
        Servicio s1 = new Servicio(); // instanciamos libreria con acciones
        Circunferencia O1 = new Circunferencia(0);
        s1.crearCircunferencia(O1);
        System.out.println("El area es "+s1.area(O1));
        System.out.println("El perimetro es "+ s1.perimetro(O1));
    }
    
}



