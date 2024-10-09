package pckg_intro;

import java.util.ArrayList;

public class AppSecond {

    public static void main(String[] args) {
        ArrayList<String> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        ArrayList<User> lista3 = new ArrayList<>();

        lista1.add("String1");
        lista1.add("String2");
        lista2.add(100);
        lista2.add(200);
        lista3.add(new User("user1"));
        lista3.add(new User("user2"));

        // losa praksa
        AUX_CLS.listStrings(lista1);
        AUX_CLS.listIntegers(lista2);
        AUX_CLS.listUsers(lista3);
        System.out.println("--------------------------------------");
        // parametrizacija
        AUX_CLS.listElements(lista1);
        AUX_CLS.listElements(lista2);
        AUX_CLS.listElements(lista3);
    }
}
