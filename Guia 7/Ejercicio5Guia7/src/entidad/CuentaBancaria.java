
package entidad;


public class CuentaBancaria {
private int crearCuenta;
private int ingresar;
private int retirar;
private int extraccionRapido;
private int consultarSaldo;
private int consultarDatos;
private int NroCuenta;
private int Dni;
private int SaldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int NroCuenta, int Dni, int SaldoActual) {
        this.NroCuenta = NroCuenta;
        this.Dni = Dni;
        this.SaldoActual = SaldoActual;
    }

    public int getNroCuenta() {
        return NroCuenta;
    }

    public void setNroCuenta(int NroCuenta) {
        this.NroCuenta = NroCuenta;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public int getSaldoActual() {
        return SaldoActual;
    }

    public void setSaldoActual(int SaldoActual) {
        this.SaldoActual = SaldoActual;
    }
    
    

    public CuentaBancaria(int crearCuenta, int ingresar, int retirar, int extraccionRapido, int consultarSaldo, int consultarDatos) {
        this.crearCuenta = crearCuenta;
        this.ingresar = ingresar;
        this.retirar = retirar;
        this.extraccionRapido = extraccionRapido;
        this.consultarSaldo = consultarSaldo;
        this.consultarDatos = consultarDatos;
    }

    public int getCrearCuenta() {
        return crearCuenta;
    }

    public void setCrearCuenta(int crearCuenta) {
        this.crearCuenta = crearCuenta;
    }

    public int getIngresar() {
        return ingresar;
    }

    public void setIngresar(int ingresar) {
        this.ingresar = ingresar;
    }

    public int getRetirar() {
        return retirar;
    }

    public void setRetirar(int retirar) {
        this.retirar = retirar;
    }

    public int getExtraccionRapido() {
        return extraccionRapido;
    }

    public void setExtraccionRapido(int extraccionRapido) {
        this.extraccionRapido = extraccionRapido;
    }

    public int getConsultarSaldo() {
        return consultarSaldo;
    }

    public void setConsultarSaldo(int consultarSaldo) {
        this.consultarSaldo = consultarSaldo;
    }

    public int getConsultarDatos() {
        return consultarDatos;
    }

    public void setConsultarDatos(int consultarDatos) {
        this.consultarDatos = consultarDatos;
    }

    @Override
    public String toString() {
        return "NroCuenta= " + NroCuenta + ", Dni= " + Dni + ", SaldoActual= " + SaldoActual + '}';
    }

    

                                            
}


