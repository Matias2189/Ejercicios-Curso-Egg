/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

public class Barco {

    protected String matricula;
    protected Integer eslora;
    protected Integer añoDeFanricacion;

    public Barco() {
    }

    public Barco(String matricula, Integer eslora, Integer añoDeFanricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoDeFanricacion = añoDeFanricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAñoDeFanricacion() {
        return añoDeFanricacion;
    }

    public void setAñoDeFanricacion(Integer añoDeFanricacion) {
        this.añoDeFanricacion = añoDeFanricacion;
    }

    
}