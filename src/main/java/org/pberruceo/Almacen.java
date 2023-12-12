package org.pberruceo;

public class Almacen {

    private int reservas;

    public Almacen(int reservas) {
        this.reservas = reservas;
    }

    public  synchronized int saca(int resta){
        reservas -= resta;
        return reservas;
    }

    public synchronized int mete(int suma){
        reservas += suma;
        return reservas;
    }

    public int getTotalPlantas() {
        return reservas;
    }

}
