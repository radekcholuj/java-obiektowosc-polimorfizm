import java.util.Scanner;

public class DrinkApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DrinkRepo drinkCompanyRepo = new DrinkRepo();
        int option;

        do{
            System.out.println("----- Drink App -----");
            System.out.println("1 - add beer");
            System.out.println("2 - add water");
            System.out.println("3 - display all");
            System.out.println("0 - end");
            option = scanner.nextInt();
            scanner.nextLine();
            int capacity;
            String ingredients;

            switch (option){
                case 1:
                    System.out.print("Capacity: ");
                    capacity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingredients: ");
                    ingredients = scanner.nextLine();
                    System.out.print("Alcohol strength: ");
                    double alcoholStrength = scanner.nextDouble();
                    scanner.nextLine();

                    Beer beer = new Beer(capacity,ingredients,alcoholStrength);
                    drinkCompanyRepo.add(beer);
                    break;
                case 2:
                    System.out.print("Capacity: ");
                    capacity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingredients: ");
                    ingredients = scanner.nextLine();
                    System.out.print("Type: ");
                    String type = scanner.nextLine();

                    Water water = new Water(capacity,ingredients,type);
                    drinkCompanyRepo.add(water);
                    break;
                case 3:
                    drinkCompanyRepo.displayAll();
                    break;
            }
        } while (option != 0);
        scanner.close();
    }
}

