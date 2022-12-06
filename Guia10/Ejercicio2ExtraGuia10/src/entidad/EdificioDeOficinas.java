/*
 • Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
 */
package entidad;

import java.util.Scanner;


public final class EdificioDeOficinas extends Edificio{
    private Integer nOficinas;
    private Integer cantPersonas;
    private Integer nPisos;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer nOficinas, Integer cantPersonas, Integer nPisos, Double ancho, Double alto, Double largo, Double Superficie, Double Volumen) {
        super(ancho, alto, largo, Superficie, Volumen);
        this.nOficinas = nOficinas;
        this.cantPersonas = cantPersonas;
        this.nPisos = nPisos;
    }

    public Integer getnOficinas() {
        return nOficinas;
    }

    public void setnOficinas(Integer nOficinas) {
        this.nOficinas = nOficinas;
    }

    public Integer getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(Integer cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public Integer getnPisos() {
        return nPisos;
    }

    public void setnPisos(Integer nPisos) {
        this.nPisos = nPisos;
    }

    @Override
    public void calcularSuperficie() {
        this.Superficie = largo * ancho * nPisos;
    }

    @Override
    public void calcularVolumen() {
        this.Volumen = largo * ancho * alto;
    }
    
            
   
    public void cantPersonas(){
        System.out.println("Ingrese cantidad de perosnas por oficina");
        this.cantPersonas = leer.nextInt();
        System.out.println("Cuantas oficianas hay por piso?");
        this.nOficinas = leer.nextInt();
        System.out.println("Cuantos pisos tiene el edificio?");
        this.nPisos = leer.nextInt();
        
        System.out.println("En cada piso entran "+cantPersonas*nOficinas+" personas");
        System.out.println("En el edificio entran "+cantPersonas*nOficinas*nPisos+" personas");
    }
    
    @Override
    public void crearEdificio() {
        System.out.println("Ingrese ancho");
       this.ancho=leer.nextDouble();
        System.out.println("Ingrese alto");
        this.alto=leer.nextDouble();
        System.out.println("Ingrese largo");
        this.largo=leer.nextDouble();
        cantPersonas();
    }
}
