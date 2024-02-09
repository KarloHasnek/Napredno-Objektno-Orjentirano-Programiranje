package vjezba7.zadatak1;

public class App {

    public static void main(String[] args) {

        Apartment apartment1 = new Apartment("Zagreb", "A");
        Apartment apartment2 = new Apartment("Split", "B");
        Apartment apartment3 = new Apartment("Zadar", "C");

        User user1 = new User("Karlo");

        user1.makeBooking(apartment1);
        user1.makePayment();
        user1.leaveCommentOnAccomondation(apartment1);
        user1.cancelBooking(apartment1);

    }
}
