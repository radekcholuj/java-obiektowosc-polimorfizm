
import java.util.Scanner;

public class EShopApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EShopRepo eShopRepo = new EShopRepo();
        int option;
        String name;
        double price;
        int quantity;
        Address address;
        String street;
        int houseNumber;
        int flatNumber;
        String postcode;
        String town;
        String expDate;

        do {
            System.out.println("----- e-Shop App ------");
            System.out.println("1 - add shoes");
            System.out.println("2 - add book");
            System.out.println("3 - add fruit");
            System.out.println("4 - add milk");
            System.out.println("5 - display all products");
            System.out.println("0 - end");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    System.out.print("Product name: ");
                    name = scanner.nextLine();
                    System.out.print("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Quantity: ");
                    quantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Producer: ");
                    String producer = scanner.nextLine();
                    System.out.print("Producer NIP: ");
                    String NIP = scanner.nextLine();
                    System.out.print("Street: ");
                    street = scanner.nextLine();
                    System.out.print("House no.: ");
                    houseNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Flat no.: ");
                    flatNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Postal code: ");
                    postcode = scanner.nextLine();
                    System.out.print("Town: ");
                    town = scanner.nextLine();

                    Address address1 = new Address(street,houseNumber,flatNumber,postcode,town);
                    Producer producer1 = new Producer(producer,NIP,address1);
                    Shoes shoes = new Shoes(name,price,quantity,producer1);
                    eShopRepo.add(shoes);
                    break;
                case 2:
                    System.out.print("Product name: ");
                    name = scanner.nextLine();
                    System.out.print("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Qaantity: ");
                    quantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Author's name: ");
                    String authorName = scanner.nextLine();
                    System.out.print("Author's surname: ");
                    String authorSurname = scanner.nextLine();
                    System.out.print("Street: ");
                    street = scanner.nextLine();
                    System.out.print("House no.: ");
                    houseNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Flat no.: ");
                    flatNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Postal code: ");
                    postcode = scanner.nextLine();
                    System.out.print("Town: ");
                    town = scanner.nextLine();

                    address = new Address(street,houseNumber,flatNumber,postcode,town);
                    Author author = new Author(authorName, authorSurname, address);
                    Books book = new Books(name, price, quantity, author);
                    eShopRepo.add(book);
                    break;
                case 3:
                    System.out.print("Product name: ");
                    name = scanner.nextLine();
                    System.out.print("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Quantity: ");
                    quantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Best before: ");
                    expDate = scanner.nextLine();
                    System.out.print("Type: ");
                    String type = scanner.nextLine();

                    Fruit fruit = new Fruit(name, price, quantity, expDate, type);
                    eShopRepo.add(fruit);
                    break;
                case 4:
                    System.out.print("Product name: ");
                    name = scanner.nextLine();
                    System.out.print("Price: ");
                    price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Qauntity: ");
                    quantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Best before: ");
                    expDate = scanner.nextLine();
                    System.out.print("Protein content: ");
                    double proteinContent = scanner.nextDouble();
                    scanner.nextLine();

                    Milk milk = new Milk(name, price, quantity, expDate, proteinContent);
                    eShopRepo.add(milk);
                    break;
                case 5:
                    eShopRepo.displayAll();
                    break;
            }
        } while (option != 0);
        scanner.close();
    }
}
