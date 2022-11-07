/*
• Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles
soluciones.
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. Es
en el caso en que se tenga una única solución posible.
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b
 */
package servicio;

import entidad.Raices;
import java.util.Scanner;


public class Servicios {
    Scanner leer = new Scanner(System.in);
    public double getDiscriminante(Raices r){
        
        return (Math.pow(r.getB(), 2)-4*r.getA()*r.getC());
        
    }
    
    public boolean tieneRaices(Raices r){
        return getDiscriminante(r)>0;
    }
    
     public boolean tieneRaiz(Raices r){
        return getDiscriminante(r)==0;
    }
     
    public void obtenerRaices(Raices r){
        if (tieneRaices(r)) {
            System.out.println(((-r.getB()) + (Math.sqrt(getDiscriminante(r)))) / 2 * r.getA());
            System.out.println(((-r.getB()) - (Math.sqrt(getDiscriminante(r)))) / 2 * r.getA());
        }

    }
    
    public void obtenerRaiz(Raices r){
        if (tieneRaiz(r)) {
            System.out.println(((-r.getB()) + (Math.sqrt(getDiscriminante(r)))) / 2 * r.getA());
            
        }
    }
    
    public void calcular(Raices r){
        if (getDiscriminante(r)<0) {
            System.out.println("NO TIENE SOLUCION!!!!");
        }else if (tieneRaiz(r)) {
            obtenerRaiz(r);
        }else{
            obtenerRaices(r);
        }
    }
}
