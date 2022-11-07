package servicio;

import entidad.Pass;
import java.util.Scanner;

public class Servicios {

    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPass(Pass p1) {
        System.out.println("Ingrese la nueva contraseña");
            p1.setPass(leer.next());
        while (p1.getPass().length() != 10) {
            System.out.println("Ingrese nuevamente su contraseña, tiene que tener 10 caracteres");
            p1.setPass(leer.next());
        }
        System.out.println("Su contraseña es valida");
        p1.setVal(true);

    }

    public void analizarPass(Pass p1) {
        int contador = 0;
        for (int i = 0; i < p1.getPass().length(); i++) {
            if (String.valueOf(p1.getPass().charAt(i)).equalsIgnoreCase("a")) {
                contador++;
            }

        }
        if (contador >= 2 && p1.getPass().contains("z") || p1.getPass().contains("Z")) {
            System.out.println("LA CPONTRASEÑA ES DE NIVEL ALTO");
        } else if (p1.getPass().contains("z") || p1.getPass().contains("Z")) {
            System.out.println("LA CONTRASEÑA ES DE NIVEL MEDIO");
        } else {
            System.out.println("LA CONTRASEÑA ES DE NIVEL BAJO");
        }

    }

    public boolean validacion(Pass p1) {
        System.out.println("Ingrese su contraseña");
        String password = leer.next();
        int cont = 0;
        while (cont < 3 && !password.equals(p1.getPass())) {
            System.out.println("La contraseña no es correcta, ingresala nuevamente");
            password = leer.next();
            cont++;
        }
        return cont < 3;
    }

    public void menu(Pass p1) {
        int opcion = 0;

        do {
            System.out.println("\t.:Menu:.");
            System.out.println("1 - Ingresa Contraseña");
            System.out.println("2 - Nivel de Contraseña");
            System.out.println("3 - Modificar Contraseña");
            System.out.println("4 - Modificar Nombre");
            System.out.println("5 - Modificar DNI");
            System.out.println("6 - Mostrar datos de usuario");
            System.out.println("7 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    if (p1.isVal() == false) {
                        crearPass(p1);
                    }

                    break;
                case 2:
                    analizarPass(p1);
                    break;
                case 3:
                    if (p1.isVal()) {
                        if (validacion(p1)) {
                            crearPass(p1);
                            
                        } else {
                            System.out.println("Usuario bloqueado, utilizaste los 3 intentos");
                        }
                    } else {
                        System.out.println("Usted no posee una contraseña registrada, vaya a la opcion 1");
                    }

                    break;
                case 4:
                    if (validacion(p1)) {
                        System.out.println("Ingrese un nuevo nombre");
                        p1.setNombre(leer.next());
                    } else {
                        System.out.println("Usuario bloqueado, utilizaste los 3 intentos");
                    }
                    break;
                case 5:
                    if (validacion(p1)) {
                        System.out.println("Ingrese un nuevo DNI");
                        p1.setDNI(leer.nextInt());
                    } else {
                        System.out.println("Usuario bloqueado, utilizaste los 3 intentos");
                    }
                    break;
                case 6:
                    System.out.println(p1);
                    break;
                case 7:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");

            }
        } while (opcion != 7);
    }
}
