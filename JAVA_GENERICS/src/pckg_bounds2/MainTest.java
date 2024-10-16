package pckg_bounds2;

public class MainTest {

    public static void main(String[] args) {

        // Mozemo usporedivati samo objekte koji implementiraju Comparable<T> interface
        CompareTwo<Integer> compareTwoNumbers = new CompareTwo<>(3622, 3622);
        compareTwoNumbers.compareTwo();
        String firstString = "Hello";
        String secondString = "World";
        CompareTwo<String> compareTwoStrings = new CompareTwo<>(firstString, secondString);
        compareTwoStrings.compareTwo();

        // Ovaj primjer ne radi jer klasa User ne extenda Comparable<T> interface [Compile time error]
        // Tek nakon implementacije Comparable<T> interface u klasi User, ovaj primjer ce raditi
        User user1 = new User("Karlo");
        User user2 = new User("Juraj");
        CompareTwo<User> compareUsers = new CompareTwo<>(user1, user2);
        compareUsers.compareTwo();
    }
}
