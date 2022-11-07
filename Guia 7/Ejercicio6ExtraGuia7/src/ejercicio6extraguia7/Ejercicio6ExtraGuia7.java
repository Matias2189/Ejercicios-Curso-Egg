/*AHORCADO DE VERDAD*/
package ejercicio6extraguia7;

import entidad.Ahorcado;
import servicio.Servicios;

public class Ejercicio6ExtraGuia7 {

    public static void main(String[] args) {
        Servicios s1 = new Servicios();
        Ahorcado a = new Ahorcado();

        s1.crearAhorcado(a);
        s1.mostrarGuiones(a);
        s1.ingresarLetra(a);
    }

}
