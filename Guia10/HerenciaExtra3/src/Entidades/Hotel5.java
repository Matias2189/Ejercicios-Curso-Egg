

package Entidades;


public final class Hotel5 extends Hotel4 {
    protected Integer limosinas, cantDeSuites, cantSalonesConferencia;

    public Hotel5() {
        crearHotel();
        precioHab();
    }

    @Override
    public String toString() {
        return "Hotel5{" + "limosinas=" + limosinas + ", cantDeSuites=" + cantDeSuites + ", cantSalonesConferencia=" + cantSalonesConferencia + '}';
    }

    public Hotel5(Integer limosinas, Integer cantDeSuites, Integer cantSalonesConferencia, String gimnasio, String nombreDeRestaurante, Integer capacidadRestaurante, Integer cantHabitaciones, Integer numDeCamas, Integer cantPisos, Integer precioDeHabitacion, String nombre, String direccion, String gerente) {
        super(gimnasio, nombreDeRestaurante, capacidadRestaurante, cantHabitaciones, numDeCamas, cantPisos, precioDeHabitacion, nombre, direccion, gerente);
        this.limosinas = limosinas;
        this.cantDeSuites = cantDeSuites;
        this.cantSalonesConferencia = cantSalonesConferencia;
    }

    public Integer getLimosinas() {
        return limosinas;
    }

    public void setLimosinas(Integer limosinas) {
        this.limosinas = limosinas;
    }

    public Integer getCantDeSuites() {
        return cantDeSuites;
    }

    public void setCantDeSuites(Integer cantDeSuites) {
        this.cantDeSuites = cantDeSuites;
    }

    public Integer getCantSalonesConferencia() {
        return cantSalonesConferencia;
    }

    public void setCantSalonesConferencia(Integer cantSalonesConferencia) {
        this.cantSalonesConferencia = cantSalonesConferencia;
    }
    @Override
    public void precioHab(){
        super.precioHab();
          if (capacidadRestaurante < 30 && gimnasio.equalsIgnoreCase("a")) {

            precioDeHabitacion += ((1 * numDeCamas) * cantPisos * cantHabitaciones) + 10 + 50 + (15* limosinas) ;
        } else if (capacidadRestaurante >= 30 && capacidadRestaurante <= 50 && gimnasio.equalsIgnoreCase("a")) {
            precioDeHabitacion += ((1 * numDeCamas) * cantPisos * cantHabitaciones) + 30 + 50+ (15* limosinas);
        } else if (capacidadRestaurante < 50 && gimnasio.equalsIgnoreCase("a")) {
            precioDeHabitacion += ((1 * numDeCamas) * cantPisos * cantHabitaciones) + 50 + 50+ (15* limosinas);
        } else if (capacidadRestaurante < 30 && gimnasio.equalsIgnoreCase("b")) {
            precioDeHabitacion += ((1 * numDeCamas) * cantPisos * cantHabitaciones) + 10 + 30+ (15* limosinas);
        } else if (capacidadRestaurante >= 30 && capacidadRestaurante <= 50 && gimnasio.equalsIgnoreCase("b")) {
            precioDeHabitacion += ((1 * numDeCamas) * cantPisos * cantHabitaciones) + 30 + 30+ (15* limosinas);
        } else if (capacidadRestaurante < 50 && gimnasio.equalsIgnoreCase("b")) {
            precioDeHabitacion += ((1 * numDeCamas) * cantPisos * cantHabitaciones) + 50 + 30+ (15* limosinas);
        }
    }

    @Override
    public void crearHotel() {
        super.crearHotel(); 
        
        limosinas = (int) ((Math.random()*12)+1);
        
        cantSalonesConferencia = (int) ((Math.random()*8)+1);
     
        cantDeSuites = (int) ((Math.random()*10)+1);
    }
    
}
