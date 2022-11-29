/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.

Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
 */
package entidad;

import java.util.Scanner;


public final class Televisor extends Electrodomesticos {
    private Double pulgadas;
    private Boolean TDT=false;

    public Televisor() {
    }


    public Televisor(Double pulgadas, Boolean TDT, Double precio, Double peso, String color, Character consumoEnergetico) {
        super(precio, peso, color, consumoEnergetico);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public Double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Boolean getTDT() {
        return TDT;
    }

    public void setTDT(Boolean TDT) {
        this.TDT = TDT;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(Character consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }
    
    public void crearTelevisor(){
        System.out.println("");
        System.out.println("Electrodomestico TELEVISOR");
        System.out.println("");
        
         crearElectrodomestico();
        
        System.out.println("Ingrese las pulgados del televisor: ");
        this.pulgadas=leer.nextDouble();
        
        System.out.println("El televisor tiene TDT?");
        if (leer.next().equalsIgnoreCase("si")) {
          this.TDT=true; 
        }
 
    }
    
    public void precioFinal(){
        super.precioFinal();
        
        if (this.pulgadas>40d) {
            this.precio*=1.3; 
        }
        
        if (TDT) {
            this.precio+=500d;
        }
    }
}
