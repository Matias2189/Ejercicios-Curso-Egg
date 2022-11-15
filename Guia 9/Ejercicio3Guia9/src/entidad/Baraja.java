/*
 La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
 */
package entidad;

import java.util.HashMap;




public class Baraja {
    public HashMap <Integer, Carta> Baraja;
    
    
    public Baraja() {
       this.Baraja = new HashMap();
       
         
    }

    public Baraja(HashMap<Integer, Carta> Baraja) {
        this.Baraja = Baraja;
    }

    public HashMap<Integer, Carta> getBaraja() {
        return Baraja;
    }

    public void setBaraja(Integer num, Carta c1) {
        Baraja.put(num, c1);
       
    }

    @Override
    public String toString() {
        return "Baraja{" + "Baraja=" + Baraja + '}';
    }

   

    
    
    

   
    
    
}
