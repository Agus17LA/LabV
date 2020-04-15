package models;

public class BeerHouse {
    private static int stock = 0;

    public BeerHouse() {
    }

    public int getStock() {
        return BeerHouse.stock;
    }

    public synchronized void addBeer(){
        if(stock >= 100){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        stock += 1;
        System.out.println("[Producer] Ahora hay:" + stock);
    }

    public synchronized void consumeBeer(){
        if(stock > 0){
            stock -= 1;
            System.out.println("[Consumer] Ahora hay:" + stock);
            notifyAll();
        }
    }

    /*
    public synchronized void modifyStock(int value){
        if(value > 0){
            if(BeerHouse.stock >= 100){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                stock += 1;
                notifyAll();
                System.out.println("[Producer] Cervezas en BeerHouse: "+ stock);
            }
        }else{
            if(stock == 0){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            stock -= 1;
            notifyAll();
            System.out.println("[Consumer] Cervezas en BeerHouse: "+ stock);
        }
    }

     */





}
