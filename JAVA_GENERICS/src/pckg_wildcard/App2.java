package pckg_wildcard;

import java.util.List;

public class App2 {

    public static void main(String[] args) {

        ListClass<Integer> list1 = new ListClass<>();

        list1.addNewElement(1);
        list1.addNewElement(2);
        list1.addNewElement(3);
        list1.addNewElement(2);
        list1.listAllElements();

        ListClass2 list2 = new ListClass2();
        list2.addNewElement(new Integer(10), );
    }
}
