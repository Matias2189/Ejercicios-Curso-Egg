/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package ejercicio7guia7;

import servicio.Servicio;
import entidad.Persona;

public class Ejercicio7Guia7 {

  
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        Servicio ps = new Servicio();
        int contFlaco=0, contBien=0,contGordi=0, contPendex=0, contViejo=0;
        //se puede evitar repetir por cantidad de personas creando un arreglo (vector) y recorrerlo con un for
        System.out.println("================================");
        ps.crearPersona(p1);
        ps.calcularIMC(p1);
         if (ps.calcularIMC(p1) == -1) {
            System.out.println("Estas flaquito");
            contFlaco++;
        }else if (ps.calcularIMC(p1)==0) {
            System.out.println("Estas bien");
            contBien++;
        }else if (ps.calcularIMC(p1)==1) {
            System.out.println("Estas gordito");
            contGordi++;
        }
        if (ps.esMayorDeEdad(p1)){
            System.out.println("Estas viejo");
            contViejo++;
        }else{
            System.out.println("Sos un pendejo");
            contPendex++;
        }
        System.out.println("================================");
        ps.crearPersona(p2);
        if (ps.calcularIMC(p2) == -1) {
            System.out.println("Estas flaquito");
            contFlaco++;
        }else if (ps.calcularIMC(p2)==0) {
            System.out.println("Estas bien");
            contBien++;
        }else if (ps.calcularIMC(p2)==1) {
            System.out.println("Estas gordito");
            contGordi++;
        }
        if (ps.esMayorDeEdad(p2)){
            System.out.println("Estas viejo");
            contViejo++;
        }else{
            System.out.println("Sos un pendejo");
            contPendex++;
        }
        System.out.println("================================");
        ps.crearPersona(p3);
        if (ps.calcularIMC(p3) == -1) {
            System.out.println("Estas flaquito");
            contFlaco++;
        }else if (ps.calcularIMC(p3)==0) {
            System.out.println("Estas bien");
            contBien++;
        }else if (ps.calcularIMC(p3)==1) {
            System.out.println("Estas gordito");
            contGordi++;
        }
        if (ps.esMayorDeEdad(p3)){
            System.out.println("Estas viejo");
            contViejo++;
        }else{
            System.out.println("Sos un pendejo");
            contPendex++;
        }
        System.out.println("================================");
        ps.crearPersona(p4);
         if (ps.calcularIMC(p4) == -1) {
            System.out.println("Estas flaquito");
            contFlaco++;
        }else if (ps.calcularIMC(p4)==0) {
            System.out.println("Estas bien");
            contBien++;
        }else if (ps.calcularIMC(p4)==1) {
            System.out.println("Estas gordito");
            contGordi++;
        }
        if (ps.esMayorDeEdad(p4)){
            System.out.println("Estas viejo");
            contViejo++;
        }else{
            System.out.println("Sos un pendejo");
            contPendex++;
        }
        
        System.out.println("================================");
        System.out.println("El "+(100*contFlaco/4)+"% esta por debajo de su peso");
        System.out.println("El "+(100*contBien/4)+"% esta en su peso");
        System.out.println("El "+(100*contGordi/4)+"% esta por encima de su peso");
        System.out.println("================================");
        System.out.println("El "+(100*contViejo/4)+"% es viejo");
        System.out.println("El "+(100*contPendex/4)+"% es joven");
    }
    
}
