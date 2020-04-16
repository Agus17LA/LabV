import models.BeerConsumer;
import models.BeerHouse;
import models.BeerProducer;

/*
    -Realizar un sistema Productor / Consumidor
    -Como minimo deben tener 3 clases  mas nuestro main, BeerProducter, BeerConsumer, BeerHouse
    -La capacidad de la cerveceria (BeerHouse) es de 100 unidades, una vez  alcanzado el tope el productor
     deberá esperar
    -El consumidor no tiene tope de consumo
    -El sistema deberá parar cuando el stock sea 0
 */

public class main {
    public static void main(String[] args) {
        BeerHouse bh = new BeerHouse();
        bh.setStock(1);

        BeerProducer bp = new BeerProducer(bh);

        BeerProducer bp2 = new BeerProducer(bh);

        BeerConsumer bc = new BeerConsumer(bh);

        BeerConsumer bc2 = new BeerConsumer(bh);

        BeerConsumer bc3 = new BeerConsumer(bh);


        Thread producer = new Thread(bp);
        //Thread producer2 = new Thread(bp2);

        Thread consumer = new Thread(bc);
        //Thread consumer2 = new Thread(bc2);
        //Thread consumer3 = new Thread(bc3);

        producer.start();

        consumer.start();



    }
}
