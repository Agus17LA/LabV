package models;

import static java.lang.Thread.sleep;

public class BeerProducer implements Runnable{
    private int produced;
    private BeerHouse bh;

    public BeerProducer(BeerHouse beerHouse){
        this.bh = beerHouse;
    }

    public int getProduced() {
        return produced;
    }

    public void setProduced(int produced) {
        this.produced = produced;
    }

    @Override
    public void run() {
        this.produced += 1;
        boolean flag = true;
        while(flag){
            if(this.bh.getStock() > 0)
                this.bh.addBeer();
            else
                flag = false;
        }
    }

}
