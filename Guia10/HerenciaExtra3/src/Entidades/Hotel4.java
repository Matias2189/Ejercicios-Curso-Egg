package Entidades;

public class Hotel4 extends Hotel {

    protected String gimnasio, nombreDeRestaurante;
    protected Integer capacidadRestaurante;

    public Hotel4(String gimnasio, String nombreDeRestaurante, Integer capacidadRestaurante, Integer cantHabitaciones, Integer numDeCamas, Integer cantPisos, Integer precioDeHabitacion, String nombre, String direccion, String gerente) {
        super(cantHabitaciones, numDeCamas, cantPisos, precioDeHabitacion, nombre, direccion, gerente);
        this.gimnasio = gimnasio;
        this.nombreDeRestaurante = nombreDeRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public Hotel4() {
        crearHotel();
        precioHab();
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreDeRestaurante() {
        return nombreDeRestaurante;
    }

    public void setNombreDeRestaurante(String nombreDeRestaurante) {
        this.nombreDeRestaurante = nombreDeRestaurante;
    }

    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestauranate(Integer capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    @Override
    public void precioHab() {
        super.precioHab();
        if (capacidadRestaurante < 30 && gimnasio.equalsIgnoreCase("a")) {

            setPrecioDeHabitacion(precioDeHabitacion + ((1 * numDeCamas) * cantPisos * cantHabitaciones) + 10 + 50);
        } else if (capacidadRestaurante >= 30 && capacidadRestaurante <= 50 && gimnasio.equalsIgnoreCase("a")) {
            setPrecioDeHabitacion(precioDeHabitacion + ((1 * numDeCamas) * cantPisos * cantHabitaciones) + 30 + 50);
        } else if (capacidadRestaurante > 50 && gimnasio.equalsIgnoreCase("a")) {
            setPrecioDeHabitacion(precioDeHabitacion + ((1 * numDeCamas) * cantPisos * cantHabitaciones) + 50 + 50);
        } else if (capacidadRestaurante < 30 && gimnasio.equalsIgnoreCase("b")) {
            setPrecioDeHabitacion(precioDeHabitacion + ((1 * numDeCamas) * cantPisos * cantHabitaciones) + 10 + 30);
        } else if (capacidadRestaurante >= 30 && capacidadRestaurante <= 50 && gimnasio.equalsIgnoreCase("b")) {
            setPrecioDeHabitacion(precioDeHabitacion + ((1 * numDeCamas) * cantPisos * cantHabitaciones) + 30 + 30);
        } else if (capacidadRestaurante > 50 && gimnasio.equalsIgnoreCase("b")) {
            setPrecioDeHabitacion(precioDeHabitacion + ((1 * numDeCamas) * cantPisos * cantHabitaciones) + 50 + 30);
        }

    }

    @Override
    public void crearHotel() {
        super.crearHotel();
        int n = (int) ((Math.random() * 2) + 1);
        int v = (int) ((Math.random() * 5) + 1);
        if (n == 1) {
            gimnasio = "a";
        } else {
            gimnasio = "b";
        }
        switch (v) {
            case 1:
                nombreDeRestaurante = "Jorgito";
                break;
            case 2:
                nombreDeRestaurante = "Carlitos";
                break;
            case 3:
                nombreDeRestaurante = "Ernestito";
                break;
            case 4:
                nombreDeRestaurante = "Josesito";
                break;
            case 5:
                nombreDeRestaurante = "Dieguito";
                break;
            default:
                break;
        }

        capacidadRestaurante = (int) ((Math.random() * 70) + 1);
    }

    @Override
    public String toString() {
        return "Hotel 4 estrellas " + "gimnasio=" + gimnasio + ", nombreDeRestaurante=" + nombreDeRestaurante + ", capacidadRestaurante=" + capacidadRestaurante + '}';
    }
    
}
