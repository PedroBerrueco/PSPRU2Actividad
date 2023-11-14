package org.pberruceo;

public class Main {
    public static void main(String[] args) {

        CreaHilos firsthilo = new CreaHilos();
        Thread hilo1 = new Thread(firsthilo);
        hilo1.start();

        CreaHilos secondhilo = new CreaHilos();
        Thread hilo2 = new Thread(secondhilo);
        hilo2.start();

        CreaHilos thirdhilo = new CreaHilos();
        Thread hilo3 = new Thread(thirdhilo);
        hilo3.start();

        CreaHilos fourthilo = new CreaHilos();
        Thread hilo4 = new Thread(fourthilo);
        hilo4.start();

        CreaHilos fivethilo = new CreaHilos();
        Thread hilo5 = new Thread(fivethilo);
        hilo5.start();

        CreaHilos sixthilo = new CreaHilos();
        Thread hilo6 = new Thread(sixthilo);
        hilo6.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Finalmente las reservas son: " + Almacen.getReservas());

    }
}

