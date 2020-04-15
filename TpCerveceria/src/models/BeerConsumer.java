package models;

import static java.lang.Thread.sleep;

public class BeerConsumer implements Runnable {
    private int consumed;

    public BeerConsumer() {

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
        BeerHouse bh = new BeerHouse();
        boolean flag = true;
        while(flag){
            if(bh.getStock() > 0)
                bh.consumeBeer();
            else
                flag = false;
        }
    }
}
