
package entidad;


public class Java {
    private String año[]= {"Enero", "Febrero", "Marzo", "Abril",
        "Mayo","Junio", "Julio", "Agosto", "Septiembre", "Octubre", 
        "Noviembre", "Diciembre"};

    private String mesSecreto;

    public Java() {
    }

    public Java(String[] año) {
        this.año = año;
    }

    public String[] getAño() {
        return año;
    }

    public void setAño(String[] año) {
        this.año = año;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    
    
    
    
}
