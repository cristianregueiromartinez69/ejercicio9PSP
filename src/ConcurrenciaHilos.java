/**
 * Clase que implementa la interfaz Runnable para manejo de hilos
 * @author cristian
 * @version 1.0
 */
public class ConcurrenciaHilos implements Runnable {

    private int tipoOperacion; // 1 para pares, 2 para impares, 3 para números que terminan en 3 o 4

    /**
     * Constructor de la clase
     *
     * @param tipoOperacion Tipo de operación: 1 = pares, 2 = impares, 3 = terminan en 3 o 4
     */
    public ConcurrenciaHilos(int tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    /**
     * Metodo para iniciar el hilo
     */
    @Override
    public void run() {
        try {
            //dependiendo de si es 1, 2 o 3, hará una u otra operacion
            if (tipoOperacion == 1) {
                sumaPares();
            } else if (tipoOperacion == 2) {
                sumaImpares();
            } else if (tipoOperacion == 3) {
                sumaTerminadosEn3o4();
            }
        } catch (InterruptedException e) {
            System.out.println("Ups, ha ocurrido un error al ejecutar el hilo");
        }
    }


    /**
     * Metodo que suma los pares
     * @throws InterruptedException lanza la excepcion
     */
    private void sumaPares() throws InterruptedException {
        int suma = 0;
        for (int i = 1; i <= 2500; i++) {
            if (i % 2 == 0) {
                suma += i;
            }

        }
        System.out.println("La suma de los números pares es: " + suma);
    }


    /**
     * Metodo que suma los impares
     * @throws InterruptedException lanza la excepcion
     */
    private void sumaImpares() throws InterruptedException {
        int suma = 0;
        for (int i = 1; i <= 2500; i++) {
            if (i % 2 != 0) {
                suma += i;
            }

        }
        System.out.println("La suma de los números impares es: " + suma);
    }


    /**
     * Metodo que suma los numeros terminados en 3 o 4
     * @throws InterruptedException lanza una excepcion
     */
    private void sumaTerminadosEn3o4() throws InterruptedException {
        int suma = 0;
        for (int i = 1; i <= 2500; i++) {
            String numeroStr = String.valueOf(i);
            char ultimoCaracter = numeroStr.charAt(numeroStr.length() - 1);
            if (ultimoCaracter == '3' || ultimoCaracter == '4') {
                suma += i;
            }

        }
        System.out.println("La suma de los números que terminan en 3 o 4 es: " + suma);
    }
}