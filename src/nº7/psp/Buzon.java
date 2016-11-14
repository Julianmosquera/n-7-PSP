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
    
    
    

    public void leer() throws InterruptedException {
        if (Mensaje == "") {
            System.out.println("El lector espera");
            
            
        } else {
            System.out.println("Leer");
            Mensaje="";
            notify();
            
        }
    }

    public void escribir() throws InterruptedException {
        if (Mensaje != "") {
            System.out.println("Escritor espera");
            
            

        } else {
            
            Mensaje = "LOLOLO";
            System.out.println("El escritor escribe "+getMensaje());
           
            notify();
        }

    }
}
