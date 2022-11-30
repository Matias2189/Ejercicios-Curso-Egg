/*
 Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package ejercicio4guia10;

import entidad.Circulo;
import entidad.Rectangulo;
import java.util.Scanner;


public class Ejercicio4Guia10 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Circulo cir = new Circulo();
        Rectangulo rect = new Rectangulo();

        System.out.println("Vamos a crear un circulo para luego calcular su area y su perimetro!");
        System.out.println("Ingrese Radio del circulo: ");
        cir.setRadio(leer.nextDouble());
        
        System.out.println("");
        
        System.out.println("Ahora vamos a crear un rectangulo:");
        System.out.println("Ingrese base del rectangulo: ");
        rect.setBase(leer.nextDouble());
        
        System.out.println("");
        
        System.out.println("Ingrese altura del rectangulo: ");
        rect.setAltura(leer.nextDouble());
        
        cir.calcularArea();
        cir.calcularPerimetro();
        rect.calcularArea();
        rect.calcularPerimetro();
    }
    
}
