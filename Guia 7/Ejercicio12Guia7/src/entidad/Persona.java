
package entidad;

import java.util.Date;


public class Persona {
    private String Nombre;
    private Date Nacimiento;
    private int edad;

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Nacimiento=" + Nacimiento.toLocaleString() + ", edad=" + edad + '}';
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona() {
    }

    public Persona(String Nombre, Date Nacimiento) {
        this.Nombre = Nombre;
        this.Nacimiento = Nacimiento;
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(Date Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

    public void setNacimiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
