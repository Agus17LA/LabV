package models;

import static java.lang.Thread.sleep;

public class BeerConsumer implements Runnable {
    private int consumed;
    private BeerHouse bh;

    public BeerConsumer(BeerHouse beerHouse) {
        this.bh = beerHouse;
    }

    public int getConsumed() {
        return consumed;
    }

    public void setConsumed(int consumed) {
        this.consumed = consumed;
    }

    @Override
    public void run() {
        this.consumed += 1;
        boolean flag = true;
        while(flag){
            if(this.bh.getStock() > 0)
                this.bh.consumeBeer();
            else
                flag = false;
        }
    }
}
