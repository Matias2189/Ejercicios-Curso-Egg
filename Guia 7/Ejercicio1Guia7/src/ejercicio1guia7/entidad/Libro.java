
package ejercicio1guia7.entidad;


public class Libro {
    public String titulo;
    public String autor;
    public int ISBN;
    public int Paginas;

     public Libro() {
        
    }
    
    public Libro(String titulo, String autor, int ISBN, int Paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.Paginas = Paginas;
    }

    @Override
    public String toString() {
        return "Libro[" + "titulo=" + titulo + ", autor=" + autor + ", Paginas=" + Paginas + ", ISBN=" + ISBN  + ']';
    }
    
    
}
