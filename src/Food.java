public class Food extends Product{

    private String expDate;

    public Food(String name, double price, int quantity, String expDate) {
        super(name, price, quantity);
        this.expDate = expDate;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Best before: "+expDate);
    }
}
