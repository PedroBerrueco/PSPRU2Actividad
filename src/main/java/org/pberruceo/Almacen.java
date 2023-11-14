package org.pberruceo;

public class Almacen {

    private static int reservas = 12; //Iniciamos Almacen a media carga.

    public static int getReservas() {
        return reservas;
    }

    public static synchronized int anade(){
            //Incrementa las reservas - Tope 25

            if (reservas <=23){
                reservas += 2;
                System.out.println("Soy el hilo: " + Thread.currentThread().getName() + " - Las reservas aumentaron ahora son " + reservas + " unidades.");
            }
            return reservas;
        }

        public static synchronized int retira(){
            //Decrementa las reservas - Minimo 0

            if (reservas >= 2) {
                reservas -= 2;
                System.out.println("Soy el hilo: " + Thread.currentThread().getName() + " - Las reservas disminuyeron ahora son " + reservas + " unidades.");
            }
            return reservas;
        };

}
