
package entidad;


public class Ahorcado {
    private String buscar[];
    private int intentos; 
    private String noEncontradas="";
    private String vecGuiones[];

    public String [] getVecGuiones() {
        return vecGuiones;
    }

    public void setVecGuiones(String []vecGuiones) {
        this.vecGuiones = vecGuiones;
    }

    public Ahorcado() {
    }

    public Ahorcado(String[] buscar, int intentos, String encontradas) {
        this.buscar = buscar;
        this.intentos = intentos;
        this.noEncontradas = encontradas;
    }

    public String[] getBuscar() {
        return buscar;
    }

    public void setBuscar(String[] buscar) {
        this.buscar = buscar;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public String getNoEncontradas() {
        return noEncontradas;
    }

    public void setNoEncontradas(String encontradas) {
        this.noEncontradas = encontradas;
    }
    
    
    
}
