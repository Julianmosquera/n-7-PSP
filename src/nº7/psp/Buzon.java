package nº7.psp;

/**
 *
 * @author julian
 */
public class Buzon {

    public String Mensaje = "";

    public void leer() throws InterruptedException {
        if (Mensaje == "") {
            System.out.println("El lector espera");
            wait();
            
        } else {
            System.out.println("Leer");
            Mensaje.replaceAll(Mensaje, "");
            notify();
        }
    }

    public void escribir() throws InterruptedException {
        if (Mensaje != "") {
            System.out.println("Escritor espera");
            wait();
            

        } else {
            System.out.println("El escritor escribe");
            Mensaje = "LOLOLO";
            wait();
            notify();
        }

    }
}
