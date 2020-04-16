package models;

import static java.lang.Thread.sleep;

public class BeerConsumer implements Runnable {
    private BeerHouse bh;

    public BeerConsumer(BeerHouse beerHouse) {
        this.bh = beerHouse;
    }

    @Override
    public void run() {
        boolean flag = true;
        while(flag){
            if(this.bh.getStock() > 0)
                this.bh.consumeBeer();
            else
                flag = false;
        }
    }
}
