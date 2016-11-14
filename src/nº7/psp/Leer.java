
package nº7.psp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author julian
 */
public class Leer extends Thread{
    Buzon b2=new Buzon();
    

    public Leer(String name) {
        super(name);
    }
    
    
    
        
        
        @Override
        public void run(){
        try {
            b2.leer();
        } catch (InterruptedException ex) {
            Logger.getLogger(Leer.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }
    
    
}
