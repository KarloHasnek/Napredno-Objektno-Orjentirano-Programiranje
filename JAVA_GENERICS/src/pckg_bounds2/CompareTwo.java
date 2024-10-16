package pckg_bounds2;

public class CompareTwo <T extends Comparable<T>> {

    private T first;
    private T second;

    public CompareTwo(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public void compareTwo() {
        if (first.compareTo(second) > 0) {
            System.out.println("The first object is greater than the second object.");
        } else if ( first.compareTo(second) < 0) {
            System.out.println("The first object is less than the second object.");
        } else {
            System.out.println("Objects are equal.");
        }
    }
}
