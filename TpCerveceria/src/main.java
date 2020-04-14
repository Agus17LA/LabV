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

        BeerProducer bp = new BeerProducer();

        BeerProducer bp2 = new BeerProducer();

        BeerProducer bp3 = new BeerProducer();

        BeerProducer bp4 = new BeerProducer();

        BeerConsumer bc = new BeerConsumer();

        BeerConsumer bc2 = new BeerConsumer();

        BeerConsumer bc3 = new BeerConsumer();

        Thread producer = new Thread(bp);
        Thread producer2 = new Thread(bp2);
        Thread producer3 = new Thread(bp3);
        Thread producer4 = new Thread(bp4);

        Thread consumer = new Thread(bc);
        Thread consumer2 = new Thread(bc2);
        Thread consumer3 = new Thread(bc3);

        producer.start();
        producer2.start();

        consumer.start();
        consumer2.start();

    }
}
