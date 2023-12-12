package org.pberruceo;

public class Consumidor extends Thread{
    String consumidor;
    int resta;
    Almacen miAlmacen;
    public Consumidor(String consumidor, int resta, Almacen miAlmacen) {
        this.consumidor = consumidor;
        this.resta = resta;
        this.miAlmacen = miAlmacen;
    }

    @Override
    public void run() {
        miAlmacen.saca(resta);
    }
}
