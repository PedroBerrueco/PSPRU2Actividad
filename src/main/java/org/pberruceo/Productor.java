package org.pberruceo;

public class Productor extends Thread{
    String productor;
    int suma;
    Almacen miAlmacen;

    public Productor(String productor, int suma, Almacen miAlmacen) {
        this.productor = productor;
        this.suma = suma;
        this.miAlmacen = miAlmacen;

        miAlmacen.mete(suma);
        System.out.println(miAlmacen.getTotalPlantas());
    }
}
