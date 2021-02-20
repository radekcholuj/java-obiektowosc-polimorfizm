public class ToyShop {
    private Toy[] toys = new Toy[20];
    private int indexToy = 0;

    public void add(Toy toy){
        if(indexToy < toys.length) {
            toys[indexToy++] = toy;
        }
    }

    public void displayAll(){
        for (int i = 0; i < indexToy; i++) {
            toys[i].display();
        }
    }

}