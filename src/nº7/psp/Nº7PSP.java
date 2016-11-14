
package nº7.psp;

/**
 *
 * @author julian
 */
public class Nº7PSP {

   
    public static void main(String[] args) {
        Buzon b=new Buzon();
        Leer l=new Leer("leer");
        Escribir e=new Escribir();
        
        e.start();
        l.start();
    }
    
}
