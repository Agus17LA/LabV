package models;

import static java.lang.Thread.sleep;

public class BeerProducer implements Runnable{

    private BeerHouse bh;

    public BeerProducer(BeerHouse beerHouse){
        this.bh = beerHouse;
    }

    @Override
    public void run() {
        boolean flag = true;
        while(flag){
            if(this.bh.getStock() > 0)
                this.bh.addBeer();
            else
                flag = false;
        }
    }

}
