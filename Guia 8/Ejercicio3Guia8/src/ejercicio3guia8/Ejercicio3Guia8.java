/*
 Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package ejercicio3guia8;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;
import servicio.Servicios;

public class Ejercicio3Guia8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Servicios s1 = new Servicios();
        Alumno a = new Alumno();
        ArrayList<Alumno> estudiantes = new ArrayList();
        
        
        do {
            estudiantes.add(s1.crearAlumno());
            System.out.println("Quiere continuar creando alumnos?");
            if (leer.next().equalsIgnoreCase("no")) {
                break;
            }
        } while (true);

        System.out.println("Los alumnos son: ");
        for (Alumno aux : estudiantes) {
            System.out.println(aux.toString());
        }

        System.out.println("Ingrese el nombre del alumno para calcular la nota final:");
        String nombre = leer.next();
        double notaF = 0;
        int cont = 0;
        for (Alumno aux : estudiantes) {
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                notaF = s1.notaFinal(aux);
                cont++;
                break;
            }
        }
        if (cont == 0) {
            System.out.println("No se encontro el alumno " + nombre);
        } else {
            System.out.println("La nota final de " + nombre + " es: " + notaF);
        }
    }

}
