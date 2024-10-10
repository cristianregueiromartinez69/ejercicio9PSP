/**
 * Clase main donde ejecutamos el programa
 * @author cristian
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        //instanciamos los hilos con la operacion correspondiente y los iniciamos
        Thread hilo1 = new Thread(new ConcurrenciaHilos(1));
        Thread hilo2 = new Thread(new ConcurrenciaHilos(2));
        Thread hilo3 = new Thread(new ConcurrenciaHilos(3));
        hilo1.start();
        hilo2.start();
        hilo3.start();



    }
}