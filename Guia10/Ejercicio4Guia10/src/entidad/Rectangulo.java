/*
 Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package entidad;

import interfaz.CalculosFormas;


public class Rectangulo implements CalculosFormas{
    
    private double base, altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    

    @Override
    public void calcularArea() {
        double area = base * altura;
        System.out.println("El area del circulo es "+area);
    }

    @Override
    public void calcularPerimetro() {
         double perimetro= (base + altura) * 2;
        System.out.println("El perimetro del circulo es "+perimetro);
    }
    
}
