public class Shoes extends Product {

    private Producer producer;

    public Shoes(String name, double price, int quantity, Producer producer) {
        super(name, price, quantity);
        this.producer = producer;
    }

    @Override
    public void display() {
        super.display();
        producer.display();
    }
}
