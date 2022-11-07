/*
• Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en
mayúscula; por ejemplo: 00395469-F).
 */
package servicio;

import entidad.NIF;
import java.util.Scanner;

public class Servicios {

    Scanner leer = new Scanner(System.in);

    public void crearNif(NIF n) {
//String vector[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
//la opcion con vector
        n.setLetra("TRWAGMYFPDXBNJZSQVHLCKE");
        System.out.println("Ingrese su DNI");
        n.setDNI(leer.nextInt());
        int Nif = (int) n.getDNI() % 23;
        System.out.println(Nif);
        //n.setL(vector[Nif]);
        char l = n.getLetra().charAt(Nif);
        n.setL(l);
    }

    public void mostrar(NIF n) {
        System.out.println(String.format("%08d", n.getDNI()) + "-" + n.getL());

    }

}
