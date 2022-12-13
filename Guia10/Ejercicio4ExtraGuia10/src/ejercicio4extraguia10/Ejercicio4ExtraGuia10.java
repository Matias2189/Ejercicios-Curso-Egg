/*
Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de
información debe gestionar esta aplicación:
• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
• En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
• Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).


El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
continuación, debe programar las clases definidas en las que, además de los constructores,
hay que desarrollar los métodos correspondientes a las siguientes operaciones:
• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.
 */
package ejercicio4extraguia10;

import entidades.Empleado;
import entidades.Estudiante;
import entidades.Persona;
import entidades.PersonalDeServicio;
import entidades.Profesor;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4ExtraGuia10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       int cont=0;
       int opc=0; 
       
        Estudiante est = new Estudiante("Matematica", "Facu", "Cruz", "Soltero", 34282478);
        Estudiante est2 = new Estudiante("Algebra", "Juan", "Segura", "Pura Joda", 44242670);
        Profesor prof = new Profesor("Arquitectura", 1999, 20, "Matias", "Bevione", "Solterosqui", 34290814);
        Profesor prof2 = new Profesor("Abogacia", 2002, 15, "Guido", "Dagatti", "Casado con 20 hijos", 28814340);
        PersonalDeServicio persSer = new PersonalDeServicio("Biblioteca", 2010, 12, "Fernando", "Chiquito", "Enamorado de Chiquito", 16340520);
        PersonalDeServicio persSer2 = new PersonalDeServicio("Secretaría", 2015, 9, "La vaca", "Lola", "tiene cabeza y tiene cola", 12598432);
        
        ArrayList <Persona> personas = new ArrayList();
        ArrayList <Empleado> empleados = new ArrayList();
        ArrayList <Profesor> profesores = new ArrayList();
        ArrayList <PersonalDeServicio> personalServicios = new ArrayList();
        ArrayList <Estudiante> estudiantes = new ArrayList();
        
        estudiantes.add(est);
        estudiantes.add(est2);
        personalServicios.add(persSer);
        personalServicios.add(persSer2);
        profesores.add(prof);
        profesores.add(prof2);
        empleados.add(prof);
        empleados.add(prof2);
        empleados.add(persSer);
        empleados.add(persSer2);
        personas.addAll(empleados);
        personas.addAll(estudiantes);
        
        
        
        int opcion;

        do {
            System.out.println("\t.:Menu:.");
            System.out.println("1 - Ver Informacion de personas registradsa");
            System.out.println("2 - Modificar estado civil");
            System.out.println("3 - Reasignar despacho a un empleado");
            System.out.println("4 - Matricular estudiante ");
            System.out.println("5 - Cambiar de departamento a un profesor");
            System.out.println("6 - Trasladar de seccion a un personal de servicio");
            System.out.println("7 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    for (Persona aux : personas) {
                        System.out.println(aux);
                    }
                    break;
                case 2:
                    cont=0;
                   for (Persona aux : personas) {
                       cont++;
                       System.out.println(cont+"-"+aux);
                    }
                    System.out.println("Seleccione el numero de la persona que desea modificar");
                    opc=leer.nextInt();
                    personas.get(opc-1).cambioEstadoCivil();
                    break;
                case 3:
                    cont=0;
                    for (Empleado aux : empleados) {
                       cont++;
                       System.out.println(cont+"-"+aux);
                    }
                    System.out.println("Seleccione el numero del emplado que desea modificar");
                    opc=leer.nextInt();
                    empleados.get(opc-1).cambioDespacho();
                    break;
                case 4:
                    cont=0;
                    for (Estudiante aux : estudiantes) {
                       cont++;
                       System.out.println(cont+"-"+aux);
                    }
                    System.out.println("Seleccione el numero del estudiante que desea modificar");
                    opc=leer.nextInt();
                    estudiantes.get(opc-1).nuevoCurso();
                    break;
                case 5:
                    cont=0;
                     for (Profesor aux : profesores) {
                       cont++;
                       System.out.println(cont+"-"+aux);
                    }
                    System.out.println("Seleccione el numero del profesor que desea modificar");
                    opc=leer.nextInt();
                    profesores.get(opc-1).cambioDpto();
                    break;
                case 6:
                    cont=0;
                     for (PersonalDeServicio aux : personalServicios) {
                       cont++;
                       System.out.println(cont+"-"+aux);
                    }
                    System.out.println("Seleccione el numero del personal que desea modificar");
                    opc=leer.nextInt();
                    personalServicios.get(opc-1).cambioSeccion();
                    break;
                case 7:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 7));

        
    }

}
