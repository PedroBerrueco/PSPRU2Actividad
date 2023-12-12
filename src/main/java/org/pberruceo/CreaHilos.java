package org.pberruceo;

import java.util.Random;

public class CreaHilos implements Runnable {
    @Override
    public void run() {

        for (int i=0; i<10; i++){

            Random random = new Random();
            int decision = random.nextInt(2);

            if (decision == 0) {
               // int stock = Almacen.anade();



            } else {
               // int stock2 = Almacen.retira();

            }
        }
    }
}


