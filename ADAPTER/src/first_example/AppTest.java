package first_example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppTest {

    public static void main(String[] args) {
        String[] array = {"a", "b", "c"};
        List<String> lista = Arrays.asList(array);
        ArrayList<String> arrayList = new ArrayList<>(lista);
        Client<String> client1 = new Client<>(arrayList.iterator());
        client1.someInfo();
        client1.removeFetchedElement();
        client1.someInfo();
    }
}
