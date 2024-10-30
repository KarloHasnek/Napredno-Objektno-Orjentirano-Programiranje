package first_example;

import java.util.Iterator;

public class Client <E> {

    private Iterator<E> iterator;

    public Client(Iterator<E> iter) {
        this.iterator = iter;
    }

    public void someInfo() {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void removeFetchedElement(){
        if (iterator.hasNext()) {
            E element = iterator.next();
            System.out.println("Fetched element: " + element);
            iterator.remove();
            System.out.println("Element removed.");
        } else {
            System.out.println("No more elements to fetch.");
        }
    }
}
