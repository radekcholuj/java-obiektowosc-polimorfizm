public class Author {
    private String authorName;
    private String authorSurname;
    Address address;

    public Author(String authorName,String authorSurname, Address address) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.address = address;
    }

    public void display(){
        System.out.println("Name: " + authorName);
        System.out.println("Surname: " + authorSurname);
        address.display();
    }
}
