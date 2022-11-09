
package entidades;


public class DNI {
    private char serie;
    private int doc;

    public DNI() {
    }

    public DNI(char serie, int doc) {
        this.serie = serie;
        this.doc = doc;
    }

    public char getSerie() {
        return serie;
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }

    public int getDoc() {
        return doc;
    }

    public void setDoc(int doc) {
        this.doc = doc;
    }

    @Override
    public String toString() {
        return "DNI{" + "serie=" + serie + ", doc=" + doc + '}';
    }
    
    
}
