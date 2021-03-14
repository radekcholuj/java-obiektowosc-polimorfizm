public class Milk extends Food{

    private double proteinContent;

    public Milk(String name, double price, int quantity, String expDate, double proteinContent) {
        super(name, price, quantity, expDate);
        this.proteinContent = proteinContent;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Protein content: "+proteinContent);
    }
}
