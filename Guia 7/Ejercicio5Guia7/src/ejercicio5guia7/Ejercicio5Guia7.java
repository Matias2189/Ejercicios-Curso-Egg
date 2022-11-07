/*
 Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package ejercicio5guia7;

import entidad.CuentaBancaria;
import servicio.Servicio;
import java.util.Scanner;

public class Ejercicio5Guia7 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaBancaria c1=new CuentaBancaria();
        Servicio s1=new Servicio();
        int menu;
        boolean salir=false;
        do {
            System.out.println("        Menu         ");
            System.out.println("---------------------");
            System.out.println("1)Crear cuenta       ");
            System.out.println("2)Ingresar Dinero    ");
            System.out.println("3)Retirar Dinero     ");
            System.out.println("4)Extraccion Rapida  ");
            System.out.println("5)Consultar Saldo    ");
            System.out.println("6)Consultar Datos    ");
            System.out.println("7)Salir              ");
            System.out.println("---------------------");
            menu=leer.nextInt();
            switch(menu){
                case 1:
                    s1.crearCuenta(c1);
                    break;
                case 2:
                    s1.ingresar(c1);
                    break;
                case 3:
                    s1.retirar(c1);
                    break;
                case 4:
                    s1.extraccionRapido(c1);
                    break;
                case 5:
                    s1.consultarSaldo(c1);
                    break;
                case 6:
                   s1.consultarDatos(c1);
                   break;
                case 7:
                    System.out.println("Desea salir del menu (S/N)");
                    if (leer.next().equalsIgnoreCase("S")) {
                        salir=true;
                        System.out.println("nos vimos");
                    }
                   break;
                default:
                    System.out.println("Fijate bien la opcion que pones!!!");
                    break;
            }
        } while (salir!=true);
        
        
        
        
        
        
        
        
    }
    
}
