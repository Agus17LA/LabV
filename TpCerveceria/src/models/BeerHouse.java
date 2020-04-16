package models;

public class BeerHouse {
    private int stock = 0; //recurso compartido

    public BeerHouse() {
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int i){
        this.stock = i;
    }

    public synchronized void addBeer(){
        if(this.stock >= 100){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.stock += 1;
        System.out.println("[Producer] Ahora hay:" + this.stock);
    }

    public synchronized void consumeBeer(){
        if(this.stock > 0){
            this.stock -= 1;
            System.out.println("[Consumer] Ahora hay:" + this.stock);
        }
        notifyAll();
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
