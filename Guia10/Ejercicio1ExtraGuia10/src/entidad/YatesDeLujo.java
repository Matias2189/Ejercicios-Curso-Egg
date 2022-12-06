/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author MATIAS
 */
public final class YatesDeLujo extends BarcoMotor{
    
    private Integer camarotes;

    public YatesDeLujo() {
    }

    public YatesDeLujo(Integer camarotes, Integer potenciaCV, String matricula, Integer eslora, Integer añoDeFanricacion) {
        super(potenciaCV, matricula, eslora, añoDeFanricacion);
        this.camarotes = camarotes;
    }

    public Integer getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(Integer camarotes) {
        this.camarotes = camarotes;
    }

   
    
}
