/*
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
 */
package entidad;


public final class Polideportivo extends Edificio{
    private String tipoInst;

    public Polideportivo() {
    }

    public Polideportivo(String tipoInst, Double ancho, Double alto, Double largo, Double Superficie, Double Volumen) {
        super(ancho, alto, largo, Superficie, Volumen);
        this.tipoInst = tipoInst;
    }

    public String getTipoInst() {
        return tipoInst;
    }

    public void setTipoInst(String tipoInst) {
        this.tipoInst = tipoInst;
    }

    @Override
    public void calcularSuperficie() {
        this.Superficie = largo * ancho;
    }

    @Override
    public void calcularVolumen() {
        this.Volumen = largo * ancho * alto;
    }
    
    @Override
    public void crearEdificio() {
        System.out.println("Ingrese ancho");
       this.ancho=leer.nextDouble();
        System.out.println("Ingrese alto");
        this.alto=leer.nextDouble();
        System.out.println("Ingrese largo");
        this.largo=leer.nextDouble();
        System.out.println("El polideportivo es techado? S/N");
        String opc=leer.next();
        
        if (opc.equalsIgnoreCase("S")) {
            this.tipoInst="Techado";
        }else{
            this.tipoInst="Abierto";
        }
    }
}
