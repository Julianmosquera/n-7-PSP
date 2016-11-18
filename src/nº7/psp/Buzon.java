package nº7.psp;

/**
 *
 * @author julian
 */
public class Buzon {

    public String Mensaje = "";

    public String getMensaje() {
        return Mensaje;
    }

    
    
    

    public synchronized void leer() throws InterruptedException {
        if (Mensaje == "") {
            System.out.println("El lector espera");
          
            
        } if (Mensaje==Mensaje) {
            System.out.println("Leer");
            Mensaje="";
            
            notify();
            
            
        }
    }

    public synchronized void escribir() throws InterruptedException {
        if (Mensaje != "") {
            System.out.println("Escritor espera");
            
            
            

        } else {
            
            Mensaje = "Buenas tardes";
            System.out.println("El escritor escribe "+getMensaje());
            notify();
           
           
        }

    }
}
