/*
 Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
 */
package entidad;

import java.util.Scanner;

public abstract class Electrodomesticos {

    protected Double precio, peso;
    protected String color;
    protected Character consumoEnergetico;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Electrodomesticos() {
    }

    public Electrodomesticos(Double precio, Double peso, String color, Character consumoEnergetico) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
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

    public void comprobarConsumoEnergetico(char letra) {
        if (letra > 'F' || letra < 'A') {
            this.consumoEnergetico = 'F';
        }
    }

    public void comprobarColor(String color) {
        if (!color.equalsIgnoreCase("negro") && !color.equalsIgnoreCase("rojo")
                && !color.equalsIgnoreCase("azul") && !color.equalsIgnoreCase("gris")) {
            this.color = "Blanco";
        }
    }

    public void crearElectrodomestico() {
        this.precio = 1000d;

        System.out.println("Ingrese el color del electrodomestico: ");
        this.color = leer.next();

        comprobarColor(getColor());

        System.out.println("Ingrese el consumo energetico del Electrodomestico (Entre A y F)");
        this.consumoEnergetico = leer.next().toUpperCase().charAt(0);

        comprobarConsumoEnergetico(getConsumoEnergetico());

        System.out.println("Ingreso peso del Electrodomestico: ");
        this.peso = leer.nextDouble();
        while (this.peso < 1) {
            System.out.println("ingrese un peso mayor o igual a 1");
            this.peso = leer.nextDouble();
        }

    }

    public void precioFinal() {

        switch (this.consumoEnergetico) {
            case 'A':
                this.precio += 1000d;
                break;
            case 'B':
                this.precio += 800d;
                break;
            case 'C':
                this.precio += 600d;
                break;
            case 'D':
                this.precio += 500d;
                break;
            case 'E':
                this.precio += 300d;
                break;
            case 'F':
                this.precio += 100d;
                break;
        }

        if (this.peso > 80) {
            this.precio += 1000d;
        } else if (this.peso > 50) {
            this.precio += 800d;
        } else if (this.peso > 20) {
            this.precio += 500d;
        } else {
            this.precio += 100d;
        }
    }
}
