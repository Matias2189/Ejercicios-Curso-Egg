
package servicio;

import entidad.Alumno;
import java.util.Scanner;


public class Servicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
     public Alumno crearAlumno() {
        int[] listanum = new int[3];
        System.out.println("Ingrese Nombre del Alumno: ");
        String nombre = leer.next();

        System.out.println("Ingrese la primera nota");
        listanum[0] = leer.nextInt();
        System.out.println("Ingrese la Segunda nota");
        listanum[1] = leer.nextInt();
        System.out.println("Ingrese la Tercera nota");
        listanum[2] = leer.nextInt();

        return new Alumno(nombre, listanum);

    }
    
    
     /**
     * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere
     * calcular su nota final y se lo busca en la lista de Alumnos. Si está en
     * la lista, se llama al método. Dentro del método se usará la lista notas
     * para calcular el promedio final de alumno. Siendo este promedio final,
     * devuelto por el método y mostrado en el main.
     *
     */
    public double notaFinal(Alumno a) {
        double prom = 0;
        for (int i = 0; i < a.getNotas().length; i++) {
            prom += a.getNotas()[i];
        }
        prom /= 3;
        return prom;
    }
    
}
