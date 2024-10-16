package pckg_wildcard;

import java.util.List;

public class ListClass2 {

    public <E> void addNewElement(E element, List<E> lista) {
        lista.add(element);
        System.out.println("Element added");
    }

    public <E> void listAllElements(List<E> lista) {
        for (E element : lista) {
            System.out.println(element);
        }
    }
}
