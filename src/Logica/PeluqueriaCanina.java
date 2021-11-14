/**
 * PRINCIPAL: 
 *      + Inicia el proceso 
 *      + Delega el trabajo a la inerfaz "Igu.Peluqueria"
 * 
 */
package Logica;

import Igu.Peluqueria;

/**
 *
 * @author Leo Martinez
 */
public class PeluqueriaCanina {
    
    public static void main(String[] args) {
        
        Controladora ctrl = new Controladora();
        Peluqueria pelu = new Peluqueria();
        pelu.setVisible(true);
        
        
    }
    
}
