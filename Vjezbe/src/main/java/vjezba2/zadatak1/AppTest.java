package vjezba2.zadatak1;

public class AppTest {

    public static void main(String[] args) {

        OnlineStore store = new OnlineStore("Online store");
        Customer cust1 = new Customer("First customer");
        Customer cust2 = new Customer("Second customer");
        store.setItemAvailability(new Item("Nike patike", "Sneakers"));
        store.add2AvailLst(cust1);
        store.add2AvailLst(cust2);
        store.notifyCsts();
    }
}
