/*
 ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
 */
package entidad;

import java.util.Scanner;

public abstract class Edificio {

    protected Double ancho;
    protected Double alto;
    protected Double largo;
    protected Double Superficie;
    protected Double Volumen;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Edificio() {
    }

    public Edificio(Double ancho, Double alto, Double largo, Double Superficie, Double Volumen) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        this.Superficie = Superficie;
        this.Volumen = Volumen;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Double getSuperficie() {
        return Superficie;
    }

    public void setSuperficie(Double Superficie) {
        this.Superficie = Superficie;
    }

    public Double getVolumen() {
        return Volumen;
    }

    public void setVolumen(Double Volumen) {
        this.Volumen = Volumen;
    }

    public abstract void calcularSuperficie();

    public abstract void calcularVolumen();
    
    public abstract void crearEdificio();

    
}
