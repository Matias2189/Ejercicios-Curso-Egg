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
public class BarcoMotor extends Barco{
    
    protected Integer potenciaCV;

    public BarcoMotor() {
    }

    public BarcoMotor(Integer potenciaCV, String matricula, Integer eslora, Integer añoDeFanricacion) {
        super(matricula, eslora, añoDeFanricacion);
        this.potenciaCV = potenciaCV;
    }

    public Integer getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Integer potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    
    
}
