public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
        System.out.println("Stock: "+quantity);
    }
}
