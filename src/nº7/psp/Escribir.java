package nº7.psp;




import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author julian
 */
public class Escribir extends Thread{
    Buzon b1=new Buzon();
    
    public void run(){
        try {
            b1.escribir();
        } catch (InterruptedException ex) {
            Logger.getLogger(Escribir.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
}
