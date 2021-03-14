public class DrinkRepo {
    Drink [] drinks = new Drink[20];
    private int drinkIndex = 0;

    public void add (Drink drink){
        if(drinkIndex < drinks.length){
            drinks[drinkIndex++] = drink;
        }
    }

    public void displayAll(){
        for (int i = 0; i < drinkIndex; i++) {
            drinks[i].display();
        }
    }
}

