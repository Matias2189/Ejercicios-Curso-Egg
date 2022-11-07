
package entidad;


public class Pass {
    private String Pass="Fabs";
    private String Nombre="Fabian";
    private int DNI=12345;
    private boolean val=false;

    public boolean isVal() {
        return val;
    }

    public void setVal(boolean val) {
        this.val = val;
    }

    public Pass() {
    }

    public Pass(String Pass, String Nombre, int DNI) {
        this.Pass = Pass;
        this.Nombre = Nombre;
        this.DNI = DNI;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Datos del usuario{" + "Nombre=" + Nombre + ", DNI=" + DNI + '}';
    }
    
    
    
}
