public class Producer {
    private String companyName;
    private String NIP;
    private Address address;

    public Producer(String companyName, String NIP, Address address) {
        this.companyName = companyName;
        this.NIP = NIP;
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + companyName);
        System.out.println("NIP: " + NIP);
        address.display();
    }
}

