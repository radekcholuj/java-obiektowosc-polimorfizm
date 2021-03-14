public class Fruit extends Food{

    private String type;

    public Fruit(String name, double price, int quantity, String expDate, String type) {
        super(name, price, quantity, expDate);
        this.type = type;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type: "+type);
    }
}
