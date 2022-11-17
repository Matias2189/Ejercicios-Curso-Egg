/*
 Luego, de las películas nos interesa saber
el título, duración, edad mínima y director.
 */
package entidad;


public class Pelicula {
    private String titulo;
    private Integer duracion;
    private Integer edadMinima;
    private String director;

    public Pelicula() {
        this.titulo = "Kung Fu Panda";
        this.duracion = 95;
        this.edadMinima = 12;
        this.director = "Chin Chu Lancha";
    }

    public Pelicula(String titulo, Integer duracion, Integer edadMinima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Integer getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(Integer edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", duracion=" + duracion + ", edadMinima=" + edadMinima + ", director=" + director + '}';
    }
    
    
}
