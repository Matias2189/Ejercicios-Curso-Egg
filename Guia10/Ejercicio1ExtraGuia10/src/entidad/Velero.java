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
public final class Velero extends Barco{
    
    private Integer NdeMastiels;

    public Velero() {
    }

    public Velero(Integer NdeMastiels, String matricula, Integer eslora, Integer añoDeFanricacion) {
        super(matricula, eslora, añoDeFanricacion);
        this.NdeMastiels = NdeMastiels;
    }

    public Integer getNdeMastiels() {
        return NdeMastiels;
    }

    public void setNdeMastiels(Integer NdeMastiels) {
        this.NdeMastiels = NdeMastiels;
    }

    
}
