/*
Reparando Daños
Hay veces que se puede reparar los daños de un dispositivo, en general es el 40% de las
veces que se puede hacer. Utilizar la clase Random para modelar este comportamiento.
En caso de estar dentro de la probabilidad (es decir probabilidad menor o igual al 40%)
marcar el dispositivo como sano. Si no dejarlo dañado.
 */
package servicio;

import entidad.Armadura;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ArmaduraServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    DecimalFormat df = new DecimalFormat("0.##");

    public void menu(Armadura a) {

        int opc;
        do {
            a.consola();
            System.out.println("--------------- BIENVENIDO A JARVIS ---------------");
            System.out.println("");
            System.out.println("--------1) Acciones -------");
            System.out.println("--------2) Funciones -------");
            System.out.println("--------3) Salir del sistema -------");
            System.out.println("");
            System.out.println("------------------------------------------------");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    a.consola();
                    menuAcciones(a);
                    break;
                case 2:
                    a.consola();
                    menuFunciones(a);
                    break;
                case 3:
                    a.consola();
                    break;
                default:
                    a.consola();
                    System.out.println("La opcion ingresada no es correcta, fijate bien lo que tocas!");
            }
        } while (opc != 3);

    }

    public void menuAcciones(Armadura a) {
        int opc;
        int t;
        do {
            a.consola();
            System.out.println("------------- ACCIONES ----------------");
            System.out.println("");
            System.out.println("--------1) Caminar -------");
            System.out.println("--------2) Correr -------");
            System.out.println("--------3) Propulsarse -------");
            System.out.println("--------4) Volar -------");
            System.out.println("--------5) Armas -------");
            System.out.println("--------6) Volver a menu anterior -------");
            System.out.println("");
            System.out.println("------------------------------------------------");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    a.consola();
                    System.out.println("Ingrese cuanto tiempo desea caminar (expresado en minutos)");
                    t = leer.nextInt();
                    a.caminar(t);
                    break;
                case 2:
                    a.consola();
                    System.out.println("Ingrese cuanto tiempo desea correr (expresado en minutos)");
                    t = leer.nextInt();
                    a.correr(t);
                    break;
                case 3:
                    a.consola();
                    System.out.println("Ingrese cuanto tiempo desea propulsarse (expresado en minutos)");
                    t = leer.nextInt();
                    a.propulsarse(t);
                    break;
                case 4:
                    a.consola();
                    System.out.println("Ingrese cuanto tiempo desea volar (expresado en minutos)");
                    t = leer.nextInt();
                    a.volar(t);
                    break;
                case 5:
                    a.consola();
                    System.out.println("Ingrese cuanto tiempo desea utilizar armas (expresado en minutos)");
                    t = leer.nextInt();
                    a.armas(t);
                    break;
                case 6:
                    a.consola();
                    break;
                default:
                    a.consola();
                    System.out.println("La opcion ingresada no es correcta, fijate bien lo que tocas!");
            }
        } while (opc != 6);
    }

    public void menuFunciones(Armadura a) {
        int opcion;

        do {
            a.consola();
            System.out.println("------------- FUNCIONES ----------------");
            System.out.println("");
            System.out.println("--------1) Mostrar Estado de Armadura -------");
            System.out.println("--------2) Mostrar Estado de Bateria --------");
            System.out.println("--------3) Mostrar Información del Reactor---");
            System.out.println("--------4) Reparar Daños -------");
            System.out.println("--------5) Volver a Menu -------");
            System.out.println("");
            System.out.println("------------------------------------------------");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    a.consola();
                    mostrarEstado(a);
                    break;
                case 2:
                    a.consola();
                    estadoBateria(a);
                    break;
                    case 3:
                    a.consola();
                    convertirReactor(a);
                    break;
                case 4:
                    a.consola();
                    repararDaños(a);
                    break;
                case 5:
                    a.consola();
                    System.out.println("Regresando a menu anterior...");
                    break;
                default:
                    a.consola();
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 5));
    }

    public void mostrarEstado(Armadura a) {
       
        System.out.println("------- Estado de Armadura ---------");
        System.out.println("");
        estadoBateria(a);
        if (a.botOp) {
            System.out.println("-- Las botas estan operativas ------");
        } else {
            System.out.println("-- Reparame las botas wachin ----");
        }
        if (a.guanOp) {
            System.out.println("-- Los guantes estan operativos ----");
        } else {
            System.out.println("-- Reparame los guantes wachin --");
        }
        System.out.println("-- Casco ATR!!! -------------------- ");
        System.out.println("-- Salud de armadura " + a.getNivelSalud() + "% ----------");
        System.out.println("");
        System.out.println("------------------------------------");
    }

    public void estadoBateria(Armadura a) {
       
        System.out.println("-- La energia del nucleo es del " + ((a.getEnergia() * 100) / 1000) + "%-");
    }

    public void repararDaños(Armadura a) {
        
        if (a.botOp == false) {
            System.out.println("Se estan tratando de reparar las botas");
            System.out.println("...");
            System.out.println("..");
            System.out.println(".");
            int num = (int) (Math.random() * 10) + 1;
            if (num <= 4) {
                a.setBotOp(true);
                System.out.println("Se repararon las botas :)");
                a.setEnergia(a.getEnergia() - 50);
            } else {
                System.out.println("Los daños no se pueden reparar en este momento :´(");
            }
        }else{
            System.out.println("Las botas no necesitan ser reparadas soquete!!!");
        }

        if (a.guanOp == false) {
            System.out.println("Se estan tratando de reparar los guantes");
            System.out.println("...");
            System.out.println("..");
            System.out.println(".");
            int num = (int) (Math.random() * 10) + 1;
            if (num <= 4) {
                a.setGuanOp(true);
                System.out.println("Se repararon los guantes :)");
                a.setEnergia(a.getEnergia() - 50);
            } else {
                System.out.println("Los daños no se pueden reparar en este momento :´(");
            }
        }else{
            System.out.println("Los guantes no necesitan ser reparadas papanatas!!!");
        }

    }
    
    public void convertirReactor(Armadura a){
        double wh = (double)a.getEnergia()/3599.997;
        System.out.println("El estado de energia expresado en vatios/hora es: "+df.format(wh)+"Wh");
        double Kcal = (double)a.getEnergia()/4184.0;
        System.out.println("El estado de energia expresado en KiloCalorias es: "+df.format(Kcal)+"Kcal");
    }

}
