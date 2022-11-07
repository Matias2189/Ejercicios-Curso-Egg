/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package ejercicio4guia7;

import ejercicio4guia7.entidad.Rectangulo;
import ejercicio4guia7.service.Servicio;


public class Ejercicio4Guia7 {

    
    public static void main(String[] args) {
        Servicio accion = new Servicio();
        Rectangulo O1 = new Rectangulo();
        accion.crearRectangulo(O1);
        System.out.println("El area es "+accion.calcularSuperficie(O1));
        System.out.println("El perimetro es "+accion.calcularPerimetro(O1));
        accion.dibujarRectangulo(O1);
    }
    
}
