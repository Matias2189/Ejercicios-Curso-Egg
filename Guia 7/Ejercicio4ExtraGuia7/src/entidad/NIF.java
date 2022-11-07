
package entidad;


public class NIF {
    private long DNI;
    private String Letra;
    public char l;

    public char getL() {
        return l;
    }

    public void setL(char l) {
        this.l = l;
    }

    public NIF() {
    }

    public NIF(int DNI, String Letra) {
        this.DNI = DNI;
        this.Letra = Letra;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getLetra() {
        return Letra;
    }

    public void setLetra(String Letra) {
        this.Letra = Letra;
    }
    
    
}
