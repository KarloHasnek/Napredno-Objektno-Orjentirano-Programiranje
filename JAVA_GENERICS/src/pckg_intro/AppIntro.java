package pckg_intro;

import java.util.ArrayList;

public class AppIntro {

    public static void main(String[] args) {
        ArrayList<User> lst = new ArrayList();
//        lst.add(100);
//        lst.add("Something");
//        lst.add(20.5);
//        lst.add(2E11);
        lst.add(new User("user1"));
        lst.add(new User("user2"));
        lst.add(new User("user3"));

        listElements(lst);
        listElements2(lst);
    }

    private static void listElements(ArrayList lista) {
        int length = lista.size();

        for (int i = 0; i < length; i++) {
            System.out.println(lista.get(i));
        }
    }

    private static void listElements2 (ArrayList<User> lista) {
        for (User user: lista) {
            System.out.println(user);
        }
    }
}
