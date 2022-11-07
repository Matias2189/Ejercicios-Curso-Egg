
package entidad;


public class Pelicula {
    private String Titulo;
    private String Director;
    private Double horas;

    public Pelicula() {
    }

    public Pelicula(String Titulo, String Director, Double horas) {
        this.Titulo = Titulo;
        this.Director = Director;
        this.horas = horas;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public Double getHoras() {
        return horas;
    }

    public void setHoras(Double horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Pelicula--->" + "Titulo=" + Titulo + ", Director=" + Director + ", horas=" + horas ;
    }
    
    
}
