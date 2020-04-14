package models;

public class BeerHouse {
    private static int stock = 0;

    public BeerHouse() {
        if(stock == 0)
            stock = 1;
    }

    public int getStock() {
        return BeerHouse.stock;
    }

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
                System.out.println("[Producer] Cervezas en BeerHouse: "+ stock);
            }
        }else{
            stock -= 1;
            System.out.println("[Consumer] Cervezas en BeerHouse: "+ stock);
        }
    }





}
