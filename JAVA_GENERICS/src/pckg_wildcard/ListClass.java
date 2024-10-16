package pckg_wildcard;

import java.util.ArrayList;
import java.util.List;

public class ListClass <T extends Number>{

    private List<T> lista;

    public ListClass() {
        this.lista = new ArrayList<>();
    }

    public void addNewElement(T element) {
        lista.add(element);
    }

    public void listAllElements() {
        for (T element : lista) {
            System.out.println(element);
        }
    }
}
