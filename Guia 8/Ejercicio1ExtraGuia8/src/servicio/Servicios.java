package servicio;

import alumno.Alumnos;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import comparadores.Comparador;
import java.util.Collections;

public class Servicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumnos> aL = new ArrayList();
     ArrayList<Alumnos> aLArg = new ArrayList();
        ArrayList<Alumnos> aLChi = new ArrayList();
        ArrayList<Alumnos> aLVen = new ArrayList();

    public void menu() {

        int opcion = 0;

        do {
            System.out.println("........ MENU ........");
            System.out.println("Vamos a cargar los datos de los alumnos");
            System.out.println("1) Alta de alumno");
            System.out.println("2) Mostrar");
            System.out.println("3) Baja alumno");
            System.out.println("4) Modificación de alumno");
            System.out.println("5) Ordenar alfabéticamente los apellidos en forma ascendente");
            System.out.println("6) Ordenar alfabéticamente los nombres en forma descendente");
            System.out.println("7) Calcular edad");
            System.out.println("8) Lista de alumnos por Nacionalidad");
            System.out.println("9) Reporte Final");
            System.out.println("0) Salir");

            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    alta();
                    break;
                case 2:
                    mostrar();
                    break;
                case 3:
                    baja();
                    break;
                case 4:
                    modificar();
                    break;
                case 5:
                    ordenarAsc();
                    break;
                case 6:
                    ordenarDesc();
                    break;
                case 7:
                    mostrarEdad();
                    break;
                case 8:
                    alumnosPorNacionalidad();
                    break;
                case 9:
                    reporteFinal();
                    break;
                case 0:

                    break;
                default:
            }
        } while (opcion != 0);

    }

    public void alta() {
        String opc = "";
        int opciones;
        do {
            Alumnos a = new Alumnos();
            System.out.println("Ingrese el nombre del alumno");
            a.setNombre(leer.next());
            System.out.println("Ingrese el apellido del alumno");
            a.setApellido(leer.next());
            System.out.println("Ingrese la nacionalidad del alumno");
            do {
                System.out.println("opcion 1) Argentina");
                System.out.println("opcion 2) Chilena");
                System.out.println("opcion 3) Venezolana");
                System.out.println("Ingrese la opción deseada");
                opciones = leer.nextInt();

                switch (opciones) {
                    case 1:
                        a.setNacionalidad("Argentina");
                        break;
                    case 2:
                        a.setNacionalidad("Chilena");
                        break;
                    case 3:
                        a.setNacionalidad("Venezolana");
                        break;
                    default:
                        System.out.println("Error. Esa opción no está en el menú.");
                        System.out.println("Recuerde que las nacionalidades disponibles son: ");
                        System.out.println("Argentina - Chilena - Venezolana");
                }
            } while (opciones < 1 || opciones > 4);
            System.out.println("Ingrese fecha de nacimiento");
            System.out.println("Ingrese el dia: ");
            int dia = leer.nextInt();
            System.out.println("Ingrese el mes: ");
            int mes = leer.nextInt();
            System.out.println("Ingrese el año: ");
            int anio = leer.nextInt();
            Date nacimiento = new Date(anio - 1900, mes - 1, dia);
            a.setNacimiento(nacimiento);
            aL.add(a);
            System.out.println("desea ingresar otro alumno? (SI/NO)");
            opc = leer.next();
        } while (!opc.equalsIgnoreCase("no"));

    }

    public void mostrar() {
        System.out.println("Mostraremos el listado de alumnos cargados a continuacion: ");
        for (Alumnos aux : aL) {
            System.out.println(aux);
        }
    }

    public void baja() {
        Alumnos a = new Alumnos();
        System.out.println("Ingrese el nombre del alumno que desea elminiar ");

        String comparar1 = leer.next();
        System.out.println("Ingrese el apellido del alumno que desea eliminar");
        String comparar2 = leer.next();
        int conta = 0;
        for (Alumnos var : aL) {
            if (var.getNombre().equalsIgnoreCase(comparar1) && var.getApellido().equalsIgnoreCase(comparar2)) {
                aL.remove(var);
                conta++;
                System.out.println("Se dió de baja correctamente al alumno " + comparar2 + ", " + comparar1);
                break;
            }
        }

        if (conta == 1) {
            System.out.println("Se encontro el nombre y se eliminara de la lista ");
            System.out.println("Los alumnos que quedaron son: ");
            for (Alumnos aux : aL) {

                System.out.println(aux);
            }
        } else {
            System.out.println("No se encontro el alumno en el listado");
        }
    }

    public void modificar() {
        Alumnos a = new Alumnos();
        System.out.println("Que alumno desea modificar?");
        System.out.println("Ingrese nombre");
        String comparar = leer.next();
        System.out.println("Ingrese nombre");
        String comparar2 = leer.next();
        int conta = 0;
        int opciones;
        for (Alumnos aux : aL) {
            if (aux.getNombre().equalsIgnoreCase(comparar) && aux.getApellido().equalsIgnoreCase(comparar2)) {
                System.out.println("Se encontro el alumno");
                do {
                    System.out.println("Vamos a modificar los datos del alumno que ingresó: " + comparar + ", " + comparar2);
                    System.out.println("Qué datos desea cambiar?");
                    System.out.println("1) Nombre");
                    System.out.println("2) Apellido");
                    System.out.println("3) Nacionalidad");
                    System.out.println("4) Fecha de nacimiento");
                    System.out.println("0) Salir");
                    System.out.println("Ingrese su opción");
                    opciones = leer.nextInt();
                    switch (opciones) {
                        case 1:
                            System.out.println("Ingrese el nombre del Alumno");
                            aux.setNombre(leer.next());
                            break;
                        case 2:
                            System.out.println("Ingrese el apellido del Alumno");
                            aux.setApellido(leer.next());
                            break;
                        case 3:
                            System.out.println("Ingrese la nacionalidad del Alumno");
                            do {
                                System.out.println("opcion 1) Argentina");
                                System.out.println("opcion 2) Chilena");
                                System.out.println("opcion 3) Venezolana");
                                System.out.println("Ingrese la opción deseada");
                                opciones = leer.nextInt();
                                switch (opciones) {
                                    case 1:
                                        aux.setNacionalidad("Argentina");
                                        break;
                                    case 2:
                                        aux.setNacionalidad("Chilena");
                                        break;
                                    case 3:
                                        aux.setNacionalidad("Venezolana");
                                        break;
                                    default:
                                        System.out.println("Error. Esa opción no está en el menú.");
                                        System.out.println("Recuerde que las nacionalidades disponibles son: ");
                                        System.out.println("Argentina - Chilena - Venezolana");
                                }
                            } while (opciones < 1 || opciones > 3);
                            break;
                        case 4:
                            System.out.println("Cambiamos el día de nacimiento");
                            int dia = leer.nextInt();

                            System.out.println("Cambiamos el mes de nacimiento");
                            int mes = leer.nextInt();

                            System.out.println("Cambiamos el año de nacimiento");
                            int anio = leer.nextInt();

                            Date nac = new Date(anio - 1900, mes - 1, dia);
                            a.setNacimiento(nac);
                            break;
                        default:
                            System.out.println("Ingresó una opción incorrecta");
                    }
                } while (opciones != 0);
                conta++;

                System.out.println("Se modificó correctamente el alumno " + comparar + ", " + comparar2);
                break;
            }
        }
        if (conta == 0) {
            System.out.println(" El alumno " + comparar + ", " + comparar2 + " no se encuentra en la lista");
        }
        for (Alumnos aux : aL) {
            System.out.println(aux);
        }
    }

    public void crearLista() {
        Alumnos a = new Alumnos();
        Date nac = new Date(1989 - 1900, 3 - 1, 21);
        a.setNombre("Matias");
        a.setApellido("Bevione");
        a.setNacionalidad("Argentina");
        a.setNacimiento(nac);

        aL.add(a);

        Alumnos b = new Alumnos();

        Date nac1 = new Date(1988 - 1900, 3 - 1, 21);
        b.setNombre("Oscar");
        b.setApellido("Bevione");
        b.setNacionalidad("Argentina");
        b.setNacimiento(nac1);

        aL.add(b);

        Alumnos c = new Alumnos();

        Date nac2 = new Date(1987 - 1900, 3 - 1, 21);
        c.setNombre("Nicolas");
        c.setApellido("Suarez");
        c.setNacionalidad("Argentina");
        c.setNacimiento(nac2);
        aL.add(c);

        Alumnos d = new Alumnos();

        Date nac3 = new Date(1986 - 1900, 3 - 1, 21);
        d.setNombre("Pedro");
        d.setApellido("Gomez");
        d.setNacionalidad("Chilena");
        d.setNacimiento(nac3);
        aL.add(d);

        Alumnos e = new Alumnos();

        Date nac4 = new Date(1985 - 1900, 3 - 1, 21);
        e.setNombre("Guille");
        e.setApellido("Moyano");
        e.setNacionalidad("Chilena");
        e.setNacimiento(nac4);
        aL.add(e);

        Alumnos f = new Alumnos();

        Date nac5 = new Date(1984 - 1900, 3 - 1, 21);
        f.setNombre("Gonza");
        f.setApellido("Barraza");
        f.setNacionalidad("Chilena");
        f.setNacimiento(nac5);
        aL.add(f);

        Alumnos g = new Alumnos();

        Date nac6 = new Date(1983 - 1900, 3 - 1, 21);
        g.setNombre("Pedro");
        g.setApellido("Chavez");
        g.setNacionalidad("Venezolana");
        g.setNacimiento(nac6);
        aL.add(g);

        Alumnos h = new Alumnos();

        Date nac7 = new Date(1982 - 1900, 3 - 1, 21);
        h.setNombre("Agustina");
        h.setApellido("Perez");
        h.setNacionalidad("Venezolana");
        h.setNacimiento(nac7);
        aL.add(h);

        Alumnos i = new Alumnos();

        Date nac8 = new Date(1992 - 1900, 3 - 1, 21);
        i.setNombre("Yuliana");
        i.setApellido("Lopez");
        i.setNacionalidad("Argentina");
        i.setNacimiento(nac8);
        aL.add(i);

        Alumnos j = new Alumnos();

        Date nac9 = new Date(1980 - 1900, 3 - 1, 21);
        j.setNombre("Leonor");
        j.setApellido("Sappia");
        j.setNacionalidad("Venezolana");
        j.setNacimiento(nac9);
        aL.add(j);
        
        
    }

    public void ordenarAsc() {
        System.out.println("Ordenamios alfabeticamente por apellido de manera Ascendente");
        Collections.sort(aL, Comparador.apellidoAsc);
        for (Alumnos aux : aL) {
            System.out.println(aux);
        }
    }

    public void ordenarDesc() {
        System.out.println("Ordenamios alfabeticamente por nombre de manera Descendente");
        Collections.sort(aL, Comparador.nombreDesc);
        for (Alumnos aux : aL) {
            System.out.println(aux);
        }
    }

    public void mostrarEdad() {
        int edad = 0;
        int año = 0;
        Date fechaActual = new Date();
        System.out.println("Fecha actual: " + fechaActual);

        System.out.println("Ingrese nombre de alumno al que quiere calcularle edad");
        String nombre = leer.next();
        System.out.println("Ingrese apellido de alumno al que quiere calcularle edad");
        String apellido = leer.next();

        for (Alumnos aux : aL) {

            if (nombre.equalsIgnoreCase(aux.getNombre()) && apellido.equalsIgnoreCase(aux.getApellido())) {
                edad = fechaActual.getYear() - aux.getNacimiento().getYear();
                System.out.println("La edad de " + nombre + " " + apellido + " es " + edad);
                break;
            }

        }

        if (edad == 0) {
            System.out.println("No hay alumnos con ese nombre");
        }
    }

    public void alumnosPorNacionalidad() {
       

        for (Alumnos aux : aL) {
            if (aux.getNacionalidad().equalsIgnoreCase("Argentina")) {
                aLArg.add(aux);
            } else if (aux.getNacionalidad().equalsIgnoreCase("Chilena")) {
                aLChi.add(aux);
            } else if (aux.getNacionalidad().equalsIgnoreCase("Venezolana")) {
                aLVen.add(aux);
            }
        }

        int opcion;

        do {
            System.out.println("\t.:Menu:.");
            System.out.println("Seleccione la nacionalidad de los alumnos a consultar: ");
            System.out.println("1 - Argentina");
            System.out.println("2 - Chilena");
            System.out.println("3 - Venezolana");
            System.out.println("4 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    for (Alumnos aux : aLArg) {
                        System.out.println(aux);
                    }
                    break;
                case 2:
                    for (Alumnos aux : aLChi) {
                        System.out.println(aux);
                    }
                    break;
                case 3:
                    for (Alumnos aux : aLVen) {
                        System.out.println(aux);
                    }
                    break;
                case 4:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 4));

    }

    public void reporteFinal() {
        //alumnos > 25
        //cuantos alumnos apellido comienzan con  L o P
        //Cuantos alumnos hay de nacionalidad ARGENTINA – CHILENA – VENEZOLANA.
        int edad = 0;
        int cont = 0;
        int contA = 0;
        int contNA=0,contNC=0,contNV=0;
        
        Date fechaActual = new Date();
        
        for (Alumnos aux : aL) {
            edad = fechaActual.getYear() - aux.getNacimiento().getYear();
            if (edad > 25) {
                cont++;
            }
            if (aux.getApellido().startsWith("L") || aux.getApellido().startsWith("P")) {
              contA++;  
            }        
        }
        
        
        for (Alumnos aux : aL) {
            if (aux.getNacionalidad().equalsIgnoreCase("Argentina")) {
                contNA++;
            }else if (aux.getNacionalidad().equalsIgnoreCase("Chilena")) {
                contNC++;
            }else if (aux.getNacionalidad().equalsIgnoreCase("Venezolana")) {
                contNV++;
            }
        }
        
        
        System.out.println("Hay "+ cont +" alumnos mayores de 25 años");
        System.out.println("Hay "+ contA +" cuyo apellido comienzan con L o P");
        System.out.println("Hay "+ contNA +" alumnos cuya nacinoalidad es Argentina");
        System.out.println("Hay "+ contNC +" alumnos cuya nacinoalidad es Chilena");
        System.out.println("Hay "+ contNV +" alumnos cuya nacinoalidad es Venezolana");
    }
}
