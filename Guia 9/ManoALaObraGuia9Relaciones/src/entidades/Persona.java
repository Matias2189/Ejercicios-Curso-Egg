
package entidades;


public class Persona {
    private String Nombre;
    private String Apellido;
    private DNI doc;

    public Persona() {
    }

    public Persona(String Nombre, String Apellido, DNI doc) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.doc = doc;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public DNI getDoc() {
        return doc;
    }

    public void setDoc(DNI doc) {
        this.doc = doc;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", doc=" + doc + '}';
    }
 
    
}
