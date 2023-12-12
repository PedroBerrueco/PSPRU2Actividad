package org.pberruceo;

public class Almacen {

    private int reservas;
    private final int MAX_ALMACEN = 50;

    public Almacen(int reservas) {
        this.reservas = reservas;
    }

    public synchronized void saca(int resta) {
        while (reservas-resta < 0){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        reservas -= resta;
        System.out.println(getTotalPlantas());
        notifyAll();
    }

    public synchronized void mete(int suma){
        while (reservas+suma > MAX_ALMACEN) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
            reservas += suma;
            System.out.println(getTotalPlantas());
            notifyAll();
    }

    public synchronized int getTotalPlantas() {
        return reservas;
    }

}
