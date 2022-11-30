/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import interfaz.CalculosFormas;

/**
 *
 * @author MATIAS
 */
public class Circulo implements CalculosFormas{
    private double radio;

    public Circulo() {
    }
    
    

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    

    @Override
    public void calcularArea() {
        double area=PI_CONSTANTE * Math.pow(radio, 2);
        System.out.println("El area del circulo es "+area);
    }

    @Override
    public void calcularPerimetro() {
       double perimetro=PI_CONSTANTE * (radio * 2);
        System.out.println("El perimetro del circulo es "+perimetro);
    }
    
    
    
}
