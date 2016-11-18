
package nº7.psp;

/**
 *
 * @author julian
 */
public class Nº7PSP {

   
    public static void main(String[] args) {
        Buzon b=new Buzon();
        Leer l=new Leer();
        Escribir e=new Escribir();
        Leer l2=new Leer();
        Escribir e2=new Escribir();
        Leer l3=new Leer();
        Escribir e3=new Escribir();
        
        e.start();
        l.start();
        l2.start();
        e2.start();
        l3.start();
        e3.start();
    }
    
}
