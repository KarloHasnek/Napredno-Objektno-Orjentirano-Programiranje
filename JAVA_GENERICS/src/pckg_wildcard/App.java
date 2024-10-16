package pckg_wildcard;

import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Integer> lista = List.of(1, 2, 3, 4, 5);
        MultiListClass<Integer> list1 = new MultiListClass<>(lista);
        List<Integer> lista2 = List.of(1, 2, 3, 4, 5, 6);
        MultiListClass<Integer> list2 = new MultiListClass<>(lista2);

//        list1.listAllElements();
//        list2.listAllElements();

        list1.compareTwoLists(lista2);

    }
}
