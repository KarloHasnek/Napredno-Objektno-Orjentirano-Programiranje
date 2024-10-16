package pckg_wildcard;

import java.util.ArrayList;
import java.util.List;

public class MultiListClass <E> {

    private final List<E> lista;

    public MultiListClass() {
        this.lista = new ArrayList<>();
    }

    public MultiListClass(List<E> lista) {
        this.lista = lista;
    }

    public void listAllElements() {
        if (lista.isEmpty()) {
            System.out.println("List is empty");
        } else {
            for (E element : lista) {
                System.out.println(element);
            }
        }
    }

    public void compareTwoLists(List<?> anotherList) {
        System.out.println( ( lista.size() > anotherList.size() ) );
    }
}
