package models;

import static java.lang.Thread.sleep;

public class BeerProducer implements Runnable{
    private int produced;

    public BeerProducer(){
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
        BeerHouse bh = new BeerHouse();
        boolean flag = true;
        while(flag){
            if(bh.getStock() > 0){
                bh.modifyStock(1);
            }else{
                flag = false;
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
