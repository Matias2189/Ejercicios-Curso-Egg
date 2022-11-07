/*
 Definir una clase triangulo que modelara triángulos isósceles . Definir los atributos necesarios para
operar. Crear los métodos correspondientes a la clase Entidad.
Crear un arreglo con 4 objetos de la clase
Crear los siguientes métodos:
● Calcular área
● Calcular perímetro
● Mostrar los datos del triangulo que tenga el área de mayor superficie
 */
package ejercicioextraextra5;

import entidad.Triangulo;
import servicio.Servicios;

public class EjercicioExtraExtra5 {

    public static void main(String[] args) {
        Servicios s1 = new Servicios();
        Servicios s2 = new Servicios();
        Servicios s3 = new Servicios();
        Servicios s4 = new Servicios();
        Triangulo t = new Triangulo();
        double vect[] = new double[4];
        int num = 0;
        double var = 0;

        System.out.println("Ingrese los valores del primer triangulo");
        s1.datos();
        vect[0] = s1.area();
        s1.perimetro();
        System.out.println("Ingrese los valores del segundo triangulo");
        s2.datos();
        vect[1] = s2.area();
        s2.perimetro();
        System.out.println("Ingrese los valores del tercer triangulo");
        s3.datos();
        vect[2] = s3.area();
        s3.perimetro();
        System.out.println("Ingrese los valores del cuarto triangulo");
        s4.datos();
        vect[3] = s4.area();
        s4.perimetro();
        
        for (int i = 0; i < 4; i++) {
            if (var<vect[i]) {
                var=vect[i];
                num=i+1;
            }
        }
        System.out.println("El área mas grande es de "+var+" y corresponde al triangulo número "+num);
    }

}
