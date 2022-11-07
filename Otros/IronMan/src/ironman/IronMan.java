/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ironman;

import entidad.Armadura;
import servicio.ArmaduraServicio;


public class IronMan {

   
    public static void main(String[] args) {
        ArmaduraServicio s1 = new ArmaduraServicio();
        Armadura a = new Armadura();
        s1.menu(a);
    }
    
}
