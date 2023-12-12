package org.pberruceo;

public class Productor extends Thread{
    String productor;
    int suma;
    Almacen miAlmacen;

    public Productor(String productor, int suma, Almacen miAlmacen) {
        this.productor = productor;
        this.suma = suma;
        this.miAlmacen = miAlmacen;
    }

    @Override
    public void run() {
        miAlmacen.mete(suma);
    }
}
