package vjezba7.zadatak1;

public class User {

    private String name;
    private int id;
    private static int cntID = 100;

    public User(String name) {
        this.name = name;
        this.id = cntID++;
    }

    public void makeBooking(Apartment apartment) {
        System.out.println("User " + name + " has booked an apartment in " + apartment.getLocation());
    }

    public void cancelBooking(Apartment apartment) {
        System.out.println("User " + name + " has canceled the booking for an apartment in " + apartment.getLocation());
    }

    public void makePayment() {
        System.out.println("User " + name + " has made a payment.");
    }

    public void leaveCommentOnAccomondation(Apartment apartment) {
        System.out.println("User " + name + " has left a comment on the apartment in " + apartment.getLocation());
    }
}
